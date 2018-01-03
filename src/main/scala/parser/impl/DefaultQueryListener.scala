package parser.impl

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ErrorNode, TerminalNode}
import parser.{QueryListener, QueryParser}

class DefaultQueryListener extends QueryListener {

  var dataset = ""
  var key = ""

  var isSelect = false
  var isKeyValue = false


  override def exitEveryRule(ctx: ParserRuleContext): Unit = {}

  override def visitErrorNode(node: ErrorNode): Unit = {}

  override def visitTerminal(node: TerminalNode): Unit = {}

  override def enterEveryRule(ctx: ParserRuleContext): Unit = {}

  /**
    * Enter a parse tree produced by {@link QueryParser#queryStatement}.
    *
    * @param ctx the parse tree
    */
  override def enterQueryStatement(ctx: QueryParser.QueryStatementContext): Unit = {}

  /**
    * Exit a parse tree produced by {@link QueryParser#queryStatement}.
    *
    * @param ctx the parse tree
    */
  override def exitQueryStatement(ctx: QueryParser.QueryStatementContext): Unit = {}

  /**
    * Enter a parse tree produced by {@link QueryParser#selectKeyStatement}.
    *
    * @param ctx the parse tree
    */
  override def enterSelectKeyStatement(ctx: QueryParser.SelectKeyStatementContext): Unit = {
    isSelect = true
    isKeyValue = true
    key = ctx.NAME().get(0).getSymbol.getText
    dataset = ctx.NAME().get(1).getSymbol.getText
  }

  /**
    * Exit a parse tree produced by {@link QueryParser#selectKeyStatement}.
    *
    * @param ctx the parse tree
    */
  override def exitSelectKeyStatement(ctx: QueryParser.SelectKeyStatementContext): Unit = {}
}
