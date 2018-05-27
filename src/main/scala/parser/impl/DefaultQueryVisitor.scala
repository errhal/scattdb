package parser.impl

import managers.DatabaseManager
import parser.{QueryBaseVisitor, QueryParser}

/**
  * Created by Kamil Radziszewski on 27.05.18.
  */
class DefaultQueryVisitor extends QueryBaseVisitor[AnyRef] {

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

  var queriedData:AnyRef = Map()

  override def visitQueryStatement(ctx: QueryParser.QueryStatementContext): AnyRef = {
    super.visitQueryStatement(ctx)
  }

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
    dataset = ctx.IDENTIFIER(1).getText
    queriedData = DatabaseManager.getEntry(dataset)
    super.visitSelectEntryStatementWithWhere(ctx)
  }

  override def visitInsertEntryStatement(ctx: QueryParser.InsertEntryStatementContext): AnyRef = {
    isInsert = true
    isEntry = true
    entry = ctx.children.get(5).getText
    dataset = ctx.children.get(8).getText
    super.visitInsertEntryStatement(ctx)
  }

  override def visitDeleteEntryStatement(ctx: QueryParser.DeleteEntryStatementContext): AnyRef = {
    isDelete = true
    isEntry = true
    dataset = ctx.IDENTIFIER.getText
    super.visitDeleteEntryStatement(ctx)
  }

  override def visitJson(ctx: QueryParser.JsonContext): AnyRef = {
    data = ctx.children.get(0).getText
    super.visitJson(ctx)
  }
}
