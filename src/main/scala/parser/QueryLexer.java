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
		T__9=10, T__10=11, QUERY=12, SELECT=13, INSERT=14, DELETE=15, KEY=16, 
		ENTRY=17, INTO=18, FROM=19, DATA=20, STRING=21, NUMBER=22, NAME=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "QUERY", "SELECT", "INSERT", "DELETE", "KEY", "ENTRY", 
		"INTO", "FROM", "DATA", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", 
		"EXP", "NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0095\n\26\f\26\16\26\u0098"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u009f\n\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\5\32\u00aa\n\32\3\32\3\32\3\32\6\32\u00af\n\32"+
		"\r\32\16\32\u00b0\5\32\u00b3\n\32\3\32\5\32\u00b6\n\32\3\33\3\33\3\33"+
		"\7\33\u00bb\n\33\f\33\16\33\u00be\13\33\5\33\u00c0\n\33\3\34\3\34\5\34"+
		"\u00c4\n\34\3\34\3\34\3\35\6\35\u00c9\n\35\r\35\16\35\u00ca\3\36\6\36"+
		"\u00ce\n\36\r\36\16\36\u00cf\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\2/\2\61\2\63\30\65\2\67\29\31;\32\3\2\33\4\2SSss\4\2WWww\4\2GGg"+
		"g\4\2TTtt\4\2[[{{\4\2UUuu\4\2NNnn\4\2EEee\4\2VVvv\4\2KKkk\4\2PPpp\4\2"+
		"FFff\4\2MMmm\4\2QQqq\4\2HHhh\4\2OOoo\4\2CCcc\4\2$$^^\n\2$$\61\61^^ddh"+
		"hppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2--//\b\2&&\60\60\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2\63\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2"+
		"\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2"+
		"\25R\3\2\2\2\27X\3\2\2\2\31]\3\2\2\2\33c\3\2\2\2\35j\3\2\2\2\37q\3\2\2"+
		"\2!x\3\2\2\2#|\3\2\2\2%\u0082\3\2\2\2\'\u0087\3\2\2\2)\u008c\3\2\2\2+"+
		"\u0091\3\2\2\2-\u009b\3\2\2\2/\u00a0\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9"+
		"\3\2\2\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c8\3\2\2\2;\u00cd\3\2\2"+
		"\2=>\7]\2\2>\4\3\2\2\2?@\7*\2\2@\6\3\2\2\2AB\7+\2\2B\b\3\2\2\2CD\7_\2"+
		"\2D\n\3\2\2\2EF\7}\2\2F\f\3\2\2\2GH\7.\2\2H\16\3\2\2\2IJ\7\177\2\2J\20"+
		"\3\2\2\2KL\7<\2\2L\22\3\2\2\2MN\7v\2\2NO\7t\2\2OP\7w\2\2PQ\7g\2\2Q\24"+
		"\3\2\2\2RS\7h\2\2ST\7c\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2W\26\3\2\2\2XY\7"+
		"p\2\2YZ\7w\2\2Z[\7n\2\2[\\\7n\2\2\\\30\3\2\2\2]^\t\2\2\2^_\t\3\2\2_`\t"+
		"\4\2\2`a\t\5\2\2ab\t\6\2\2b\32\3\2\2\2cd\t\7\2\2de\t\4\2\2ef\t\b\2\2f"+
		"g\t\4\2\2gh\t\t\2\2hi\t\n\2\2i\34\3\2\2\2jk\t\13\2\2kl\t\f\2\2lm\t\7\2"+
		"\2mn\t\4\2\2no\t\5\2\2op\t\n\2\2p\36\3\2\2\2qr\t\r\2\2rs\t\4\2\2st\t\b"+
		"\2\2tu\t\4\2\2uv\t\n\2\2vw\t\4\2\2w \3\2\2\2xy\t\16\2\2yz\t\4\2\2z{\t"+
		"\6\2\2{\"\3\2\2\2|}\t\4\2\2}~\t\f\2\2~\177\t\n\2\2\177\u0080\t\5\2\2\u0080"+
		"\u0081\t\6\2\2\u0081$\3\2\2\2\u0082\u0083\t\13\2\2\u0083\u0084\t\f\2\2"+
		"\u0084\u0085\t\n\2\2\u0085\u0086\t\17\2\2\u0086&\3\2\2\2\u0087\u0088\t"+
		"\20\2\2\u0088\u0089\t\5\2\2\u0089\u008a\t\17\2\2\u008a\u008b\t\21\2\2"+
		"\u008b(\3\2\2\2\u008c\u008d\t\r\2\2\u008d\u008e\t\22\2\2\u008e\u008f\t"+
		"\n\2\2\u008f\u0090\t\22\2\2\u0090*\3\2\2\2\u0091\u0096\7$\2\2\u0092\u0095"+
		"\5-\27\2\u0093\u0095\n\23\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a,\3\2\2\2\u009b\u009e"+
		"\7^\2\2\u009c\u009f\t\24\2\2\u009d\u009f\5/\30\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f.\3\2\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\5\61\31\2"+
		"\u00a2\u00a3\5\61\31\2\u00a3\u00a4\5\61\31\2\u00a4\u00a5\5\61\31\2\u00a5"+
		"\60\3\2\2\2\u00a6\u00a7\t\25\2\2\u00a7\62\3\2\2\2\u00a8\u00aa\7/\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b2\5\65"+
		"\33\2\u00ac\u00ae\7\60\2\2\u00ad\u00af\t\26\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b6\5\67\34\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\64\3\2"+
		"\2\2\u00b7\u00c0\7\62\2\2\u00b8\u00bc\t\27\2\2\u00b9\u00bb\t\26\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00b8\3\2\2\2\u00c0\66\3\2\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c4\t\30\2"+
		"\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\5\65\33\2\u00c68\3\2\2\2\u00c7\u00c9\t\31\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb:\3\2\2\2"+
		"\u00cc\u00ce\t\32\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\36\2\2"+
		"\u00d2<\3\2\2\2\17\2\u0094\u0096\u009e\u00a9\u00b0\u00b2\u00b5\u00bc\u00bf"+
		"\u00c3\u00ca\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}