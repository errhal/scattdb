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
	 * Enter a parse tree produced by {@link QueryParser#selectEntryStatementWithWhere}.
	 * @param ctx the parse tree
	 */
	void enterSelectEntryStatementWithWhere(QueryParser.SelectEntryStatementWithWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#selectEntryStatementWithWhere}.
	 * @param ctx the parse tree
	 */
	void exitSelectEntryStatementWithWhere(QueryParser.SelectEntryStatementWithWhereContext ctx);
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
	 * Enter a parse tree produced by {@link QueryParser#deleteEntryStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteEntryStatement(QueryParser.DeleteEntryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#deleteEntryStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteEntryStatement(QueryParser.DeleteEntryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(QueryParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(QueryParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(QueryParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(QueryParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(QueryParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(QueryParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(QueryParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(QueryParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(QueryParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(QueryParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(QueryParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(QueryParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparatorExpression(QueryParser.ComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparatorExpression(QueryParser.ComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(QueryParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(QueryParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(QueryParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(QueryParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(QueryParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(QueryParser.BoolContext ctx);
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