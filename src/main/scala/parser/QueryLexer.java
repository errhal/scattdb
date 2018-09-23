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
		SELECT=10, INSERT=11, DELETE=12, KEY=13, ENTRY=14, INTO=15, FROM=16, DATA=17, 
		WHERE=18, SHOW=19, STATUS=20, AND=21, OR=22, NOT=23, TRUE=24, FALSE=25, 
		GT=26, GE=27, LT=28, LE=29, EQ=30, LPAREN=31, RPAREN=32, DECIMAL=33, IDENTIFIER=34, 
		STRING=35, NUMBER=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"SELECT", "INSERT", "DELETE", "KEY", "ENTRY", "INTO", "FROM", "DATA", 
		"WHERE", "SHOW", "STATUS", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", 
		"GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "STRING", 
		"ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u012d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\5\"\u00db\n\"\3\"\6\"\u00de"+
		"\n\"\r\"\16\"\u00df\3\"\3\"\6\"\u00e4\n\"\r\"\16\"\u00e5\5\"\u00e8\n\""+
		"\3#\3#\7#\u00ec\n#\f#\16#\u00ef\13#\3$\3$\3$\7$\u00f4\n$\f$\16$\u00f7"+
		"\13$\3$\3$\3%\3%\3%\5%\u00fe\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\5(\u0109"+
		"\n(\3(\3(\3(\6(\u010e\n(\r(\16(\u010f\5(\u0112\n(\3(\5(\u0115\n(\3)\3"+
		")\3)\7)\u011a\n)\f)\16)\u011d\13)\5)\u011f\n)\3*\3*\5*\u0123\n*\3*\3*"+
		"\3+\6+\u0128\n+\r+\16+\u0129\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2O&Q\2S\2"+
		"U\'\3\2\35\4\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2KKkk\4\2PPpp\4\2"+
		"TTtt\4\2FFff\4\2MMmm\4\2[[{{\4\2QQqq\4\2HHhh\4\2OOoo\4\2CCcc\4\2YYyy\4"+
		"\2JJjj\4\2WWww\3\2\62;\5\2C\\aac|\7\2\60\60\62;C\\aac|\4\2$$^^\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\3\2\63;\4\2--//\5\2\13\f\16\17\"\"\2\u0137"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2O\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13"+
		"_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21h\3\2\2\2\23n\3\2\2\2\25s\3\2\2\2\27"+
		"z\3\2\2\2\31\u0081\3\2\2\2\33\u0088\3\2\2\2\35\u008c\3\2\2\2\37\u0092"+
		"\3\2\2\2!\u0097\3\2\2\2#\u009c\3\2\2\2%\u00a1\3\2\2\2\'\u00a7\3\2\2\2"+
		")\u00ac\3\2\2\2+\u00b3\3\2\2\2-\u00b7\3\2\2\2/\u00ba\3\2\2\2\61\u00be"+
		"\3\2\2\2\63\u00c3\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00ce\3\2"+
		"\2\2;\u00d0\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2\2\2A\u00d7\3\2\2\2C\u00da"+
		"\3\2\2\2E\u00e9\3\2\2\2G\u00f0\3\2\2\2I\u00fa\3\2\2\2K\u00ff\3\2\2\2M"+
		"\u0105\3\2\2\2O\u0108\3\2\2\2Q\u011e\3\2\2\2S\u0120\3\2\2\2U\u0127\3\2"+
		"\2\2WX\7}\2\2X\4\3\2\2\2YZ\7.\2\2Z\6\3\2\2\2[\\\7\177\2\2\\\b\3\2\2\2"+
		"]^\7<\2\2^\n\3\2\2\2_`\7]\2\2`\f\3\2\2\2ab\7_\2\2b\16\3\2\2\2cd\7v\2\2"+
		"de\7t\2\2ef\7w\2\2fg\7g\2\2g\20\3\2\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl\7"+
		"u\2\2lm\7g\2\2m\22\3\2\2\2no\7p\2\2op\7w\2\2pq\7n\2\2qr\7n\2\2r\24\3\2"+
		"\2\2st\t\2\2\2tu\t\3\2\2uv\t\4\2\2vw\t\3\2\2wx\t\5\2\2xy\t\6\2\2y\26\3"+
		"\2\2\2z{\t\7\2\2{|\t\b\2\2|}\t\2\2\2}~\t\3\2\2~\177\t\t\2\2\177\u0080"+
		"\t\6\2\2\u0080\30\3\2\2\2\u0081\u0082\t\n\2\2\u0082\u0083\t\3\2\2\u0083"+
		"\u0084\t\4\2\2\u0084\u0085\t\3\2\2\u0085\u0086\t\6\2\2\u0086\u0087\t\3"+
		"\2\2\u0087\32\3\2\2\2\u0088\u0089\t\13\2\2\u0089\u008a\t\3\2\2\u008a\u008b"+
		"\t\f\2\2\u008b\34\3\2\2\2\u008c\u008d\t\3\2\2\u008d\u008e\t\b\2\2\u008e"+
		"\u008f\t\6\2\2\u008f\u0090\t\t\2\2\u0090\u0091\t\f\2\2\u0091\36\3\2\2"+
		"\2\u0092\u0093\t\7\2\2\u0093\u0094\t\b\2\2\u0094\u0095\t\6\2\2\u0095\u0096"+
		"\t\r\2\2\u0096 \3\2\2\2\u0097\u0098\t\16\2\2\u0098\u0099\t\t\2\2\u0099"+
		"\u009a\t\r\2\2\u009a\u009b\t\17\2\2\u009b\"\3\2\2\2\u009c\u009d\t\n\2"+
		"\2\u009d\u009e\t\20\2\2\u009e\u009f\t\6\2\2\u009f\u00a0\t\20\2\2\u00a0"+
		"$\3\2\2\2\u00a1\u00a2\t\21\2\2\u00a2\u00a3\t\22\2\2\u00a3\u00a4\t\3\2"+
		"\2\u00a4\u00a5\t\t\2\2\u00a5\u00a6\t\3\2\2\u00a6&\3\2\2\2\u00a7\u00a8"+
		"\t\2\2\2\u00a8\u00a9\t\22\2\2\u00a9\u00aa\t\r\2\2\u00aa\u00ab\t\21\2\2"+
		"\u00ab(\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00af\t"+
		"\20\2\2\u00af\u00b0\t\6\2\2\u00b0\u00b1\t\23\2\2\u00b1\u00b2\t\2\2\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7F\2\2\u00b6"+
		",\3\2\2\2\u00b7\u00b8\7Q\2\2\u00b8\u00b9\7T\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7P\2\2\u00bb\u00bc\7Q\2\2\u00bc\u00bd\7V\2\2\u00bd\60\3\2\2\2\u00be\u00bf"+
		"\7V\2\2\u00bf\u00c0\7T\2\2\u00c0\u00c1\7W\2\2\u00c1\u00c2\7G\2\2\u00c2"+
		"\62\3\2\2\2\u00c3\u00c4\7H\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\7N\2\2\u00c6"+
		"\u00c7\7U\2\2\u00c7\u00c8\7G\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca"+
		"\66\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd\7?\2\2\u00cd8\3\2\2\2\u00ce"+
		"\u00cf\7>\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\7?\2\2\u00d2"+
		"<\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6@"+
		"\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8B\3\2\2\2\u00d9\u00db\7/\2\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\t\24\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e7\3\2\2\2\u00e1\u00e3\7\60\2\2\u00e2\u00e4\t\24\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"D\3\2\2\2\u00e9\u00ed\t\25\2\2\u00ea\u00ec\t\26\2\2\u00eb\u00ea\3\2\2"+
		"\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeF"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\7$\2\2\u00f1\u00f4\5I%\2\u00f2"+
		"\u00f4\n\27\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7$\2\2\u00f9H\3\2\2\2\u00fa\u00fd\7^\2\2\u00fb"+
		"\u00fe\t\30\2\2\u00fc\u00fe\5K&\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00feJ\3\2\2\2\u00ff\u0100\7w\2\2\u0100\u0101\5M\'\2\u0101\u0102"+
		"\5M\'\2\u0102\u0103\5M\'\2\u0103\u0104\5M\'\2\u0104L\3\2\2\2\u0105\u0106"+
		"\t\31\2\2\u0106N\3\2\2\2\u0107\u0109\7/\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0111\5Q)\2\u010b\u010d\7\60"+
		"\2\2\u010c\u010e\t\24\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5S*\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115P\3\2\2\2\u0116\u011f\7\62\2\2\u0117"+
		"\u011b\t\32\2\2\u0118\u011a\t\24\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3"+
		"\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0117\3\2\2\2\u011fR\3\2\2\2"+
		"\u0120\u0122\t\3\2\2\u0121\u0123\t\33\2\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5Q)\2\u0125T\3\2\2\2\u0126\u0128"+
		"\t\34\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b+\2\2\u012cV\3\2"+
		"\2\2\23\2\u00da\u00df\u00e5\u00e7\u00ed\u00f3\u00f5\u00fd\u0108\u010f"+
		"\u0111\u0114\u011b\u011e\u0122\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}