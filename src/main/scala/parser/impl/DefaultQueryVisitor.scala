package parser.impl

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import managers.DatabaseManager
import org.antlr.v4.runtime.tree.ParseTree
import parser.{QueryBaseVisitor, QueryParser}
import collection.JavaConverters._

/**
  * Created by Kamil Radziszewski on 27.05.18.
  */
class DefaultQueryVisitor extends QueryBaseVisitor[AnyRef] {

  val objectMapper = new ObjectMapper

  var dataset = ""
  var key = ""
  var data = ""
  var entry = ""

  var isSelect = false
  var isInsert = false
  var isDelete = false
  var isKeyValue = false
  var isEntry = false
  var whereClause = false

  var queriedData: Map[String, AnyRef] = _
  var booleanResult: Map[String, Boolean] = Map()

  override def visitSelectKeyStatement(ctx: QueryParser.SelectKeyStatementContext): AnyRef = {
    isSelect = true
    isKeyValue = true
    key = ctx.IDENTIFIER().get(0).getSymbol.getText
    dataset = ctx.IDENTIFIER().get(1).getSymbol.getText
    super.visitSelectKeyStatement(ctx)
  }

  override def visitInsertKeyStatement(ctx: QueryParser.InsertKeyStatementContext): AnyRef = {
    isInsert = true
    isKeyValue = true
    key = ctx.IDENTIFIER().get(0).getSymbol.getText
    dataset = ctx.IDENTIFIER().get(1).getSymbol.getText
    super.visitInsertKeyStatement(ctx)
  }

  override def visitDeleteKeyStatement(ctx: QueryParser.DeleteKeyStatementContext): AnyRef = {
    isDelete = true
    isKeyValue = true
    key = ctx.IDENTIFIER().get(0).getSymbol.getText
    dataset = ctx.IDENTIFIER().get(1).getSymbol.getText
    super.visitDeleteKeyStatement(ctx)
  }

  override def visitSelectEntryStatement(ctx: QueryParser.SelectEntryStatementContext): AnyRef = {
    isSelect = true
    isEntry = true
    dataset = ctx.IDENTIFIER(1).getText
    super.visitSelectEntryStatement(ctx)
  }

  override def visitSelectEntryStatementWithWhere(ctx: QueryParser.SelectEntryStatementWithWhereContext): AnyRef = {
    isSelect = true
    isEntry = true
    whereClause = true
    dataset = ctx.IDENTIFIER(1).getText
    val serializedData = DatabaseManager.getEntry(dataset)
    val deserializedJavaMap = objectMapper.readValue(serializedData, classOf[java.util.Map[String, AnyRef]])
    queriedData = Map(deserializedJavaMap.asScala.toSeq: _*)
    booleanResult = queriedData.map((k) => k._1 -> false)
    val matchedData = super.visit(ctx.whereExpression()).asInstanceOf[Map[String, Boolean]]
    queriedData.filter(data => matchedData(data._1))
  }

  override def visitInsertEntryStatement(ctx: QueryParser.InsertEntryStatementContext): AnyRef = {
    isInsert = true
    isEntry = true
    entry = ctx.json().getText
    dataset = ctx.IDENTIFIER().getText
    super.visitInsertEntryStatement(ctx)
  }

  override def visitDeleteEntryStatement(ctx: QueryParser.DeleteEntryStatementContext): AnyRef = {
    isDelete = true
    isEntry = true
    dataset = ctx.IDENTIFIER.getText
    super.visitDeleteEntryStatement(ctx)
  }

  override def visitBinaryExpression(ctx: QueryParser.BinaryExpressionContext): AnyRef = {
    if (ctx.op.AND() != null) {
      ctx.left.asInstanceOf[Map[String, Boolean]].map(k => k._1 -> (k._2 && ctx.right.asInstanceOf[Map[String, Boolean]](k._1)))
    } else if (ctx.op.OR() != null) {
      ctx.left.asInstanceOf[Map[String, Boolean]].map(k => k._1 -> (k._2 || ctx.right.asInstanceOf[Map[String, Boolean]](k._1)))
    } else {
      throw new IllegalArgumentException("Binary operator not implemented: " + ctx.op.getText)
    }
  }

  override def visitDecimalExpression(ctx: QueryParser.DecimalExpressionContext): AnyRef = {
    queriedData.map(k => k._1 -> ctx.DECIMAL().getText.toDouble)
  }

  override def visitStringExpression(ctx: QueryParser.StringExpressionContext): AnyRef = {
    val str = ctx.STRING().getText
    queriedData.map(data => data._1 -> str.substring(1, str.length - 1))
  }

  override def visitBoolExpression(ctx: QueryParser.BoolExpressionContext): AnyRef = {
    queriedData.map(k => k._1 -> ctx.getText.toBoolean)
  }

  override def visitIdentifierExpression(ctx: QueryParser.IdentifierExpressionContext): AnyRef = {
    val id = ctx.IDENTIFIER().getText
    queriedData.map(m => {
      if (m._2.asInstanceOf[java.util.Map[AnyRef, AnyRef]].containsKey(id)) {
        m._1 -> m._2.asInstanceOf[java.util.Map[AnyRef, AnyRef]].get(id)
      } else {
        m._1 -> null
      }
    })
  }

  override def visitNotExpression(ctx: QueryParser.NotExpressionContext): AnyRef = {
    this.visit(ctx.whereExpression()).asInstanceOf[Map[String, Boolean]].map(k => k._1 -> !k._2)
  }

  override def visitParenExpression(ctx: QueryParser.ParenExpressionContext): AnyRef = {
    super.visitParenExpression(ctx)
  }

  override def visitComparatorExpression(ctx: QueryParser.ComparatorExpressionContext): AnyRef = {
    val rightValues = this.visit(ctx.right).asInstanceOf[Map[String, AnyRef]]

    if (ctx.op.EQ != null) this.visit(ctx.left).asInstanceOf[Map[String, AnyRef]].map(k => k._1 -> (k._2 != null && rightValues(k._1) != null && (compare(k._2, rightValues(k._1)) == 0)))
    else if (ctx.op.LE != null) this.visit(ctx.left).asInstanceOf[Map[String, AnyRef]].map(k => k._1 -> (k._2 != null && rightValues(k._1) != null && (compare(k._2, rightValues(k._1)) <= 0)))
    else if (ctx.op.GE != null) this.visit(ctx.left).asInstanceOf[Map[String, AnyRef]].map(k => k._1 -> (k._2 != null && rightValues(k._1) != null && (compare(k._2, rightValues(k._1)) >= 0)))
    else if (ctx.op.LT != null) this.visit(ctx.left).asInstanceOf[Map[String, AnyRef]].map(k => k._1 -> (k._2 != null && rightValues(k._1) != null && (compare(k._2, rightValues(k._1)) < 0)))
    else if (ctx.op.GT != null) this.visit(ctx.left).asInstanceOf[Map[String, AnyRef]].map(k => k._1 -> (k._2 != null && rightValues(k._1) != null && (compare(k._2, rightValues(k._1)) > 0)))
    else throw new RuntimeException("Comparator operator not implemented " + ctx.op.getText)
  }

  override def visitJson(ctx: QueryParser.JsonContext): AnyRef = {
    data = ctx.children.get(0).getText
    super.visitJson(ctx)
  }

  private def asBoolean(ctx: ParseTree) = visit(ctx).asInstanceOf[Boolean]

  private def asDouble(ctx: ParseTree) = visit(ctx).asInstanceOf[Double]

  private def compare(first: AnyRef, second: AnyRef): Int = {
    if (first.getClass != second.getClass) {
      throw new IllegalArgumentException(s"Values: [$first] and [$second] are not in the same type")
    } else first match {
      case _: String =>
        first.asInstanceOf[String].compare(second.asInstanceOf[String])
      case _: Number =>
        first.asInstanceOf[Number].doubleValue().compare(second.asInstanceOf[Number].doubleValue())
      case _ =>
        throw new IllegalArgumentException(s"Illegal argument type of the value: $first")
    }
  }
}
