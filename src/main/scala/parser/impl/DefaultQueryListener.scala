package parser.impl

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ErrorNode, TerminalNode}
import parser.{QueryListener, QueryParser}

class DefaultQueryListener extends QueryListener {

  var dataset = ""
  var key = ""
  var data = ""
  var entry = ""

  var isSelect = false
  var isInsert = false
  var isDelete = false
  var isKeyValue = false
  var isEntry = false


  override def exitEveryRule(ctx: ParserRuleContext): Unit = {}

  override def visitErrorNode(node: ErrorNode): Unit = {}

  override def visitTerminal(node: TerminalNode): Unit = {}

  override def enterEveryRule(ctx: ParserRuleContext): Unit = {}

  override def enterSelectKeyStatement(ctx: QueryParser.SelectKeyStatementContext): Unit = {
    isSelect = true
    isKeyValue = true
    key = ctx.IDENTIFIER().get(0).getSymbol.getText
    dataset = ctx.IDENTIFIER().get(1).getSymbol.getText
  }

  override def exitSelectKeyStatement(ctx: QueryParser.SelectKeyStatementContext): Unit = {}

  override def enterInsertKeyStatement(ctx: QueryParser.InsertKeyStatementContext): Unit = {
    isInsert = true
    isKeyValue = true
    key = ctx.IDENTIFIER().get(0).getSymbol.getText
    dataset = ctx.IDENTIFIER().get(1).getSymbol.getText
  }

  override def exitInsertKeyStatement(ctx: QueryParser.InsertKeyStatementContext): Unit = {}

  override def enterDeleteKeyStatement(ctx: QueryParser.DeleteKeyStatementContext): Unit = {
    isDelete = true
    isKeyValue = true
    key = ctx.IDENTIFIER().get(0).getSymbol.getText
    dataset = ctx.IDENTIFIER().get(1).getSymbol.getText
  }

  override def exitDeleteKeyStatement(ctx: QueryParser.DeleteKeyStatementContext): Unit = {}

  override def enterQueryStatement(ctx: QueryParser.QueryStatementContext): Unit = {}

  override def exitQueryStatement(ctx: QueryParser.QueryStatementContext): Unit = {}

  override def enterDataVal(ctx: QueryParser.DataValContext): Unit = {}

  override def exitDataVal(ctx: QueryParser.DataValContext): Unit = {}

  override def enterJson(ctx: QueryParser.JsonContext): Unit = {
    data = ctx.children.get(0).getText
  }

  override def exitJson(ctx: QueryParser.JsonContext): Unit = {}

  override def enterObj(ctx: QueryParser.ObjContext): Unit = {}

  override def exitObj(ctx: QueryParser.ObjContext): Unit = {}

  override def enterPair(ctx: QueryParser.PairContext): Unit = {}

  override def exitPair(ctx: QueryParser.PairContext): Unit = {}

  override def enterArray(ctx: QueryParser.ArrayContext): Unit = {}

  override def exitArray(ctx: QueryParser.ArrayContext): Unit = {}

  override def enterValue(ctx: QueryParser.ValueContext): Unit = {}

  override def exitValue(ctx: QueryParser.ValueContext): Unit = {}

  override def enterSelectEntryStatement(ctx: QueryParser.SelectEntryStatementContext): Unit = {
    isSelect = true
    isEntry = true
    dataset = ctx.IDENTIFIER(1).getText
  }

  override def exitSelectEntryStatement(ctx: QueryParser.SelectEntryStatementContext): Unit = {}

  override def enterInsertEntryStatement(ctx: QueryParser.InsertEntryStatementContext): Unit = {
    isInsert = true
    isEntry = true
    entry = ctx.children.get(5).getText
    dataset = ctx.children.get(8).getText
  }

  override def exitInsertEntryStatement(ctx: QueryParser.InsertEntryStatementContext): Unit = {}

  override def enterDeleteEntryStatement(ctx: QueryParser.DeleteEntryStatementContext): Unit = {
    isDelete = true
    isEntry = true
    dataset = ctx.IDENTIFIER.getText
  }

  override def exitDeleteEntryStatement(ctx: QueryParser.DeleteEntryStatementContext): Unit = {}

  override def enterSelectEntryStatementWithWhere(ctx: QueryParser.SelectEntryStatementWithWhereContext): Unit = ???

  override def exitSelectEntryStatementWithWhere(ctx: QueryParser.SelectEntryStatementWithWhereContext): Unit = ???

  override def enterBinaryExpression(ctx: QueryParser.BinaryExpressionContext): Unit = ???

  override def exitBinaryExpression(ctx: QueryParser.BinaryExpressionContext): Unit = ???

  override def enterDecimalExpression(ctx: QueryParser.DecimalExpressionContext): Unit = ???

  override def exitDecimalExpression(ctx: QueryParser.DecimalExpressionContext): Unit = ???

  override def enterBoolExpression(ctx: QueryParser.BoolExpressionContext): Unit = ???

  override def exitBoolExpression(ctx: QueryParser.BoolExpressionContext): Unit = ???

  override def enterIdentifierExpression(ctx: QueryParser.IdentifierExpressionContext): Unit = ???

  override def exitIdentifierExpression(ctx: QueryParser.IdentifierExpressionContext): Unit = ???

  override def enterNotExpression(ctx: QueryParser.NotExpressionContext): Unit = ???

  override def exitNotExpression(ctx: QueryParser.NotExpressionContext): Unit = ???

  override def enterParenExpression(ctx: QueryParser.ParenExpressionContext): Unit = ???

  override def exitParenExpression(ctx: QueryParser.ParenExpressionContext): Unit = ???

  override def enterComparatorExpression(ctx: QueryParser.ComparatorExpressionContext): Unit = ???

  override def exitComparatorExpression(ctx: QueryParser.ComparatorExpressionContext): Unit = ???

  override def enterComparator(ctx: QueryParser.ComparatorContext): Unit = ???

  override def exitComparator(ctx: QueryParser.ComparatorContext): Unit = ???

  override def enterBinary(ctx: QueryParser.BinaryContext): Unit = ???

  override def exitBinary(ctx: QueryParser.BinaryContext): Unit = ???

  override def enterBool(ctx: QueryParser.BoolContext): Unit = ???

  override def exitBool(ctx: QueryParser.BoolContext): Unit = ???
}
