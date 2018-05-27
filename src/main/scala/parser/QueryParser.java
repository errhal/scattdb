// Generated from /home/kamil/scattdb/src/main/scala/parser/Query.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUERY=10, SELECT=11, INSERT=12, DELETE=13, KEY=14, ENTRY=15, INTO=16, 
		FROM=17, DATA=18, WHERE=19, AND=20, OR=21, NOT=22, TRUE=23, FALSE=24, 
		GT=25, GE=26, LT=27, LE=28, EQ=29, LPAREN=30, RPAREN=31, DECIMAL=32, IDENTIFIER=33, 
		STRING=34, NUMBER=35, WS=36;
	public static final int
		RULE_queryStatement = 0, RULE_selectKeyStatement = 1, RULE_insertKeyStatement = 2, 
		RULE_deleteKeyStatement = 3, RULE_selectEntryStatement = 4, RULE_selectEntryStatementWithWhere = 5, 
		RULE_insertEntryStatement = 6, RULE_deleteEntryStatement = 7, RULE_whereExpression = 8, 
		RULE_comparator = 9, RULE_binary = 10, RULE_bool = 11, RULE_dataVal = 12, 
		RULE_json = 13, RULE_obj = 14, RULE_pair = 15, RULE_array = 16, RULE_value = 17;
	public static final String[] ruleNames = {
		"queryStatement", "selectKeyStatement", "insertKeyStatement", "deleteKeyStatement", 
		"selectEntryStatement", "selectEntryStatementWithWhere", "insertEntryStatement", 
		"deleteEntryStatement", "whereExpression", "comparator", "binary", "bool", 
		"dataVal", "json", "obj", "pair", "array", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'{'", "','", "'}'", "':'", "'true'", "'false'", "'null'", 
		null, null, null, null, null, null, null, null, null, null, "'AND'", "'OR'", 
		"'NOT'", "'TRUE'", "'FALSE'", "'>'", "'>='", "'<'", "'<='", "'='", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "QUERY", "SELECT", 
		"INSERT", "DELETE", "KEY", "ENTRY", "INTO", "FROM", "DATA", "WHERE", "AND", 
		"OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", "EQ", "LPAREN", 
		"RPAREN", "DECIMAL", "IDENTIFIER", "STRING", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryStatementContext extends ParserRuleContext {
		public SelectKeyStatementContext selectKeyStatement() {
			return getRuleContext(SelectKeyStatementContext.class,0);
		}
		public InsertKeyStatementContext insertKeyStatement() {
			return getRuleContext(InsertKeyStatementContext.class,0);
		}
		public DeleteKeyStatementContext deleteKeyStatement() {
			return getRuleContext(DeleteKeyStatementContext.class,0);
		}
		public SelectEntryStatementContext selectEntryStatement() {
			return getRuleContext(SelectEntryStatementContext.class,0);
		}
		public SelectEntryStatementWithWhereContext selectEntryStatementWithWhere() {
			return getRuleContext(SelectEntryStatementWithWhereContext.class,0);
		}
		public InsertEntryStatementContext insertEntryStatement() {
			return getRuleContext(InsertEntryStatementContext.class,0);
		}
		public DeleteEntryStatementContext deleteEntryStatement() {
			return getRuleContext(DeleteEntryStatementContext.class,0);
		}
		public QueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitQueryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStatementContext queryStatement() throws RecognitionException {
		QueryStatementContext _localctx = new QueryStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStatement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				selectKeyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				insertKeyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				deleteKeyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				selectEntryStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				selectEntryStatementWithWhere();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				insertEntryStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				deleteEntryStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectKeyStatementContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode SELECT() { return getToken(QueryParser.SELECT, 0); }
		public TerminalNode KEY() { return getToken(QueryParser.KEY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(QueryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(QueryParser.IDENTIFIER, i);
		}
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public SelectKeyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectKeyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitSelectKeyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectKeyStatementContext selectKeyStatement() throws RecognitionException {
		SelectKeyStatementContext _localctx = new SelectKeyStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectKeyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(QUERY);
			setState(46);
			match(T__0);
			setState(47);
			match(SELECT);
			setState(48);
			match(KEY);
			setState(49);
			match(LPAREN);
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(RPAREN);
			setState(52);
			match(FROM);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertKeyStatementContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode INSERT() { return getToken(QueryParser.INSERT, 0); }
		public TerminalNode KEY() { return getToken(QueryParser.KEY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(QueryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(QueryParser.IDENTIFIER, i);
		}
		public TerminalNode INTO() { return getToken(QueryParser.INTO, 0); }
		public DataValContext dataVal() {
			return getRuleContext(DataValContext.class,0);
		}
		public InsertKeyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertKeyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitInsertKeyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertKeyStatementContext insertKeyStatement() throws RecognitionException {
		InsertKeyStatementContext _localctx = new InsertKeyStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertKeyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(QUERY);
			setState(57);
			match(T__0);
			setState(58);
			match(INSERT);
			setState(59);
			match(KEY);
			setState(60);
			match(LPAREN);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(RPAREN);
			setState(63);
			match(INTO);
			setState(64);
			match(IDENTIFIER);
			setState(65);
			dataVal();
			setState(66);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteKeyStatementContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode DELETE() { return getToken(QueryParser.DELETE, 0); }
		public TerminalNode KEY() { return getToken(QueryParser.KEY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(QueryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(QueryParser.IDENTIFIER, i);
		}
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public DeleteKeyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteKeyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitDeleteKeyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteKeyStatementContext deleteKeyStatement() throws RecognitionException {
		DeleteKeyStatementContext _localctx = new DeleteKeyStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deleteKeyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(QUERY);
			setState(69);
			match(T__0);
			setState(70);
			match(DELETE);
			setState(71);
			match(KEY);
			setState(72);
			match(LPAREN);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(RPAREN);
			setState(75);
			match(FROM);
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectEntryStatementContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode SELECT() { return getToken(QueryParser.SELECT, 0); }
		public TerminalNode ENTRY() { return getToken(QueryParser.ENTRY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(QueryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(QueryParser.IDENTIFIER, i);
		}
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public SelectEntryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEntryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitSelectEntryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectEntryStatementContext selectEntryStatement() throws RecognitionException {
		SelectEntryStatementContext _localctx = new SelectEntryStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(QUERY);
			setState(80);
			match(T__0);
			setState(81);
			match(SELECT);
			setState(82);
			match(ENTRY);
			setState(83);
			match(LPAREN);
			setState(84);
			match(IDENTIFIER);
			setState(85);
			match(RPAREN);
			setState(86);
			match(FROM);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectEntryStatementWithWhereContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode SELECT() { return getToken(QueryParser.SELECT, 0); }
		public TerminalNode ENTRY() { return getToken(QueryParser.ENTRY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(QueryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(QueryParser.IDENTIFIER, i);
		}
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(QueryParser.WHERE, 0); }
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public SelectEntryStatementWithWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEntryStatementWithWhere; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitSelectEntryStatementWithWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectEntryStatementWithWhereContext selectEntryStatementWithWhere() throws RecognitionException {
		SelectEntryStatementWithWhereContext _localctx = new SelectEntryStatementWithWhereContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectEntryStatementWithWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(QUERY);
			setState(91);
			match(T__0);
			setState(92);
			match(SELECT);
			setState(93);
			match(ENTRY);
			setState(94);
			match(LPAREN);
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(RPAREN);
			setState(97);
			match(FROM);
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(WHERE);
			setState(100);
			whereExpression(0);
			setState(101);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertEntryStatementContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode INSERT() { return getToken(QueryParser.INSERT, 0); }
		public TerminalNode ENTRY() { return getToken(QueryParser.ENTRY, 0); }
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public TerminalNode INTO() { return getToken(QueryParser.INTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(QueryParser.IDENTIFIER, 0); }
		public InsertEntryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertEntryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitInsertEntryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertEntryStatementContext insertEntryStatement() throws RecognitionException {
		InsertEntryStatementContext _localctx = new InsertEntryStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insertEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(QUERY);
			setState(104);
			match(T__0);
			setState(105);
			match(INSERT);
			setState(106);
			match(ENTRY);
			setState(107);
			match(LPAREN);
			setState(108);
			json();
			setState(109);
			match(RPAREN);
			setState(110);
			match(INTO);
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteEntryStatementContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(QueryParser.QUERY, 0); }
		public TerminalNode DELETE() { return getToken(QueryParser.DELETE, 0); }
		public TerminalNode ENTRY() { return getToken(QueryParser.ENTRY, 0); }
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(QueryParser.IDENTIFIER, 0); }
		public DeleteEntryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteEntryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitDeleteEntryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteEntryStatementContext deleteEntryStatement() throws RecognitionException {
		DeleteEntryStatementContext _localctx = new DeleteEntryStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deleteEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(QUERY);
			setState(115);
			match(T__0);
			setState(116);
			match(DELETE);
			setState(117);
			match(ENTRY);
			setState(118);
			match(FROM);
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereExpressionContext extends ParserRuleContext {
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
	 
		public WhereExpressionContext() { }
		public void copyFrom(WhereExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExpressionContext extends WhereExpressionContext {
		public WhereExpressionContext left;
		public BinaryContext op;
		public WhereExpressionContext right;
		public List<WhereExpressionContext> whereExpression() {
			return getRuleContexts(WhereExpressionContext.class);
		}
		public WhereExpressionContext whereExpression(int i) {
			return getRuleContext(WhereExpressionContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public BinaryExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalExpressionContext extends WhereExpressionContext {
		public TerminalNode DECIMAL() { return getToken(QueryParser.DECIMAL, 0); }
		public DecimalExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends WhereExpressionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends WhereExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(QueryParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends WhereExpressionContext {
		public TerminalNode NOT() { return getToken(QueryParser.NOT, 0); }
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public NotExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends WhereExpressionContext {
		public TerminalNode LPAREN() { return getToken(QueryParser.LPAREN, 0); }
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QueryParser.RPAREN, 0); }
		public ParenExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparatorExpressionContext extends WhereExpressionContext {
		public WhereExpressionContext left;
		public ComparatorContext op;
		public WhereExpressionContext right;
		public List<WhereExpressionContext> whereExpression() {
			return getRuleContexts(WhereExpressionContext.class);
		}
		public WhereExpressionContext whereExpression(int i) {
			return getRuleContext(WhereExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparatorExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		return whereExpression(0);
	}

	private WhereExpressionContext whereExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, _parentState);
		WhereExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_whereExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(LPAREN);
				setState(124);
				whereExpression(0);
				setState(125);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(NOT);
				setState(128);
				whereExpression(6);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				bool();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(IDENTIFIER);
				}
				break;
			case DECIMAL:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ComparatorExpressionContext(new WhereExpressionContext(_parentctx, _parentState));
						((ComparatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_whereExpression);
						setState(134);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(135);
						((ComparatorExpressionContext)_localctx).op = comparator();
						setState(136);
						((ComparatorExpressionContext)_localctx).right = whereExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new WhereExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_whereExpression);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139);
						((BinaryExpressionContext)_localctx).op = binary();
						setState(140);
						((BinaryExpressionContext)_localctx).right = whereExpression(5);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(QueryParser.GT, 0); }
		public TerminalNode GE() { return getToken(QueryParser.GE, 0); }
		public TerminalNode LT() { return getToken(QueryParser.LT, 0); }
		public TerminalNode LE() { return getToken(QueryParser.LE, 0); }
		public TerminalNode EQ() { return getToken(QueryParser.EQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(QueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(QueryParser.OR, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(QueryParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(QueryParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataValContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(QueryParser.DATA, 0); }
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public DataValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataVal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitDataVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValContext dataVal() throws RecognitionException {
		DataValContext _localctx = new DataValContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(DATA);
			setState(154);
			match(LPAREN);
			setState(155);
			json();
			setState(156);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_obj);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__2);
				setState(161);
				pair();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(162);
					match(T__3);
					setState(163);
					pair();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__2);
				setState(172);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(STRING);
			setState(176);
			match(T__5);
			setState(177);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__0);
				setState(180);
				value();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(181);
					match(T__3);
					setState(182);
					value();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__0);
				setState(191);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(QueryParser.NUMBER, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(NUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				obj();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return whereExpression_sempred((WhereExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean whereExpression_sempred(WhereExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0087\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094\13\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7"+
		"\20\u00a7\n\20\f\20\16\20\u00aa\13\20\3\20\3\20\3\20\3\20\5\20\u00b0\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ba\n\22\f\22\16\22"+
		"\u00bd\13\22\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00cc\n\23\3\23\2\3\22\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\5\3\2\33\37\3\2\26\27\3\2\31\32\2\u00d1\2-\3\2\2\2"+
		"\4/\3\2\2\2\6:\3\2\2\2\bF\3\2\2\2\nQ\3\2\2\2\f\\\3\2\2\2\16i\3\2\2\2\20"+
		"t\3\2\2\2\22\u0086\3\2\2\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30\u0099"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u00a0\3\2\2\2\36\u00af\3\2\2\2 \u00b1\3\2"+
		"\2\2\"\u00c2\3\2\2\2$\u00cb\3\2\2\2&.\5\4\3\2\'.\5\6\4\2(.\5\b\5\2).\5"+
		"\n\6\2*.\5\f\7\2+.\5\16\b\2,.\5\20\t\2-&\3\2\2\2-\'\3\2\2\2-(\3\2\2\2"+
		"-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\3\3\2\2\2/\60\7\f\2\2\60\61"+
		"\7\3\2\2\61\62\7\r\2\2\62\63\7\20\2\2\63\64\7 \2\2\64\65\7#\2\2\65\66"+
		"\7!\2\2\66\67\7\23\2\2\678\7#\2\289\7\4\2\29\5\3\2\2\2:;\7\f\2\2;<\7\3"+
		"\2\2<=\7\16\2\2=>\7\20\2\2>?\7 \2\2?@\7#\2\2@A\7!\2\2AB\7\22\2\2BC\7#"+
		"\2\2CD\5\32\16\2DE\7\4\2\2E\7\3\2\2\2FG\7\f\2\2GH\7\3\2\2HI\7\17\2\2I"+
		"J\7\20\2\2JK\7 \2\2KL\7#\2\2LM\7!\2\2MN\7\23\2\2NO\7#\2\2OP\7\4\2\2P\t"+
		"\3\2\2\2QR\7\f\2\2RS\7\3\2\2ST\7\r\2\2TU\7\21\2\2UV\7 \2\2VW\7#\2\2WX"+
		"\7!\2\2XY\7\23\2\2YZ\7#\2\2Z[\7\4\2\2[\13\3\2\2\2\\]\7\f\2\2]^\7\3\2\2"+
		"^_\7\r\2\2_`\7\21\2\2`a\7 \2\2ab\7#\2\2bc\7!\2\2cd\7\23\2\2de\7#\2\2e"+
		"f\7\25\2\2fg\5\22\n\2gh\7\4\2\2h\r\3\2\2\2ij\7\f\2\2jk\7\3\2\2kl\7\16"+
		"\2\2lm\7\21\2\2mn\7 \2\2no\5\34\17\2op\7!\2\2pq\7\22\2\2qr\7#\2\2rs\7"+
		"\4\2\2s\17\3\2\2\2tu\7\f\2\2uv\7\3\2\2vw\7\17\2\2wx\7\21\2\2xy\7\23\2"+
		"\2yz\7#\2\2z{\7\4\2\2{\21\3\2\2\2|}\b\n\1\2}~\7 \2\2~\177\5\22\n\2\177"+
		"\u0080\7!\2\2\u0080\u0087\3\2\2\2\u0081\u0082\7\30\2\2\u0082\u0087\5\22"+
		"\n\b\u0083\u0087\5\30\r\2\u0084\u0087\7#\2\2\u0085\u0087\7\"\2\2\u0086"+
		"|\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u0092\3\2\2\2\u0088\u0089\f\7\2\2\u0089\u008a"+
		"\5\24\13\2\u008a\u008b\5\22\n\b\u008b\u0091\3\2\2\2\u008c\u008d\f\6\2"+
		"\2\u008d\u008e\5\26\f\2\u008e\u008f\5\22\n\7\u008f\u0091\3\2\2\2\u0090"+
		"\u0088\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\t\2\2\2\u0096\25\3\2\2\2\u0097\u0098\t\3\2\2\u0098\27\3\2\2\2\u0099\u009a"+
		"\t\4\2\2\u009a\31\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7 \2\2\u009d"+
		"\u009e\5\34\17\2\u009e\u009f\7!\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5$\23"+
		"\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a8\5 \21\2\u00a4\u00a5"+
		"\7\6\2\2\u00a5\u00a7\5 \21\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\7\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00ae\7\5\2\2\u00ae"+
		"\u00b0\7\7\2\2\u00af\u00a2\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\37\3\2\2"+
		"\2\u00b1\u00b2\7$\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5$\23\2\u00b4!\3"+
		"\2\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00bb\5$\23\2\u00b7\u00b8\7\6\2\2\u00b8"+
		"\u00ba\5$\23\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7\4\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c3\7\4"+
		"\2\2\u00c2\u00b5\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00cc"+
		"\7$\2\2\u00c5\u00cc\7%\2\2\u00c6\u00cc\5\36\20\2\u00c7\u00cc\5\"\22\2"+
		"\u00c8\u00cc\7\t\2\2\u00c9\u00cc\7\n\2\2\u00ca\u00cc\7\13\2\2\u00cb\u00c4"+
		"\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc%\3\2\2\2"+
		"\13-\u0086\u0090\u0092\u00a8\u00af\u00bb\u00c2\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}