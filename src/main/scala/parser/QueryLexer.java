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
		QUERY=10, SELECT=11, INSERT=12, DELETE=13, KEY=14, ENTRY=15, INTO=16, 
		FROM=17, DATA=18, WHERE=19, AND=20, OR=21, NOT=22, TRUE=23, FALSE=24, 
		GT=25, GE=26, LT=27, LE=28, EQ=29, LPAREN=30, RPAREN=31, DECIMAL=32, IDENTIFIER=33, 
		STRING=34, NUMBER=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"QUERY", "SELECT", "INSERT", "DELETE", "KEY", "ENTRY", "INTO", "FROM", 
		"DATA", "WHERE", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", 
		"LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "STRING", "ESC", 
		"UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\5!\u00d3\n!\3!\6!\u00d6\n!\r!\16!\u00d7\3!\3!\6!\u00dc\n!\r"+
		"!\16!\u00dd\5!\u00e0\n!\3\"\3\"\7\"\u00e4\n\"\f\"\16\"\u00e7\13\"\3#\3"+
		"#\3#\7#\u00ec\n#\f#\16#\u00ef\13#\3#\3#\3$\3$\3$\5$\u00f6\n$\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3\'\5\'\u0101\n\'\3\'\3\'\3\'\6\'\u0106\n\'\r\'\16\'\u0107"+
		"\5\'\u010a\n\'\3\'\5\'\u010d\n\'\3(\3(\3(\7(\u0112\n(\f(\16(\u0115\13"+
		"(\5(\u0117\n(\3)\3)\5)\u011b\n)\3)\3)\3*\6*\u0120\n*\r*\16*\u0121\3*\3"+
		"*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G\2I\2K\2M%O\2Q\2S&\3\2\36\4\2SSss\4\2WWww\4\2GGgg"+
		"\4\2TTtt\4\2[[{{\4\2UUuu\4\2NNnn\4\2EEee\4\2VVvv\4\2KKkk\4\2PPpp\4\2F"+
		"Fff\4\2MMmm\4\2QQqq\4\2HHhh\4\2OOoo\4\2CCcc\4\2YYyy\4\2JJjj\3\2\62;\5"+
		"\2C\\aac|\7\2\60\60\62;C\\aac|\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62"+
		";CHch\3\2\63;\4\2--//\5\2\13\f\16\17\"\"\2\u012f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\3U\3\2\2"+
		"\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2"+
		"\21f\3\2\2\2\23l\3\2\2\2\25q\3\2\2\2\27w\3\2\2\2\31~\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u008c\3\2\2\2\37\u0090\3\2\2\2!\u0096\3\2\2\2#\u009b\3\2\2"+
		"\2%\u00a0\3\2\2\2\'\u00a5\3\2\2\2)\u00ab\3\2\2\2+\u00af\3\2\2\2-\u00b2"+
		"\3\2\2\2/\u00b6\3\2\2\2\61\u00bb\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2"+
		"\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00cf"+
		"\3\2\2\2A\u00d2\3\2\2\2C\u00e1\3\2\2\2E\u00e8\3\2\2\2G\u00f2\3\2\2\2I"+
		"\u00f7\3\2\2\2K\u00fd\3\2\2\2M\u0100\3\2\2\2O\u0116\3\2\2\2Q\u0118\3\2"+
		"\2\2S\u011f\3\2\2\2UV\7]\2\2V\4\3\2\2\2WX\7_\2\2X\6\3\2\2\2YZ\7}\2\2Z"+
		"\b\3\2\2\2[\\\7.\2\2\\\n\3\2\2\2]^\7\177\2\2^\f\3\2\2\2_`\7<\2\2`\16\3"+
		"\2\2\2ab\7v\2\2bc\7t\2\2cd\7w\2\2de\7g\2\2e\20\3\2\2\2fg\7h\2\2gh\7c\2"+
		"\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k\22\3\2\2\2lm\7p\2\2mn\7w\2\2no\7n\2\2o"+
		"p\7n\2\2p\24\3\2\2\2qr\t\2\2\2rs\t\3\2\2st\t\4\2\2tu\t\5\2\2uv\t\6\2\2"+
		"v\26\3\2\2\2wx\t\7\2\2xy\t\4\2\2yz\t\b\2\2z{\t\4\2\2{|\t\t\2\2|}\t\n\2"+
		"\2}\30\3\2\2\2~\177\t\13\2\2\177\u0080\t\f\2\2\u0080\u0081\t\7\2\2\u0081"+
		"\u0082\t\4\2\2\u0082\u0083\t\5\2\2\u0083\u0084\t\n\2\2\u0084\32\3\2\2"+
		"\2\u0085\u0086\t\r\2\2\u0086\u0087\t\4\2\2\u0087\u0088\t\b\2\2\u0088\u0089"+
		"\t\4\2\2\u0089\u008a\t\n\2\2\u008a\u008b\t\4\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\t\16\2\2\u008d\u008e\t\4\2\2\u008e\u008f\t\6\2\2\u008f\36\3\2\2"+
		"\2\u0090\u0091\t\4\2\2\u0091\u0092\t\f\2\2\u0092\u0093\t\n\2\2\u0093\u0094"+
		"\t\5\2\2\u0094\u0095\t\6\2\2\u0095 \3\2\2\2\u0096\u0097\t\13\2\2\u0097"+
		"\u0098\t\f\2\2\u0098\u0099\t\n\2\2\u0099\u009a\t\17\2\2\u009a\"\3\2\2"+
		"\2\u009b\u009c\t\20\2\2\u009c\u009d\t\5\2\2\u009d\u009e\t\17\2\2\u009e"+
		"\u009f\t\21\2\2\u009f$\3\2\2\2\u00a0\u00a1\t\r\2\2\u00a1\u00a2\t\22\2"+
		"\2\u00a2\u00a3\t\n\2\2\u00a3\u00a4\t\22\2\2\u00a4&\3\2\2\2\u00a5\u00a6"+
		"\t\23\2\2\u00a6\u00a7\t\24\2\2\u00a7\u00a8\t\4\2\2\u00a8\u00a9\t\5\2\2"+
		"\u00a9\u00aa\t\4\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7P"+
		"\2\2\u00ad\u00ae\7F\2\2\u00ae*\3\2\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b1"+
		"\7T\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b4\7Q\2\2\u00b4\u00b5"+
		"\7V\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7T\2\2\u00b8\u00b9"+
		"\7W\2\2\u00b9\u00ba\7G\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7H\2\2\u00bc\u00bd"+
		"\7C\2\2\u00bd\u00be\7N\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7G\2\2\u00c0"+
		"\62\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4"+
		"\u00c5\7?\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7>\2\2\u00c78\3\2\2\2\u00c8"+
		"\u00c9\7>\2\2\u00c9\u00ca\7?\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc"+
		"<\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0@"+
		"\3\2\2\2\u00d1\u00d3\7/\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d6\t\25\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00df\3\2\2\2\u00d9"+
		"\u00db\7\60\2\2\u00da\u00dc\t\25\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00d9\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0B\3\2\2\2\u00e1\u00e5\t\26\2\2"+
		"\u00e2\u00e4\t\27\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6D\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00ed\7$\2\2\u00e9\u00ec\5G$\2\u00ea\u00ec\n\30\2\2\u00eb\u00e9\3\2\2"+
		"\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1"+
		"F\3\2\2\2\u00f2\u00f5\7^\2\2\u00f3\u00f6\t\31\2\2\u00f4\u00f6\5I%\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7w\2\2\u00f8"+
		"\u00f9\5K&\2\u00f9\u00fa\5K&\2\u00fa\u00fb\5K&\2\u00fb\u00fc\5K&\2\u00fc"+
		"J\3\2\2\2\u00fd\u00fe\t\32\2\2\u00feL\3\2\2\2\u00ff\u0101\7/\2\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0109\5O"+
		"(\2\u0103\u0105\7\60\2\2\u0104\u0106\t\25\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0103\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u010d\5Q)\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010dN\3\2\2\2\u010e"+
		"\u0117\7\62\2\2\u010f\u0113\t\33\2\2\u0110\u0112\t\25\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2"+
		"\2\2\u0117P\3\2\2\2\u0118\u011a\t\4\2\2\u0119\u011b\t\34\2\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5O(\2\u011d"+
		"R\3\2\2\2\u011e\u0120\t\35\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\b*\2\2\u0124T\3\2\2\2\23\2\u00d2\u00d7\u00dd\u00df\u00e5\u00eb\u00ed"+
		"\u00f5\u0100\u0107\u0109\u010c\u0113\u0116\u011a\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}