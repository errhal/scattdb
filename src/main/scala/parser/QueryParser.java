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
		SELECT=10, INSERT=11, DELETE=12, KEY=13, ENTRY=14, INTO=15, FROM=16, DATA=17, 
		WHERE=18, SHOW=19, STATUS=20, AND=21, OR=22, NOT=23, TRUE=24, FALSE=25, 
		GT=26, GE=27, LT=28, LE=29, EQ=30, LPAREN=31, RPAREN=32, DECIMAL=33, IDENTIFIER=34, 
		STRING=35, NUMBER=36, WS=37;
	public static final int
		RULE_queryStatement = 0, RULE_selectKeyStatement = 1, RULE_insertKeyStatement = 2, 
		RULE_deleteKeyStatement = 3, RULE_selectEntryStatement = 4, RULE_selectEntryStatementWithWhere = 5, 
		RULE_insertEntryStatement = 6, RULE_deleteEntryStatement = 7, RULE_showStatus = 8, 
		RULE_whereExpression = 9, RULE_comparator = 10, RULE_binary = 11, RULE_bool = 12, 
		RULE_dataVal = 13, RULE_json = 14, RULE_obj = 15, RULE_pair = 16, RULE_array = 17, 
		RULE_value = 18;
	public static final String[] ruleNames = {
		"queryStatement", "selectKeyStatement", "insertKeyStatement", "deleteKeyStatement", 
		"selectEntryStatement", "selectEntryStatementWithWhere", "insertEntryStatement", 
		"deleteEntryStatement", "showStatus", "whereExpression", "comparator", 
		"binary", "bool", "dataVal", "json", "obj", "pair", "array", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'", 
		null, null, null, null, null, null, null, null, null, null, null, "'AND'", 
		"'OR'", "'NOT'", "'TRUE'", "'FALSE'", "'>'", "'>='", "'<'", "'<='", "'='", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"INSERT", "DELETE", "KEY", "ENTRY", "INTO", "FROM", "DATA", "WHERE", "SHOW", 
		"STATUS", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", 
		"EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "STRING", "NUMBER", 
		"WS"
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
		public ShowStatusContext showStatus() {
			return getRuleContext(ShowStatusContext.class,0);
		}
		public QueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterQueryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitQueryStatement(this);
		}
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				selectKeyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				insertKeyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				deleteKeyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				selectEntryStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				selectEntryStatementWithWhere();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				insertEntryStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				deleteEntryStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				showStatus();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterSelectKeyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitSelectKeyStatement(this);
		}
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
			setState(48);
			match(SELECT);
			setState(49);
			match(KEY);
			setState(50);
			match(LPAREN);
			setState(51);
			match(IDENTIFIER);
			setState(52);
			match(RPAREN);
			setState(53);
			match(FROM);
			setState(54);
			match(IDENTIFIER);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterInsertKeyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitInsertKeyStatement(this);
		}
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
			match(INSERT);
			setState(57);
			match(KEY);
			setState(58);
			match(LPAREN);
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(RPAREN);
			setState(61);
			match(INTO);
			setState(62);
			match(IDENTIFIER);
			setState(63);
			dataVal();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterDeleteKeyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitDeleteKeyStatement(this);
		}
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
			setState(65);
			match(DELETE);
			setState(66);
			match(KEY);
			setState(67);
			match(LPAREN);
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(RPAREN);
			setState(70);
			match(FROM);
			setState(71);
			match(IDENTIFIER);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterSelectEntryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitSelectEntryStatement(this);
		}
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
			setState(73);
			match(SELECT);
			setState(74);
			match(ENTRY);
			setState(75);
			match(LPAREN);
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(RPAREN);
			setState(78);
			match(FROM);
			setState(79);
			match(IDENTIFIER);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterSelectEntryStatementWithWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitSelectEntryStatementWithWhere(this);
		}
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
			match(WHERE);
			setState(89);
			whereExpression(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterInsertEntryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitInsertEntryStatement(this);
		}
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
			setState(91);
			match(INSERT);
			setState(92);
			match(ENTRY);
			setState(93);
			match(LPAREN);
			setState(94);
			json();
			setState(95);
			match(RPAREN);
			setState(96);
			match(INTO);
			setState(97);
			match(IDENTIFIER);
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
		public TerminalNode DELETE() { return getToken(QueryParser.DELETE, 0); }
		public TerminalNode ENTRY() { return getToken(QueryParser.ENTRY, 0); }
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(QueryParser.IDENTIFIER, 0); }
		public DeleteEntryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteEntryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterDeleteEntryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitDeleteEntryStatement(this);
		}
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
			setState(99);
			match(DELETE);
			setState(100);
			match(ENTRY);
			setState(101);
			match(FROM);
			setState(102);
			match(IDENTIFIER);
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

	public static class ShowStatusContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(QueryParser.SHOW, 0); }
		public TerminalNode STATUS() { return getToken(QueryParser.STATUS, 0); }
		public ShowStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterShowStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitShowStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitShowStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowStatusContext showStatus() throws RecognitionException {
		ShowStatusContext _localctx = new ShowStatusContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_showStatus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(SHOW);
			setState(105);
			match(STATUS);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitBinaryExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends WhereExpressionContext {
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public StringExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends WhereExpressionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolExpressionContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitBoolExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitIdentifierExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitNotExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitParenExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparatorExpression(this);
		}
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_whereExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(LPAREN);
				setState(109);
				whereExpression(0);
				setState(110);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(NOT);
				setState(113);
				whereExpression(7);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				bool();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(STRING);
				}
				break;
			case DECIMAL:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ComparatorExpressionContext(new WhereExpressionContext(_parentctx, _parentState));
						((ComparatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_whereExpression);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((ComparatorExpressionContext)_localctx).op = comparator();
						setState(122);
						((ComparatorExpressionContext)_localctx).right = whereExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new WhereExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_whereExpression);
						setState(124);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(125);
						((BinaryExpressionContext)_localctx).op = binary();
						setState(126);
						((BinaryExpressionContext)_localctx).right = whereExpression(6);
						}
						break;
					}
					} 
				}
				setState(132);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterDataVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitDataVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitDataVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValContext dataVal() throws RecognitionException {
		DataValContext _localctx = new DataValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DATA);
			setState(140);
			match(LPAREN);
			setState(141);
			json();
			setState(142);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_obj);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__0);
				setState(147);
				pair();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(148);
					match(T__1);
					setState(149);
					pair();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__0);
				setState(158);
				match(T__2);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(STRING);
			setState(162);
			match(T__3);
			setState(163);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__4);
				setState(166);
				value();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(167);
					match(T__1);
					setState(168);
					value();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__4);
				setState(177);
				match(T__5);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryVisitor ) return ((QueryVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				obj();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
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
		case 9:
			return whereExpression_sempred((WhereExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean whereExpression_sempred(WhereExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13y\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0083\n"+
		"\13\f\13\16\13\u0086\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0099\n\21\f\21\16\21\u009c"+
		"\13\21\3\21\3\21\3\21\3\21\5\21\u00a2\n\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\u00ac\n\23\f\23\16\23\u00af\13\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00b5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00be\n\24"+
		"\3\24\2\3\24\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\3\2\34"+
		" \3\2\27\30\3\2\32\33\2\u00c4\2\60\3\2\2\2\4\62\3\2\2\2\6:\3\2\2\2\bC"+
		"\3\2\2\2\nK\3\2\2\2\fS\3\2\2\2\16]\3\2\2\2\20e\3\2\2\2\22j\3\2\2\2\24"+
		"x\3\2\2\2\26\u0087\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u008d"+
		"\3\2\2\2\36\u0092\3\2\2\2 \u00a1\3\2\2\2\"\u00a3\3\2\2\2$\u00b4\3\2\2"+
		"\2&\u00bd\3\2\2\2(\61\5\4\3\2)\61\5\6\4\2*\61\5\b\5\2+\61\5\n\6\2,\61"+
		"\5\f\7\2-\61\5\16\b\2.\61\5\20\t\2/\61\5\22\n\2\60(\3\2\2\2\60)\3\2\2"+
		"\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2"+
		"\2\2\61\3\3\2\2\2\62\63\7\f\2\2\63\64\7\17\2\2\64\65\7!\2\2\65\66\7$\2"+
		"\2\66\67\7\"\2\2\678\7\22\2\289\7$\2\29\5\3\2\2\2:;\7\r\2\2;<\7\17\2\2"+
		"<=\7!\2\2=>\7$\2\2>?\7\"\2\2?@\7\21\2\2@A\7$\2\2AB\5\34\17\2B\7\3\2\2"+
		"\2CD\7\16\2\2DE\7\17\2\2EF\7!\2\2FG\7$\2\2GH\7\"\2\2HI\7\22\2\2IJ\7$\2"+
		"\2J\t\3\2\2\2KL\7\f\2\2LM\7\20\2\2MN\7!\2\2NO\7$\2\2OP\7\"\2\2PQ\7\22"+
		"\2\2QR\7$\2\2R\13\3\2\2\2ST\7\f\2\2TU\7\20\2\2UV\7!\2\2VW\7$\2\2WX\7\""+
		"\2\2XY\7\22\2\2YZ\7$\2\2Z[\7\24\2\2[\\\5\24\13\2\\\r\3\2\2\2]^\7\r\2\2"+
		"^_\7\20\2\2_`\7!\2\2`a\5\36\20\2ab\7\"\2\2bc\7\21\2\2cd\7$\2\2d\17\3\2"+
		"\2\2ef\7\16\2\2fg\7\20\2\2gh\7\22\2\2hi\7$\2\2i\21\3\2\2\2jk\7\25\2\2"+
		"kl\7\26\2\2l\23\3\2\2\2mn\b\13\1\2no\7!\2\2op\5\24\13\2pq\7\"\2\2qy\3"+
		"\2\2\2rs\7\31\2\2sy\5\24\13\tty\5\32\16\2uy\7$\2\2vy\7%\2\2wy\7#\2\2x"+
		"m\3\2\2\2xr\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\u0084\3\2"+
		"\2\2z{\f\b\2\2{|\5\26\f\2|}\5\24\13\t}\u0083\3\2\2\2~\177\f\7\2\2\177"+
		"\u0080\5\30\r\2\u0080\u0081\5\24\13\b\u0081\u0083\3\2\2\2\u0082z\3\2\2"+
		"\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\25\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\27\3\2\2\2\u0089\u008a\t\3\2\2\u008a\31\3\2\2\2\u008b\u008c\t\4\2\2\u008c"+
		"\33\3\2\2\2\u008d\u008e\7\23\2\2\u008e\u008f\7!\2\2\u008f\u0090\5\36\20"+
		"\2\u0090\u0091\7\"\2\2\u0091\35\3\2\2\2\u0092\u0093\5&\24\2\u0093\37\3"+
		"\2\2\2\u0094\u0095\7\3\2\2\u0095\u009a\5\"\22\2\u0096\u0097\7\4\2\2\u0097"+
		"\u0099\5\"\22\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\5\2\2\u009e\u00a2\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a2\7\5"+
		"\2\2\u00a1\u0094\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2!\3\2\2\2\u00a3\u00a4"+
		"\7%\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5&\24\2\u00a6#\3\2\2\2\u00a7\u00a8"+
		"\7\7\2\2\u00a8\u00ad\5&\24\2\u00a9\u00aa\7\4\2\2\u00aa\u00ac\5&\24\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\b\2\2\u00b1"+
		"\u00b5\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b5\7\b\2\2\u00b4\u00a7\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00be\7%\2\2\u00b7\u00be"+
		"\7&\2\2\u00b8\u00be\5 \21\2\u00b9\u00be\5$\23\2\u00ba\u00be\7\t\2\2\u00bb"+
		"\u00be\7\n\2\2\u00bc\u00be\7\13\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b7\3"+
		"\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\'\3\2\2\2\13\60x\u0082\u0084"+
		"\u009a\u00a1\u00ad\u00b4\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}