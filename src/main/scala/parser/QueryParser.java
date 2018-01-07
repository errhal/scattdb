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
		T__9=10, T__10=11, T__11=12, QUERY=13, SELECT=14, INSERT=15, KEY=16, ENTRY=17, 
		INTO=18, FROM=19, STRING=20, NUMBER=21, NAME=22, WS=23;
	public static final int
		RULE_queryStatement = 0, RULE_selectKeyStatement = 1, RULE_insertKeyStatement = 2, 
		RULE_selectEntryStatement = 3, RULE_insertEntryStatement = 4, RULE_dataVal = 5, 
		RULE_json = 6, RULE_obj = 7, RULE_pair = 8, RULE_array = 9, RULE_value = 10;
	public static final String[] ruleNames = {
		"queryStatement", "selectKeyStatement", "insertKeyStatement", "selectEntryStatement", 
		"insertEntryStatement", "dataVal", "json", "obj", "pair", "array", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'('", "')'", "']'", "'data'", "'{'", "','", "'}'", "':'", 
		"'true'", "'false'", "'null'", "'query'", "'select'", "'insert'", "'key'", 
		"'entry'", "'into'", "'from'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "QUERY", "SELECT", "INSERT", "KEY", "ENTRY", "INTO", "FROM", "STRING", 
		"NUMBER", "NAME", "WS"
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
		public SelectEntryStatementContext selectEntryStatement() {
			return getRuleContext(SelectEntryStatementContext.class,0);
		}
		public InsertEntryStatementContext insertEntryStatement() {
			return getRuleContext(InsertEntryStatementContext.class,0);
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
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				selectKeyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				insertKeyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				selectEntryStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				insertEntryStatement();
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
			setState(28);
			match(QUERY);
			setState(29);
			match(T__0);
			setState(30);
			match(SELECT);
			setState(31);
			match(KEY);
			setState(32);
			match(T__1);
			setState(33);
			match(NAME);
			setState(34);
			match(T__2);
			setState(35);
			match(FROM);
			setState(36);
			match(NAME);
			setState(37);
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
			setState(39);
			match(QUERY);
			setState(40);
			match(T__0);
			setState(41);
			match(INSERT);
			setState(42);
			match(KEY);
			setState(43);
			match(T__1);
			setState(44);
			match(NAME);
			setState(45);
			match(T__2);
			setState(46);
			match(INTO);
			setState(47);
			match(NAME);
			setState(48);
			dataVal();
			setState(49);
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
		enterRule(_localctx, 6, RULE_selectEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(QUERY);
			setState(52);
			match(T__0);
			setState(53);
			match(SELECT);
			setState(54);
			match(ENTRY);
			setState(55);
			match(T__1);
			setState(56);
			match(NAME);
			setState(57);
			match(T__2);
			setState(58);
			match(FROM);
			setState(59);
			match(NAME);
			setState(60);
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
		enterRule(_localctx, 8, RULE_insertEntryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(QUERY);
			setState(63);
			match(T__0);
			setState(64);
			match(INSERT);
			setState(65);
			match(ENTRY);
			setState(66);
			match(T__1);
			setState(67);
			json();
			setState(68);
			match(T__2);
			setState(69);
			match(INTO);
			setState(70);
			match(NAME);
			setState(71);
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
		enterRule(_localctx, 10, RULE_dataVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			match(T__1);
			setState(75);
			json();
			setState(76);
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
		enterRule(_localctx, 12, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		enterRule(_localctx, 14, RULE_obj);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__5);
				setState(81);
				pair();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(82);
					match(T__6);
					setState(83);
					pair();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__5);
				setState(92);
				match(T__7);
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
		enterRule(_localctx, 16, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(STRING);
			setState(96);
			match(T__8);
			setState(97);
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
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__0);
				setState(100);
				value();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(101);
					match(T__6);
					setState(102);
					value();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__0);
				setState(111);
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
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(NUMBER);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				obj();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				array();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\tW\n\t\f\t\16\tZ\13"+
		"\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13j"+
		"\n\13\f\13\16\13m\13\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f|\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\177\2"+
		"\34\3\2\2\2\4\36\3\2\2\2\6)\3\2\2\2\b\65\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2"+
		"\16P\3\2\2\2\20_\3\2\2\2\22a\3\2\2\2\24r\3\2\2\2\26{\3\2\2\2\30\35\5\4"+
		"\3\2\31\35\5\6\4\2\32\35\5\b\5\2\33\35\5\n\6\2\34\30\3\2\2\2\34\31\3\2"+
		"\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\3\3\2\2\2\36\37\7\17\2\2\37 \7\3\2"+
		"\2 !\7\20\2\2!\"\7\22\2\2\"#\7\4\2\2#$\7\30\2\2$%\7\5\2\2%&\7\25\2\2&"+
		"\'\7\30\2\2\'(\7\6\2\2(\5\3\2\2\2)*\7\17\2\2*+\7\3\2\2+,\7\21\2\2,-\7"+
		"\22\2\2-.\7\4\2\2./\7\30\2\2/\60\7\5\2\2\60\61\7\24\2\2\61\62\7\30\2\2"+
		"\62\63\5\f\7\2\63\64\7\6\2\2\64\7\3\2\2\2\65\66\7\17\2\2\66\67\7\3\2\2"+
		"\678\7\20\2\289\7\23\2\29:\7\4\2\2:;\7\30\2\2;<\7\5\2\2<=\7\25\2\2=>\7"+
		"\30\2\2>?\7\6\2\2?\t\3\2\2\2@A\7\17\2\2AB\7\3\2\2BC\7\21\2\2CD\7\23\2"+
		"\2DE\7\4\2\2EF\5\16\b\2FG\7\5\2\2GH\7\24\2\2HI\7\30\2\2IJ\7\6\2\2J\13"+
		"\3\2\2\2KL\7\7\2\2LM\7\4\2\2MN\5\16\b\2NO\7\5\2\2O\r\3\2\2\2PQ\5\26\f"+
		"\2Q\17\3\2\2\2RS\7\b\2\2SX\5\22\n\2TU\7\t\2\2UW\5\22\n\2VT\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\n\2\2\\`\3\2\2\2]"+
		"^\7\b\2\2^`\7\n\2\2_R\3\2\2\2_]\3\2\2\2`\21\3\2\2\2ab\7\26\2\2bc\7\13"+
		"\2\2cd\5\26\f\2d\23\3\2\2\2ef\7\3\2\2fk\5\26\f\2gh\7\t\2\2hj\5\26\f\2"+
		"ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\6\2\2"+
		"os\3\2\2\2pq\7\3\2\2qs\7\6\2\2re\3\2\2\2rp\3\2\2\2s\25\3\2\2\2t|\7\26"+
		"\2\2u|\7\27\2\2v|\5\20\t\2w|\5\24\13\2x|\7\f\2\2y|\7\r\2\2z|\7\16\2\2"+
		"{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2"+
		"|\27\3\2\2\2\b\34X_kr{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}