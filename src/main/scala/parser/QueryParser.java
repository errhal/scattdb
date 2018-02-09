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
		T__9=10, T__10=11, QUERY=12, SELECT=13, INSERT=14, DELETE=15, KEY=16, 
		ENTRY=17, INTO=18, FROM=19, DATA=20, STRING=21, NUMBER=22, NAME=23, WS=24;
	public static final int
		RULE_queryStatement = 0, RULE_selectKeyStatement = 1, RULE_insertKeyStatement = 2, 
		RULE_deleteKeyStatement = 3, RULE_selectEntryStatement = 4, RULE_insertEntryStatement = 5, 
		RULE_deleteEntryStatement = 6, RULE_dataVal = 7, RULE_json = 8, RULE_obj = 9, 
		RULE_pair = 10, RULE_array = 11, RULE_value = 12;
	public static final String[] ruleNames = {
		"queryStatement", "selectKeyStatement", "insertKeyStatement", "deleteKeyStatement", 
		"selectEntryStatement", "insertEntryStatement", "deleteEntryStatement", 
		"dataVal", "json", "obj", "pair", "array", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'('", "')'", "']'", "'{'", "','", "'}'", "':'", "'true'", 
		"'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"QUERY", "SELECT", "INSERT", "DELETE", "KEY", "ENTRY", "INTO", "FROM", 
		"DATA", "STRING", "NUMBER", "NAME", "WS"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).enterQueryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryListener ) ((QueryListener)listener).exitQueryStatement(this);
		}
	}

	public final QueryStatementContext queryStatement() throws RecognitionException {
		QueryStatementContext _localctx = new QueryStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStatement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				selectKeyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				insertKeyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				deleteKeyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				selectEntryStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				insertEntryStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
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
		public List<TerminalNode> NAME() { return getTokens(QueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(QueryParser.NAME, i);
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
	}

	public final SelectKeyStatementContext selectKeyStatement() throws RecognitionException {
		SelectKeyStatementContext _localctx = new SelectKeyStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectKeyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(QUERY);
			setState(35);
			match(T__0);
			setState(36);
			match(SELECT);
			setState(37);
			match(KEY);
			setState(38);
			match(T__1);
			setState(39);
			match(NAME);
			setState(40);
			match(T__2);
			setState(41);
			match(FROM);
			setState(42);
			match(NAME);
			setState(43);
			match(T__3);
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
		public List<TerminalNode> NAME() { return getTokens(QueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(QueryParser.NAME, i);
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
	}

	public final InsertKeyStatementContext insertKeyStatement() throws RecognitionException {
		InsertKeyStatementContext _localctx = new InsertKeyStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertKeyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(QUERY);
			setState(46);
			match(T__0);
			setState(47);
			match(INSERT);
			setState(48);
			match(KEY);
			setState(49);
			match(T__1);
			setState(50);
			match(NAME);
			setState(51);
			match(T__2);
			setState(52);
			match(INTO);
			setState(53);
			match(NAME);
			setState(54);
			dataVal();
			setState(55);
			match(T__3);
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
		public List<TerminalNode> NAME() { return getTokens(QueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(QueryParser.NAME, i);
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
	}

	public final DeleteKeyStatementContext deleteKeyStatement() throws RecognitionException {
		DeleteKeyStatementContext _localctx = new DeleteKeyStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deleteKeyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(QUERY);
			setState(58);
			match(T__0);
			setState(59);
			match(DELETE);
			setState(60);
			match(KEY);
			setState(61);
			match(T__1);
			setState(62);
			match(NAME);
			setState(63);
			match(T__2);
			setState(64);
			match(FROM);
			setState(65);
			match(NAME);
			setState(66);
			match(T__3);
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
		public List<TerminalNode> NAME() { return getTokens(QueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(QueryParser.NAME, i);
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
	}

	public final SelectEntryStatementContext selectEntryStatement() throws RecognitionException {
		SelectEntryStatementContext _localctx = new SelectEntryStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(QUERY);
			setState(69);
			match(T__0);
			setState(70);
			match(SELECT);
			setState(71);
			match(ENTRY);
			setState(72);
			match(T__1);
			setState(73);
			match(NAME);
			setState(74);
			match(T__2);
			setState(75);
			match(FROM);
			setState(76);
			match(NAME);
			setState(77);
			match(T__3);
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
		public TerminalNode NAME() { return getToken(QueryParser.NAME, 0); }
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
	}

	public final InsertEntryStatementContext insertEntryStatement() throws RecognitionException {
		InsertEntryStatementContext _localctx = new InsertEntryStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insertEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(QUERY);
			setState(80);
			match(T__0);
			setState(81);
			match(INSERT);
			setState(82);
			match(ENTRY);
			setState(83);
			match(T__1);
			setState(84);
			json();
			setState(85);
			match(T__2);
			setState(86);
			match(INTO);
			setState(87);
			match(NAME);
			setState(88);
			match(T__3);
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
		public TerminalNode NAME() { return getToken(QueryParser.NAME, 0); }
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
	}

	public final DeleteEntryStatementContext deleteEntryStatement() throws RecognitionException {
		DeleteEntryStatementContext _localctx = new DeleteEntryStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deleteEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(QUERY);
			setState(91);
			match(T__0);
			setState(92);
			match(DELETE);
			setState(93);
			match(ENTRY);
			setState(94);
			match(FROM);
			setState(95);
			match(NAME);
			setState(96);
			match(T__3);
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
	}

	public final DataValContext dataVal() throws RecognitionException {
		DataValContext _localctx = new DataValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DATA);
			setState(99);
			match(T__1);
			setState(100);
			json();
			setState(101);
			match(T__2);
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
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_obj);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__4);
				setState(106);
				pair();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(107);
					match(T__5);
					setState(108);
					pair();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__4);
				setState(117);
				match(T__6);
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
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(STRING);
			setState(121);
			match(T__7);
			setState(122);
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
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__0);
				setState(125);
				value();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(126);
					match(T__5);
					setState(127);
					value();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__0);
				setState(136);
				match(T__3);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(NUMBER);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				obj();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				array();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(T__10);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\7\13p\n\13\f\13\16\13s\13\13\3\13\3\13\3\13\3\13\5"+
		"\13y\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0083\n\r\f\r\16\r\u0086"+
		"\13\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0095\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u0098"+
		"\2\"\3\2\2\2\4$\3\2\2\2\6/\3\2\2\2\b;\3\2\2\2\nF\3\2\2\2\fQ\3\2\2\2\16"+
		"\\\3\2\2\2\20d\3\2\2\2\22i\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30\u008b\3"+
		"\2\2\2\32\u0094\3\2\2\2\34#\5\4\3\2\35#\5\6\4\2\36#\5\b\5\2\37#\5\n\6"+
		"\2 #\5\f\7\2!#\5\16\b\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3"+
		"\2\2\2\" \3\2\2\2\"!\3\2\2\2#\3\3\2\2\2$%\7\16\2\2%&\7\3\2\2&\'\7\17\2"+
		"\2\'(\7\22\2\2()\7\4\2\2)*\7\31\2\2*+\7\5\2\2+,\7\25\2\2,-\7\31\2\2-."+
		"\7\6\2\2.\5\3\2\2\2/\60\7\16\2\2\60\61\7\3\2\2\61\62\7\20\2\2\62\63\7"+
		"\22\2\2\63\64\7\4\2\2\64\65\7\31\2\2\65\66\7\5\2\2\66\67\7\24\2\2\678"+
		"\7\31\2\289\5\20\t\29:\7\6\2\2:\7\3\2\2\2;<\7\16\2\2<=\7\3\2\2=>\7\21"+
		"\2\2>?\7\22\2\2?@\7\4\2\2@A\7\31\2\2AB\7\5\2\2BC\7\25\2\2CD\7\31\2\2D"+
		"E\7\6\2\2E\t\3\2\2\2FG\7\16\2\2GH\7\3\2\2HI\7\17\2\2IJ\7\23\2\2JK\7\4"+
		"\2\2KL\7\31\2\2LM\7\5\2\2MN\7\25\2\2NO\7\31\2\2OP\7\6\2\2P\13\3\2\2\2"+
		"QR\7\16\2\2RS\7\3\2\2ST\7\20\2\2TU\7\23\2\2UV\7\4\2\2VW\5\22\n\2WX\7\5"+
		"\2\2XY\7\24\2\2YZ\7\31\2\2Z[\7\6\2\2[\r\3\2\2\2\\]\7\16\2\2]^\7\3\2\2"+
		"^_\7\21\2\2_`\7\23\2\2`a\7\25\2\2ab\7\31\2\2bc\7\6\2\2c\17\3\2\2\2de\7"+
		"\26\2\2ef\7\4\2\2fg\5\22\n\2gh\7\5\2\2h\21\3\2\2\2ij\5\32\16\2j\23\3\2"+
		"\2\2kl\7\7\2\2lq\5\26\f\2mn\7\b\2\2np\5\26\f\2om\3\2\2\2ps\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\t\2\2uy\3\2\2\2vw\7\7\2\2wy\7"+
		"\t\2\2xk\3\2\2\2xv\3\2\2\2y\25\3\2\2\2z{\7\27\2\2{|\7\n\2\2|}\5\32\16"+
		"\2}\27\3\2\2\2~\177\7\3\2\2\177\u0084\5\32\16\2\u0080\u0081\7\b\2\2\u0081"+
		"\u0083\5\32\16\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7\6\2\2\u0088\u008c\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008c\7\6"+
		"\2\2\u008b~\3\2\2\2\u008b\u0089\3\2\2\2\u008c\31\3\2\2\2\u008d\u0095\7"+
		"\27\2\2\u008e\u0095\7\30\2\2\u008f\u0095\5\24\13\2\u0090\u0095\5\30\r"+
		"\2\u0091\u0095\7\13\2\2\u0092\u0095\7\f\2\2\u0093\u0095\7\r\2\2\u0094"+
		"\u008d\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2"+
		"\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\33\3\2\2\2\b\"qx\u0084\u008b\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}