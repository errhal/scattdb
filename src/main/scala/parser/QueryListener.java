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
}