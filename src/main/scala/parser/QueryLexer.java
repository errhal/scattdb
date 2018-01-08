// Generated from /home/kamil/scattdb/src/main/scala/parser/Query.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, QUERY=12, SELECT=13, INSERT=14, KEY=15, ENTRY=16, INTO=17, 
		FROM=18, DATA=19, STRING=20, NUMBER=21, NAME=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "QUERY", "SELECT", "INSERT", "KEY", "ENTRY", "INTO", 
		"FROM", "DATA", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", 
		"NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'('", "')'", "']'", "'{'", "','", "'}'", "':'", "'true'", 
		"'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"QUERY", "SELECT", "INSERT", "KEY", "ENTRY", "INTO", "FROM", "DATA", "STRING", 
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


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u008c\n\25\f\25\16\25\u008f\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u0096"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\5\31\u00a1\n\31\3\31"+
		"\3\31\3\31\6\31\u00a6\n\31\r\31\16\31\u00a7\5\31\u00aa\n\31\3\31\5\31"+
		"\u00ad\n\31\3\32\3\32\3\32\7\32\u00b2\n\32\f\32\16\32\u00b5\13\32\5\32"+
		"\u00b7\n\32\3\33\3\33\5\33\u00bb\n\33\3\33\3\33\3\34\6\34\u00c0\n\34\r"+
		"\34\16\34\u00c1\3\35\6\35\u00c5\n\35\r\35\16\35\u00c6\3\35\3\35\2\2\36"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\27\63\2\65\2\67\309\31\3\2\33"+
		"\4\2SSss\4\2WWww\4\2GGgg\4\2TTtt\4\2[[{{\4\2UUuu\4\2NNnn\4\2EEee\4\2V"+
		"Vvv\4\2KKkk\4\2PPpp\4\2MMmm\4\2QQqq\4\2HHhh\4\2OOoo\4\2FFff\4\2CCcc\4"+
		"\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2--//\b\2"+
		"&&\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d0\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2\61\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2"+
		"\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2"+
		"\2\2\23K\3\2\2\2\25P\3\2\2\2\27V\3\2\2\2\31[\3\2\2\2\33a\3\2\2\2\35h\3"+
		"\2\2\2\37o\3\2\2\2!s\3\2\2\2#y\3\2\2\2%~\3\2\2\2\'\u0083\3\2\2\2)\u0088"+
		"\3\2\2\2+\u0092\3\2\2\2-\u0097\3\2\2\2/\u009d\3\2\2\2\61\u00a0\3\2\2\2"+
		"\63\u00b6\3\2\2\2\65\u00b8\3\2\2\2\67\u00bf\3\2\2\29\u00c4\3\2\2\2;<\7"+
		"]\2\2<\4\3\2\2\2=>\7*\2\2>\6\3\2\2\2?@\7+\2\2@\b\3\2\2\2AB\7_\2\2B\n\3"+
		"\2\2\2CD\7}\2\2D\f\3\2\2\2EF\7.\2\2F\16\3\2\2\2GH\7\177\2\2H\20\3\2\2"+
		"\2IJ\7<\2\2J\22\3\2\2\2KL\7v\2\2LM\7t\2\2MN\7w\2\2NO\7g\2\2O\24\3\2\2"+
		"\2PQ\7h\2\2QR\7c\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2U\26\3\2\2\2VW\7p\2\2W"+
		"X\7w\2\2XY\7n\2\2YZ\7n\2\2Z\30\3\2\2\2[\\\t\2\2\2\\]\t\3\2\2]^\t\4\2\2"+
		"^_\t\5\2\2_`\t\6\2\2`\32\3\2\2\2ab\t\7\2\2bc\t\4\2\2cd\t\b\2\2de\t\4\2"+
		"\2ef\t\t\2\2fg\t\n\2\2g\34\3\2\2\2hi\t\13\2\2ij\t\f\2\2jk\t\7\2\2kl\t"+
		"\4\2\2lm\t\5\2\2mn\t\n\2\2n\36\3\2\2\2op\t\r\2\2pq\t\4\2\2qr\t\6\2\2r"+
		" \3\2\2\2st\t\4\2\2tu\t\f\2\2uv\t\n\2\2vw\t\5\2\2wx\t\6\2\2x\"\3\2\2\2"+
		"yz\t\13\2\2z{\t\f\2\2{|\t\n\2\2|}\t\16\2\2}$\3\2\2\2~\177\t\17\2\2\177"+
		"\u0080\t\5\2\2\u0080\u0081\t\16\2\2\u0081\u0082\t\20\2\2\u0082&\3\2\2"+
		"\2\u0083\u0084\t\21\2\2\u0084\u0085\t\22\2\2\u0085\u0086\t\n\2\2\u0086"+
		"\u0087\t\22\2\2\u0087(\3\2\2\2\u0088\u008d\7$\2\2\u0089\u008c\5+\26\2"+
		"\u008a\u008c\n\23\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091*\3\2\2\2\u0092\u0095\7^\2\2\u0093"+
		"\u0096\t\24\2\2\u0094\u0096\5-\27\2\u0095\u0093\3\2\2\2\u0095\u0094\3"+
		"\2\2\2\u0096,\3\2\2\2\u0097\u0098\7w\2\2\u0098\u0099\5/\30\2\u0099\u009a"+
		"\5/\30\2\u009a\u009b\5/\30\2\u009b\u009c\5/\30\2\u009c.\3\2\2\2\u009d"+
		"\u009e\t\25\2\2\u009e\60\3\2\2\2\u009f\u00a1\7/\2\2\u00a0\u009f\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a9\5\63\32\2\u00a3"+
		"\u00a5\7\60\2\2\u00a4\u00a6\t\26\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a3\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\5\65"+
		"\33\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\62\3\2\2\2\u00ae\u00b7"+
		"\7\62\2\2\u00af\u00b3\t\27\2\2\u00b0\u00b2\t\26\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7"+
		"\64\3\2\2\2\u00b8\u00ba\t\4\2\2\u00b9\u00bb\t\30\2\2\u00ba\u00b9\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5\63\32\2\u00bd"+
		"\66\3\2\2\2\u00be\u00c0\t\31\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c28\3\2\2\2\u00c3\u00c5"+
		"\t\32\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\35\2\2\u00c9:\3"+
		"\2\2\2\17\2\u008b\u008d\u0095\u00a0\u00a7\u00a9\u00ac\u00b3\u00b6\u00ba"+
		"\u00c1\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}