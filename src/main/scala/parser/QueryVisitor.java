// Generated from /home/kamil/scattdb/src/main/scala/parser/Query.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueryParser#queryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStatement(QueryParser.QueryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#selectKeyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectKeyStatement(QueryParser.SelectKeyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#insertKeyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertKeyStatement(QueryParser.InsertKeyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#deleteKeyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteKeyStatement(QueryParser.DeleteKeyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#selectEntryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectEntryStatement(QueryParser.SelectEntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#selectEntryStatementWithWhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectEntryStatementWithWhere(QueryParser.SelectEntryStatementWithWhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#insertEntryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertEntryStatement(QueryParser.InsertEntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#deleteEntryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteEntryStatement(QueryParser.DeleteEntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(QueryParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(QueryParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(QueryParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(QueryParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(QueryParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(QueryParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link QueryParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(QueryParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(QueryParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(QueryParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(QueryParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#dataVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataVal(QueryParser.DataValContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(QueryParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(QueryParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(QueryParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(QueryParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QueryParser.ValueContext ctx);
}