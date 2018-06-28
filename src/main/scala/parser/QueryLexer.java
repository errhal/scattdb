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
		WHERE=18, AND=19, OR=20, NOT=21, TRUE=22, FALSE=23, GT=24, GE=25, LT=26, 
		LE=27, EQ=28, LPAREN=29, RPAREN=30, DECIMAL=31, IDENTIFIER=32, STRING=33, 
		NUMBER=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"SELECT", "INSERT", "DELETE", "KEY", "ENTRY", "INTO", "FROM", "DATA", 
		"WHERE", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", "LT", "LE", 
		"EQ", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "STRING", "ESC", "UNICODE", 
		"HEX", "NUMBER", "INT", "EXP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'", 
		null, null, null, null, null, null, null, null, null, "'AND'", "'OR'", 
		"'NOT'", "'TRUE'", "'FALSE'", "'>'", "'>='", "'<'", "'<='", "'='", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "SELECT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \5 \u00cb\n \3 \6 \u00ce"+
		"\n \r \16 \u00cf\3 \3 \6 \u00d4\n \r \16 \u00d5\5 \u00d8\n \3!\3!\7!\u00dc"+
		"\n!\f!\16!\u00df\13!\3\"\3\"\3\"\7\"\u00e4\n\"\f\"\16\"\u00e7\13\"\3\""+
		"\3\"\3#\3#\3#\5#\u00ee\n#\3$\3$\3$\3$\3$\3$\3%\3%\3&\5&\u00f9\n&\3&\3"+
		"&\3&\6&\u00fe\n&\r&\16&\u00ff\5&\u0102\n&\3&\5&\u0105\n&\3\'\3\'\3\'\7"+
		"\'\u010a\n\'\f\'\16\'\u010d\13\'\5\'\u010f\n\'\3(\3(\5(\u0113\n(\3(\3"+
		"(\3)\6)\u0118\n)\r)\16)\u0119\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K$M\2O\2Q%\3"+
		"\2\34\4\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2KKkk\4\2PPpp\4\2TTtt"+
		"\4\2FFff\4\2MMmm\4\2[[{{\4\2QQqq\4\2HHhh\4\2OOoo\4\2CCcc\4\2YYyy\4\2J"+
		"Jjj\3\2\62;\5\2C\\aac|\7\2\60\60\62;C\\aac|\4\2$$^^\n\2$$\61\61^^ddhh"+
		"ppttvv\5\2\62;CHch\3\2\63;\4\2--//\5\2\13\f\16\17\"\"\2\u0127\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\3S\3"+
		"\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2"+
		"\2\2\21d\3\2\2\2\23j\3\2\2\2\25o\3\2\2\2\27v\3\2\2\2\31}\3\2\2\2\33\u0084"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008e\3\2\2\2!\u0093\3\2\2\2#\u0098\3\2\2"+
		"\2%\u009d\3\2\2\2\'\u00a3\3\2\2\2)\u00a7\3\2\2\2+\u00aa\3\2\2\2-\u00ae"+
		"\3\2\2\2/\u00b3\3\2\2\2\61\u00b9\3\2\2\2\63\u00bb\3\2\2\2\65\u00be\3\2"+
		"\2\2\67\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00ca"+
		"\3\2\2\2A\u00d9\3\2\2\2C\u00e0\3\2\2\2E\u00ea\3\2\2\2G\u00ef\3\2\2\2I"+
		"\u00f5\3\2\2\2K\u00f8\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0117\3\2"+
		"\2\2ST\7}\2\2T\4\3\2\2\2UV\7.\2\2V\6\3\2\2\2WX\7\177\2\2X\b\3\2\2\2YZ"+
		"\7<\2\2Z\n\3\2\2\2[\\\7]\2\2\\\f\3\2\2\2]^\7_\2\2^\16\3\2\2\2_`\7v\2\2"+
		"`a\7t\2\2ab\7w\2\2bc\7g\2\2c\20\3\2\2\2de\7h\2\2ef\7c\2\2fg\7n\2\2gh\7"+
		"u\2\2hi\7g\2\2i\22\3\2\2\2jk\7p\2\2kl\7w\2\2lm\7n\2\2mn\7n\2\2n\24\3\2"+
		"\2\2op\t\2\2\2pq\t\3\2\2qr\t\4\2\2rs\t\3\2\2st\t\5\2\2tu\t\6\2\2u\26\3"+
		"\2\2\2vw\t\7\2\2wx\t\b\2\2xy\t\2\2\2yz\t\3\2\2z{\t\t\2\2{|\t\6\2\2|\30"+
		"\3\2\2\2}~\t\n\2\2~\177\t\3\2\2\177\u0080\t\4\2\2\u0080\u0081\t\3\2\2"+
		"\u0081\u0082\t\6\2\2\u0082\u0083\t\3\2\2\u0083\32\3\2\2\2\u0084\u0085"+
		"\t\13\2\2\u0085\u0086\t\3\2\2\u0086\u0087\t\f\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\t\3\2\2\u0089\u008a\t\b\2\2\u008a\u008b\t\6\2\2\u008b\u008c\t\t"+
		"\2\2\u008c\u008d\t\f\2\2\u008d\36\3\2\2\2\u008e\u008f\t\7\2\2\u008f\u0090"+
		"\t\b\2\2\u0090\u0091\t\6\2\2\u0091\u0092\t\r\2\2\u0092 \3\2\2\2\u0093"+
		"\u0094\t\16\2\2\u0094\u0095\t\t\2\2\u0095\u0096\t\r\2\2\u0096\u0097\t"+
		"\17\2\2\u0097\"\3\2\2\2\u0098\u0099\t\n\2\2\u0099\u009a\t\20\2\2\u009a"+
		"\u009b\t\6\2\2\u009b\u009c\t\20\2\2\u009c$\3\2\2\2\u009d\u009e\t\21\2"+
		"\2\u009e\u009f\t\22\2\2\u009f\u00a0\t\3\2\2\u00a0\u00a1\t\t\2\2\u00a1"+
		"\u00a2\t\3\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\7P\2\2\u00a5"+
		"\u00a6\7F\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7T\2\2\u00a9"+
		"*\3\2\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7V\2\2\u00ad"+
		",\3\2\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7W\2\2\u00b1"+
		"\u00b2\7G\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7C\2\2\u00b5"+
		"\u00b6\7N\2\2\u00b6\u00b7\7U\2\2\u00b7\u00b8\7G\2\2\u00b8\60\3\2\2\2\u00b9"+
		"\u00ba\7@\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\64\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1"+
		"\u00c2\7?\2\2\u00c28\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4:\3\2\2\2\u00c5\u00c6"+
		"\7*\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8>\3\2\2\2\u00c9\u00cb\7"+
		"/\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ce\t\23\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d7\3\2\2\2\u00d1\u00d3\7\60\2\2\u00d2"+
		"\u00d4\t\23\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8@\3\2\2\2\u00d9\u00dd\t\24\2\2\u00da\u00dc\t\25\2"+
		"\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00deB\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e5\7$\2\2\u00e1\u00e4"+
		"\5E#\2\u00e2\u00e4\n\26\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9D\3\2\2\2\u00ea\u00ed"+
		"\7^\2\2\u00eb\u00ee\t\27\2\2\u00ec\u00ee\5G$\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\5I%\2\u00f1"+
		"\u00f2\5I%\2\u00f2\u00f3\5I%\2\u00f3\u00f4\5I%\2\u00f4H\3\2\2\2\u00f5"+
		"\u00f6\t\30\2\2\u00f6J\3\2\2\2\u00f7\u00f9\7/\2\2\u00f8\u00f7\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0101\5M\'\2\u00fb\u00fd"+
		"\7\60\2\2\u00fc\u00fe\t\23\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00fb"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105\5O(\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105L\3\2\2\2\u0106\u010f\7\62\2\2"+
		"\u0107\u010b\t\31\2\2\u0108\u010a\t\23\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010fN\3\2\2\2"+
		"\u0110\u0112\t\3\2\2\u0111\u0113\t\32\2\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\5M\'\2\u0115P\3\2\2\2\u0116\u0118"+
		"\t\33\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b)\2\2\u011cR\3\2"+
		"\2\2\23\2\u00ca\u00cf\u00d5\u00d7\u00dd\u00e3\u00e5\u00ed\u00f8\u00ff"+
		"\u0101\u0104\u010b\u010e\u0112\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}