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
    key = ctx.NAME().get(0).getSymbol.getText
    dataset = ctx.NAME().get(1).getSymbol.getText
  }

  override def exitSelectKeyStatement(ctx: QueryParser.SelectKeyStatementContext): Unit = {}

  override def enterInsertKeyStatement(ctx: QueryParser.InsertKeyStatementContext): Unit = {
    isInsert = true
    isKeyValue = true
    key = ctx.NAME().get(0).getSymbol.getText
    dataset = ctx.NAME().get(1).getSymbol.getText
  }

  override def exitInsertKeyStatement(ctx: QueryParser.InsertKeyStatementContext): Unit = {}

  override def enterDeleteKeyStatement(ctx: QueryParser.DeleteKeyStatementContext): Unit = {
    isDelete = true
    isKeyValue = true
    key = ctx.NAME().get(0).getSymbol.getText
    dataset = ctx.NAME().get(1).getSymbol.getText
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
    dataset = ctx.NAME(1).getText
  }

  override def exitSelectEntryStatement(ctx: QueryParser.SelectEntryStatementContext): Unit = {}

  override def enterInsertEntryStatement(ctx: QueryParser.InsertEntryStatementContext): Unit = {
    isInsert = true
    isEntry = true
    entry = ctx.children.get(5).getText
    dataset = ctx.children.get(8).getText
  }

  override def exitInsertEntryStatement(ctx: QueryParser.InsertEntryStatementContext): Unit = {}
}
