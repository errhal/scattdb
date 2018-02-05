// Generated from /home/kamil/scattdb/src/main/scala/parser/Query.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void enterQueryStatement(QueryParser.QueryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void exitQueryStatement(QueryParser.QueryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#selectKeyStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectKeyStatement(QueryParser.SelectKeyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#selectKeyStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectKeyStatement(QueryParser.SelectKeyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#insertKeyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertKeyStatement(QueryParser.InsertKeyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#insertKeyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertKeyStatement(QueryParser.InsertKeyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#deleteKeyStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteKeyStatement(QueryParser.DeleteKeyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#deleteKeyStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteKeyStatement(QueryParser.DeleteKeyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#selectEntryStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectEntryStatement(QueryParser.SelectEntryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#selectEntryStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectEntryStatement(QueryParser.SelectEntryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#insertEntryStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertEntryStatement(QueryParser.InsertEntryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#insertEntryStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertEntryStatement(QueryParser.InsertEntryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#dataVal}.
	 * @param ctx the parse tree
	 */
	void enterDataVal(QueryParser.DataValContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#dataVal}.
	 * @param ctx the parse tree
	 */
	void exitDataVal(QueryParser.DataValContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(QueryParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(QueryParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(QueryParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(QueryParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(QueryParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(QueryParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(QueryParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(QueryParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QueryParser.ValueContext ctx);
}