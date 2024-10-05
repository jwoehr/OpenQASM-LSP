// Generated from qasm3Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qasm3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENQASM=1, INCLUDE=2, DEFCALGRAMMAR=3, DEF=4, CAL=5, DEFCAL=6, GATE=7, 
		EXTERN=8, BOX=9, LET=10, BREAK=11, CONTINUE=12, IF=13, ELSE=14, END=15, 
		RETURN=16, FOR=17, WHILE=18, IN=19, SWITCH=20, CASE=21, DEFAULT=22, PRAGMA=23, 
		AnnotationKeyword=24, INPUT=25, OUTPUT=26, CONST=27, READONLY=28, MUTABLE=29, 
		QREG=30, QUBIT=31, CREG=32, BOOL=33, BIT=34, INT=35, UINT=36, FLOAT=37, 
		ANGLE=38, COMPLEX=39, ARRAY=40, VOID=41, DURATION=42, STRETCH=43, GPHASE=44, 
		INV=45, POW=46, CTRL=47, NEGCTRL=48, DIM=49, DURATIONOF=50, DELAY=51, 
		RESET=52, MEASURE=53, BARRIER=54, BooleanLiteral=55, LBRACKET=56, RBRACKET=57, 
		LBRACE=58, RBRACE=59, LPAREN=60, RPAREN=61, COLON=62, SEMICOLON=63, DOT=64, 
		COMMA=65, EQUALS=66, ARROW=67, PLUS=68, DOUBLE_PLUS=69, MINUS=70, ASTERISK=71, 
		DOUBLE_ASTERISK=72, SLASH=73, PERCENT=74, PIPE=75, DOUBLE_PIPE=76, AMPERSAND=77, 
		DOUBLE_AMPERSAND=78, CARET=79, AT=80, TILDE=81, EXCLAMATION_POINT=82, 
		EqualityOperator=83, CompoundAssignmentOperator=84, ComparisonOperator=85, 
		BitshiftOperator=86, IMAG=87, ImaginaryLiteral=88, BinaryIntegerLiteral=89, 
		OctalIntegerLiteral=90, DecimalIntegerLiteral=91, HexIntegerLiteral=92, 
		Identifier=93, HardwareQubit=94, FloatLiteral=95, TimingLiteral=96, BitstringLiteral=97, 
		Whitespace=98, Newline=99, LineComment=100, BlockComment=101, VERSION_IDENTIFER_WHITESPACE=102, 
		VersionSpecifier=103, ARBITRARY_STRING_WHITESPACE=104, StringLiteral=105, 
		EAT_INITIAL_SPACE=106, EAT_LINE_END=107, RemainingLineContent=108, CAL_PRELUDE_WHITESPACE=109, 
		CAL_PRELUDE_COMMENT=110, DEFCAL_PRELUDE_WHITESPACE=111, DEFCAL_PRELUDE_COMMENT=112, 
		CalibrationBlock=113;
	public static final int
		RULE_program = 0, RULE_version = 1, RULE_statement = 2, RULE_annotation = 3, 
		RULE_scope = 4, RULE_pragma = 5, RULE_statementOrScope = 6, RULE_calibrationGrammarStatement = 7, 
		RULE_includeStatement = 8, RULE_breakStatement = 9, RULE_continueStatement = 10, 
		RULE_endStatement = 11, RULE_forStatement = 12, RULE_ifStatement = 13, 
		RULE_returnStatement = 14, RULE_whileStatement = 15, RULE_switchStatement = 16, 
		RULE_switchCaseItem = 17, RULE_barrierStatement = 18, RULE_boxStatement = 19, 
		RULE_delayStatement = 20, RULE_gateCallStatement = 21, RULE_measureArrowAssignmentStatement = 22, 
		RULE_resetStatement = 23, RULE_aliasDeclarationStatement = 24, RULE_classicalDeclarationStatement = 25, 
		RULE_constDeclarationStatement = 26, RULE_ioDeclarationStatement = 27, 
		RULE_oldStyleDeclarationStatement = 28, RULE_quantumDeclarationStatement = 29, 
		RULE_defStatement = 30, RULE_externStatement = 31, RULE_gateStatement = 32, 
		RULE_assignmentStatement = 33, RULE_expressionStatement = 34, RULE_calStatement = 35, 
		RULE_defcalStatement = 36, RULE_expression = 37, RULE_aliasExpression = 38, 
		RULE_declarationExpression = 39, RULE_measureExpression = 40, RULE_rangeExpression = 41, 
		RULE_setExpression = 42, RULE_arrayLiteral = 43, RULE_indexOperator = 44, 
		RULE_indexedIdentifier = 45, RULE_returnSignature = 46, RULE_gateModifier = 47, 
		RULE_scalarType = 48, RULE_qubitType = 49, RULE_arrayType = 50, RULE_arrayReferenceType = 51, 
		RULE_designator = 52, RULE_defcalTarget = 53, RULE_defcalArgumentDefinition = 54, 
		RULE_defcalOperand = 55, RULE_gateOperand = 56, RULE_externArgument = 57, 
		RULE_argumentDefinition = 58, RULE_argumentDefinitionList = 59, RULE_defcalArgumentDefinitionList = 60, 
		RULE_defcalOperandList = 61, RULE_expressionList = 62, RULE_identifierList = 63, 
		RULE_gateOperandList = 64, RULE_externArgumentList = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "version", "statement", "annotation", "scope", "pragma", "statementOrScope", 
			"calibrationGrammarStatement", "includeStatement", "breakStatement", 
			"continueStatement", "endStatement", "forStatement", "ifStatement", "returnStatement", 
			"whileStatement", "switchStatement", "switchCaseItem", "barrierStatement", 
			"boxStatement", "delayStatement", "gateCallStatement", "measureArrowAssignmentStatement", 
			"resetStatement", "aliasDeclarationStatement", "classicalDeclarationStatement", 
			"constDeclarationStatement", "ioDeclarationStatement", "oldStyleDeclarationStatement", 
			"quantumDeclarationStatement", "defStatement", "externStatement", "gateStatement", 
			"assignmentStatement", "expressionStatement", "calStatement", "defcalStatement", 
			"expression", "aliasExpression", "declarationExpression", "measureExpression", 
			"rangeExpression", "setExpression", "arrayLiteral", "indexOperator", 
			"indexedIdentifier", "returnSignature", "gateModifier", "scalarType", 
			"qubitType", "arrayType", "arrayReferenceType", "designator", "defcalTarget", 
			"defcalArgumentDefinition", "defcalOperand", "gateOperand", "externArgument", 
			"argumentDefinition", "argumentDefinitionList", "defcalArgumentDefinitionList", 
			"defcalOperandList", "expressionList", "identifierList", "gateOperandList", 
			"externArgumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'OPENQASM'", "'include'", "'defcalgrammar'", "'def'", "'cal'", 
			"'defcal'", "'gate'", "'extern'", "'box'", "'let'", "'break'", "'continue'", 
			"'if'", "'else'", "'end'", "'return'", "'for'", "'while'", "'in'", "'switch'", 
			"'case'", "'default'", null, null, "'input'", "'output'", "'const'", 
			"'readonly'", "'mutable'", "'qreg'", "'qubit'", "'creg'", "'bool'", "'bit'", 
			"'int'", "'uint'", "'float'", "'angle'", "'complex'", "'array'", "'void'", 
			"'duration'", "'stretch'", "'gphase'", "'inv'", "'pow'", "'ctrl'", "'negctrl'", 
			"'#dim'", "'durationof'", "'delay'", "'reset'", "'measure'", "'barrier'", 
			null, "'['", "']'", "'{'", "'}'", "'('", "')'", "':'", "';'", "'.'", 
			"','", "'='", "'->'", "'+'", "'++'", "'-'", "'*'", "'**'", "'/'", "'%'", 
			"'|'", "'||'", "'&'", "'&&'", "'^'", "'@'", "'~'", "'!'", null, null, 
			null, null, "'im'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPENQASM", "INCLUDE", "DEFCALGRAMMAR", "DEF", "CAL", "DEFCAL", 
			"GATE", "EXTERN", "BOX", "LET", "BREAK", "CONTINUE", "IF", "ELSE", "END", 
			"RETURN", "FOR", "WHILE", "IN", "SWITCH", "CASE", "DEFAULT", "PRAGMA", 
			"AnnotationKeyword", "INPUT", "OUTPUT", "CONST", "READONLY", "MUTABLE", 
			"QREG", "QUBIT", "CREG", "BOOL", "BIT", "INT", "UINT", "FLOAT", "ANGLE", 
			"COMPLEX", "ARRAY", "VOID", "DURATION", "STRETCH", "GPHASE", "INV", "POW", 
			"CTRL", "NEGCTRL", "DIM", "DURATIONOF", "DELAY", "RESET", "MEASURE", 
			"BARRIER", "BooleanLiteral", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
			"LPAREN", "RPAREN", "COLON", "SEMICOLON", "DOT", "COMMA", "EQUALS", "ARROW", 
			"PLUS", "DOUBLE_PLUS", "MINUS", "ASTERISK", "DOUBLE_ASTERISK", "SLASH", 
			"PERCENT", "PIPE", "DOUBLE_PIPE", "AMPERSAND", "DOUBLE_AMPERSAND", "CARET", 
			"AT", "TILDE", "EXCLAMATION_POINT", "EqualityOperator", "CompoundAssignmentOperator", 
			"ComparisonOperator", "BitshiftOperator", "IMAG", "ImaginaryLiteral", 
			"BinaryIntegerLiteral", "OctalIntegerLiteral", "DecimalIntegerLiteral", 
			"HexIntegerLiteral", "Identifier", "HardwareQubit", "FloatLiteral", "TimingLiteral", 
			"BitstringLiteral", "Whitespace", "Newline", "LineComment", "BlockComment", 
			"VERSION_IDENTIFER_WHITESPACE", "VersionSpecifier", "ARBITRARY_STRING_WHITESPACE", 
			"StringLiteral", "EAT_INITIAL_SPACE", "EAT_LINE_END", "RemainingLineContent", 
			"CAL_PRELUDE_WHITESPACE", "CAL_PRELUDE_COMMENT", "DEFCAL_PRELUDE_WHITESPACE", 
			"DEFCAL_PRELUDE_COMMENT", "CalibrationBlock"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "qasm3Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qasm3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(qasm3Parser.EOF, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public List<StatementOrScopeContext> statementOrScope() {
			return getRuleContexts(StatementOrScopeContext.class);
		}
		public StatementOrScopeContext statementOrScope(int i) {
			return getRuleContext(StatementOrScopeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENQASM) {
				{
				setState(132);
				version();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << DEFCALGRAMMAR) | (1L << DEF) | (1L << CAL) | (1L << DEFCAL) | (1L << GATE) | (1L << EXTERN) | (1L << BOX) | (1L << LET) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << END) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PRAGMA) | (1L << AnnotationKeyword) | (1L << INPUT) | (1L << OUTPUT) | (1L << CONST) | (1L << QREG) | (1L << QUBIT) | (1L << CREG) | (1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << GPHASE) | (1L << INV) | (1L << POW) | (1L << CTRL) | (1L << NEGCTRL) | (1L << DURATIONOF) | (1L << DELAY) | (1L << RESET) | (1L << MEASURE) | (1L << BARRIER) | (1L << BooleanLiteral) | (1L << LBRACE) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
				{
				{
				setState(135);
				statementOrScope();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(EOF);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode OPENQASM() { return getToken(qasm3Parser.OPENQASM, 0); }
		public TerminalNode VersionSpecifier() { return getToken(qasm3Parser.VersionSpecifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(OPENQASM);
			setState(144);
			match(VersionSpecifier);
			setState(145);
			match(SEMICOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public AliasDeclarationStatementContext aliasDeclarationStatement() {
			return getRuleContext(AliasDeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public BarrierStatementContext barrierStatement() {
			return getRuleContext(BarrierStatementContext.class,0);
		}
		public BoxStatementContext boxStatement() {
			return getRuleContext(BoxStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public CalStatementContext calStatement() {
			return getRuleContext(CalStatementContext.class,0);
		}
		public CalibrationGrammarStatementContext calibrationGrammarStatement() {
			return getRuleContext(CalibrationGrammarStatementContext.class,0);
		}
		public ClassicalDeclarationStatementContext classicalDeclarationStatement() {
			return getRuleContext(ClassicalDeclarationStatementContext.class,0);
		}
		public ConstDeclarationStatementContext constDeclarationStatement() {
			return getRuleContext(ConstDeclarationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public DefcalStatementContext defcalStatement() {
			return getRuleContext(DefcalStatementContext.class,0);
		}
		public DelayStatementContext delayStatement() {
			return getRuleContext(DelayStatementContext.class,0);
		}
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExternStatementContext externStatement() {
			return getRuleContext(ExternStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public GateCallStatementContext gateCallStatement() {
			return getRuleContext(GateCallStatementContext.class,0);
		}
		public GateStatementContext gateStatement() {
			return getRuleContext(GateStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public IoDeclarationStatementContext ioDeclarationStatement() {
			return getRuleContext(IoDeclarationStatementContext.class,0);
		}
		public MeasureArrowAssignmentStatementContext measureArrowAssignmentStatement() {
			return getRuleContext(MeasureArrowAssignmentStatementContext.class,0);
		}
		public OldStyleDeclarationStatementContext oldStyleDeclarationStatement() {
			return getRuleContext(OldStyleDeclarationStatementContext.class,0);
		}
		public QuantumDeclarationStatementContext quantumDeclarationStatement() {
			return getRuleContext(QuantumDeclarationStatementContext.class,0);
		}
		public ResetStatementContext resetStatement() {
			return getRuleContext(ResetStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRAGMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				pragma();
				}
				break;
			case INCLUDE:
			case DEFCALGRAMMAR:
			case DEF:
			case CAL:
			case DEFCAL:
			case GATE:
			case EXTERN:
			case BOX:
			case LET:
			case BREAK:
			case CONTINUE:
			case IF:
			case END:
			case RETURN:
			case FOR:
			case WHILE:
			case SWITCH:
			case AnnotationKeyword:
			case INPUT:
			case OUTPUT:
			case CONST:
			case QREG:
			case QUBIT:
			case CREG:
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case GPHASE:
			case INV:
			case POW:
			case CTRL:
			case NEGCTRL:
			case DURATIONOF:
			case DELAY:
			case RESET:
			case MEASURE:
			case BARRIER:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AnnotationKeyword) {
					{
					{
					setState(148);
					annotation();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(154);
					aliasDeclarationStatement();
					}
					break;
				case 2:
					{
					setState(155);
					assignmentStatement();
					}
					break;
				case 3:
					{
					setState(156);
					barrierStatement();
					}
					break;
				case 4:
					{
					setState(157);
					boxStatement();
					}
					break;
				case 5:
					{
					setState(158);
					breakStatement();
					}
					break;
				case 6:
					{
					setState(159);
					calStatement();
					}
					break;
				case 7:
					{
					setState(160);
					calibrationGrammarStatement();
					}
					break;
				case 8:
					{
					setState(161);
					classicalDeclarationStatement();
					}
					break;
				case 9:
					{
					setState(162);
					constDeclarationStatement();
					}
					break;
				case 10:
					{
					setState(163);
					continueStatement();
					}
					break;
				case 11:
					{
					setState(164);
					defStatement();
					}
					break;
				case 12:
					{
					setState(165);
					defcalStatement();
					}
					break;
				case 13:
					{
					setState(166);
					delayStatement();
					}
					break;
				case 14:
					{
					setState(167);
					endStatement();
					}
					break;
				case 15:
					{
					setState(168);
					expressionStatement();
					}
					break;
				case 16:
					{
					setState(169);
					externStatement();
					}
					break;
				case 17:
					{
					setState(170);
					forStatement();
					}
					break;
				case 18:
					{
					setState(171);
					gateCallStatement();
					}
					break;
				case 19:
					{
					setState(172);
					gateStatement();
					}
					break;
				case 20:
					{
					setState(173);
					ifStatement();
					}
					break;
				case 21:
					{
					setState(174);
					includeStatement();
					}
					break;
				case 22:
					{
					setState(175);
					ioDeclarationStatement();
					}
					break;
				case 23:
					{
					setState(176);
					measureArrowAssignmentStatement();
					}
					break;
				case 24:
					{
					setState(177);
					oldStyleDeclarationStatement();
					}
					break;
				case 25:
					{
					setState(178);
					quantumDeclarationStatement();
					}
					break;
				case 26:
					{
					setState(179);
					resetStatement();
					}
					break;
				case 27:
					{
					setState(180);
					returnStatement();
					}
					break;
				case 28:
					{
					setState(181);
					switchStatement();
					}
					break;
				case 29:
					{
					setState(182);
					whileStatement();
					}
					break;
				}
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AnnotationKeyword() { return getToken(qasm3Parser.AnnotationKeyword, 0); }
		public TerminalNode RemainingLineContent() { return getToken(qasm3Parser.RemainingLineContent, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(AnnotationKeyword);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RemainingLineContent) {
				{
				setState(188);
				match(RemainingLineContent);
				}
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<StatementOrScopeContext> statementOrScope() {
			return getRuleContexts(StatementOrScopeContext.class);
		}
		public StatementOrScopeContext statementOrScope(int i) {
			return getRuleContext(StatementOrScopeContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LBRACE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << DEFCALGRAMMAR) | (1L << DEF) | (1L << CAL) | (1L << DEFCAL) | (1L << GATE) | (1L << EXTERN) | (1L << BOX) | (1L << LET) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << END) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << PRAGMA) | (1L << AnnotationKeyword) | (1L << INPUT) | (1L << OUTPUT) | (1L << CONST) | (1L << QREG) | (1L << QUBIT) | (1L << CREG) | (1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << GPHASE) | (1L << INV) | (1L << POW) | (1L << CTRL) | (1L << NEGCTRL) | (1L << DURATIONOF) | (1L << DELAY) | (1L << RESET) | (1L << MEASURE) | (1L << BARRIER) | (1L << BooleanLiteral) | (1L << LBRACE) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
				{
				{
				setState(192);
				statementOrScope();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(RBRACE);
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

	public static class PragmaContext extends ParserRuleContext {
		public TerminalNode PRAGMA() { return getToken(qasm3Parser.PRAGMA, 0); }
		public TerminalNode RemainingLineContent() { return getToken(qasm3Parser.RemainingLineContent, 0); }
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(PRAGMA);
			setState(201);
			match(RemainingLineContent);
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

	public static class StatementOrScopeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public StatementOrScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOrScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterStatementOrScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitStatementOrScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitStatementOrScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOrScopeContext statementOrScope() throws RecognitionException {
		StatementOrScopeContext _localctx = new StatementOrScopeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementOrScope);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUDE:
			case DEFCALGRAMMAR:
			case DEF:
			case CAL:
			case DEFCAL:
			case GATE:
			case EXTERN:
			case BOX:
			case LET:
			case BREAK:
			case CONTINUE:
			case IF:
			case END:
			case RETURN:
			case FOR:
			case WHILE:
			case SWITCH:
			case PRAGMA:
			case AnnotationKeyword:
			case INPUT:
			case OUTPUT:
			case CONST:
			case QREG:
			case QUBIT:
			case CREG:
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case GPHASE:
			case INV:
			case POW:
			case CTRL:
			case NEGCTRL:
			case DURATIONOF:
			case DELAY:
			case RESET:
			case MEASURE:
			case BARRIER:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				statement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				scope();
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

	public static class CalibrationGrammarStatementContext extends ParserRuleContext {
		public TerminalNode DEFCALGRAMMAR() { return getToken(qasm3Parser.DEFCALGRAMMAR, 0); }
		public TerminalNode StringLiteral() { return getToken(qasm3Parser.StringLiteral, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public CalibrationGrammarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibrationGrammarStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterCalibrationGrammarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitCalibrationGrammarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitCalibrationGrammarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalibrationGrammarStatementContext calibrationGrammarStatement() throws RecognitionException {
		CalibrationGrammarStatementContext _localctx = new CalibrationGrammarStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_calibrationGrammarStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(DEFCALGRAMMAR);
			setState(208);
			match(StringLiteral);
			setState(209);
			match(SEMICOLON);
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

	public static class IncludeStatementContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(qasm3Parser.INCLUDE, 0); }
		public TerminalNode StringLiteral() { return getToken(qasm3Parser.StringLiteral, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(INCLUDE);
			setState(212);
			match(StringLiteral);
			setState(213);
			match(SEMICOLON);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(qasm3Parser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(BREAK);
			setState(216);
			match(SEMICOLON);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(qasm3Parser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(CONTINUE);
			setState(219);
			match(SEMICOLON);
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

	public static class EndStatementContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(qasm3Parser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitEndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(END);
			setState(222);
			match(SEMICOLON);
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

	public static class ForStatementContext extends ParserRuleContext {
		public StatementOrScopeContext body;
		public TerminalNode FOR() { return getToken(qasm3Parser.FOR, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode IN() { return getToken(qasm3Parser.IN, 0); }
		public StatementOrScopeContext statementOrScope() {
			return getRuleContext(StatementOrScopeContext.class,0);
		}
		public SetExpressionContext setExpression() {
			return getRuleContext(SetExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FOR);
			setState(225);
			scalarType();
			setState(226);
			match(Identifier);
			setState(227);
			match(IN);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(228);
				setExpression();
				}
				break;
			case LBRACKET:
				{
				setState(229);
				match(LBRACKET);
				setState(230);
				rangeExpression();
				setState(231);
				match(RBRACKET);
				}
				break;
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				{
				setState(233);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			((ForStatementContext)_localctx).body = statementOrScope();
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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementOrScopeContext if_body;
		public StatementOrScopeContext else_body;
		public TerminalNode IF() { return getToken(qasm3Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public List<StatementOrScopeContext> statementOrScope() {
			return getRuleContexts(StatementOrScopeContext.class);
		}
		public StatementOrScopeContext statementOrScope(int i) {
			return getRuleContext(StatementOrScopeContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(qasm3Parser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IF);
			setState(239);
			match(LPAREN);
			setState(240);
			expression(0);
			setState(241);
			match(RPAREN);
			setState(242);
			((IfStatementContext)_localctx).if_body = statementOrScope();
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(243);
				match(ELSE);
				setState(244);
				((IfStatementContext)_localctx).else_body = statementOrScope();
				}
				break;
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(qasm3Parser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MeasureExpressionContext measureExpression() {
			return getRuleContext(MeasureExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(RETURN);
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				{
				setState(248);
				expression(0);
				}
				break;
			case MEASURE:
				{
				setState(249);
				measureExpression();
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(252);
			match(SEMICOLON);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementOrScopeContext body;
		public TerminalNode WHILE() { return getToken(qasm3Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public StatementOrScopeContext statementOrScope() {
			return getRuleContext(StatementOrScopeContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(WHILE);
			setState(255);
			match(LPAREN);
			setState(256);
			expression(0);
			setState(257);
			match(RPAREN);
			setState(258);
			((WhileStatementContext)_localctx).body = statementOrScope();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(qasm3Parser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<SwitchCaseItemContext> switchCaseItem() {
			return getRuleContexts(SwitchCaseItemContext.class);
		}
		public SwitchCaseItemContext switchCaseItem(int i) {
			return getRuleContext(SwitchCaseItemContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SWITCH);
			setState(261);
			match(LPAREN);
			setState(262);
			expression(0);
			setState(263);
			match(RPAREN);
			setState(264);
			match(LBRACE);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(265);
				switchCaseItem();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(RBRACE);
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

	public static class SwitchCaseItemContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(qasm3Parser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(qasm3Parser.DEFAULT, 0); }
		public SwitchCaseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterSwitchCaseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitSwitchCaseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitSwitchCaseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseItemContext switchCaseItem() throws RecognitionException {
		SwitchCaseItemContext _localctx = new SwitchCaseItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchCaseItem);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(CASE);
				setState(274);
				expressionList();
				setState(275);
				scope();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(DEFAULT);
				setState(278);
				scope();
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

	public static class BarrierStatementContext extends ParserRuleContext {
		public TerminalNode BARRIER() { return getToken(qasm3Parser.BARRIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public GateOperandListContext gateOperandList() {
			return getRuleContext(GateOperandListContext.class,0);
		}
		public BarrierStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barrierStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBarrierStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBarrierStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBarrierStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarrierStatementContext barrierStatement() throws RecognitionException {
		BarrierStatementContext _localctx = new BarrierStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_barrierStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(BARRIER);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==HardwareQubit) {
				{
				setState(282);
				gateOperandList();
				}
			}

			setState(285);
			match(SEMICOLON);
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

	public static class BoxStatementContext extends ParserRuleContext {
		public TerminalNode BOX() { return getToken(qasm3Parser.BOX, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public BoxStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBoxStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBoxStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBoxStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxStatementContext boxStatement() throws RecognitionException {
		BoxStatementContext _localctx = new BoxStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boxStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(BOX);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(288);
				designator();
				}
			}

			setState(291);
			scope();
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

	public static class DelayStatementContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(qasm3Parser.DELAY, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public GateOperandListContext gateOperandList() {
			return getRuleContext(GateOperandListContext.class,0);
		}
		public DelayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDelayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDelayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDelayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayStatementContext delayStatement() throws RecognitionException {
		DelayStatementContext _localctx = new DelayStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_delayStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(DELAY);
			setState(294);
			designator();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==HardwareQubit) {
				{
				setState(295);
				gateOperandList();
				}
			}

			setState(298);
			match(SEMICOLON);
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

	public static class GateCallStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public GateOperandListContext gateOperandList() {
			return getRuleContext(GateOperandListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public List<GateModifierContext> gateModifier() {
			return getRuleContexts(GateModifierContext.class);
		}
		public GateModifierContext gateModifier(int i) {
			return getRuleContext(GateModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode GPHASE() { return getToken(qasm3Parser.GPHASE, 0); }
		public GateCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterGateCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitGateCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitGateCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateCallStatementContext gateCallStatement() throws RecognitionException {
		GateCallStatementContext _localctx = new GateCallStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_gateCallStatement);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INV) | (1L << POW) | (1L << CTRL) | (1L << NEGCTRL))) != 0)) {
					{
					{
					setState(300);
					gateModifier();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(Identifier);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(307);
					match(LPAREN);
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << DURATIONOF) | (1L << BooleanLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
						{
						setState(308);
						expressionList();
						}
					}

					setState(311);
					match(RPAREN);
					}
				}

				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(314);
					designator();
					}
				}

				setState(317);
				gateOperandList();
				setState(318);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INV) | (1L << POW) | (1L << CTRL) | (1L << NEGCTRL))) != 0)) {
					{
					{
					setState(320);
					gateModifier();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(GPHASE);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(327);
					match(LPAREN);
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << DURATIONOF) | (1L << BooleanLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
						{
						setState(328);
						expressionList();
						}
					}

					setState(331);
					match(RPAREN);
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(334);
					designator();
					}
				}

				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier || _la==HardwareQubit) {
					{
					setState(337);
					gateOperandList();
					}
				}

				setState(340);
				match(SEMICOLON);
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

	public static class MeasureArrowAssignmentStatementContext extends ParserRuleContext {
		public MeasureExpressionContext measureExpression() {
			return getRuleContext(MeasureExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TerminalNode ARROW() { return getToken(qasm3Parser.ARROW, 0); }
		public IndexedIdentifierContext indexedIdentifier() {
			return getRuleContext(IndexedIdentifierContext.class,0);
		}
		public MeasureArrowAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureArrowAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterMeasureArrowAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitMeasureArrowAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitMeasureArrowAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureArrowAssignmentStatementContext measureArrowAssignmentStatement() throws RecognitionException {
		MeasureArrowAssignmentStatementContext _localctx = new MeasureArrowAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_measureArrowAssignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			measureExpression();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(344);
				match(ARROW);
				setState(345);
				indexedIdentifier();
				}
			}

			setState(348);
			match(SEMICOLON);
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

	public static class ResetStatementContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(qasm3Parser.RESET, 0); }
		public GateOperandContext gateOperand() {
			return getRuleContext(GateOperandContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ResetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterResetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitResetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitResetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetStatementContext resetStatement() throws RecognitionException {
		ResetStatementContext _localctx = new ResetStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_resetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(RESET);
			setState(351);
			gateOperand();
			setState(352);
			match(SEMICOLON);
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

	public static class AliasDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(qasm3Parser.LET, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public AliasExpressionContext aliasExpression() {
			return getRuleContext(AliasExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public AliasDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterAliasDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitAliasDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitAliasDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationStatementContext aliasDeclarationStatement() throws RecognitionException {
		AliasDeclarationStatementContext _localctx = new AliasDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aliasDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LET);
			setState(355);
			match(Identifier);
			setState(356);
			match(EQUALS);
			setState(357);
			aliasExpression();
			setState(358);
			match(SEMICOLON);
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

	public static class ClassicalDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public DeclarationExpressionContext declarationExpression() {
			return getRuleContext(DeclarationExpressionContext.class,0);
		}
		public ClassicalDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterClassicalDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitClassicalDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitClassicalDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicalDeclarationStatementContext classicalDeclarationStatement() throws RecognitionException {
		ClassicalDeclarationStatementContext _localctx = new ClassicalDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classicalDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case DURATION:
			case STRETCH:
				{
				setState(360);
				scalarType();
				}
				break;
			case ARRAY:
				{
				setState(361);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			match(Identifier);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(365);
				match(EQUALS);
				setState(366);
				declarationExpression();
				}
			}

			setState(369);
			match(SEMICOLON);
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

	public static class ConstDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(qasm3Parser.CONST, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public DeclarationExpressionContext declarationExpression() {
			return getRuleContext(DeclarationExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ConstDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterConstDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitConstDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitConstDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationStatementContext constDeclarationStatement() throws RecognitionException {
		ConstDeclarationStatementContext _localctx = new ConstDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(CONST);
			setState(372);
			scalarType();
			setState(373);
			match(Identifier);
			setState(374);
			match(EQUALS);
			setState(375);
			declarationExpression();
			setState(376);
			match(SEMICOLON);
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

	public static class IoDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TerminalNode INPUT() { return getToken(qasm3Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(qasm3Parser.OUTPUT, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public IoDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIoDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIoDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIoDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoDeclarationStatementContext ioDeclarationStatement() throws RecognitionException {
		IoDeclarationStatementContext _localctx = new IoDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ioDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case DURATION:
			case STRETCH:
				{
				setState(379);
				scalarType();
				}
				break;
			case ARRAY:
				{
				setState(380);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(383);
			match(Identifier);
			setState(384);
			match(SEMICOLON);
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

	public static class OldStyleDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TerminalNode CREG() { return getToken(qasm3Parser.CREG, 0); }
		public TerminalNode QREG() { return getToken(qasm3Parser.QREG, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public OldStyleDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldStyleDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterOldStyleDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitOldStyleDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitOldStyleDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OldStyleDeclarationStatementContext oldStyleDeclarationStatement() throws RecognitionException {
		OldStyleDeclarationStatementContext _localctx = new OldStyleDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_oldStyleDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==QREG || _la==CREG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(387);
			match(Identifier);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(388);
				designator();
				}
			}

			setState(391);
			match(SEMICOLON);
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

	public static class QuantumDeclarationStatementContext extends ParserRuleContext {
		public QubitTypeContext qubitType() {
			return getRuleContext(QubitTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public QuantumDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterQuantumDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitQuantumDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitQuantumDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantumDeclarationStatementContext quantumDeclarationStatement() throws RecognitionException {
		QuantumDeclarationStatementContext _localctx = new QuantumDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_quantumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			qubitType();
			setState(394);
			match(Identifier);
			setState(395);
			match(SEMICOLON);
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

	public static class DefStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(qasm3Parser.DEF, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ArgumentDefinitionListContext argumentDefinitionList() {
			return getRuleContext(ArgumentDefinitionListContext.class,0);
		}
		public ReturnSignatureContext returnSignature() {
			return getRuleContext(ReturnSignatureContext.class,0);
		}
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(DEF);
			setState(398);
			match(Identifier);
			setState(399);
			match(LPAREN);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READONLY) | (1L << MUTABLE) | (1L << QREG) | (1L << QUBIT) | (1L << CREG) | (1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << DURATION) | (1L << STRETCH))) != 0)) {
				{
				setState(400);
				argumentDefinitionList();
				}
			}

			setState(403);
			match(RPAREN);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(404);
				returnSignature();
				}
			}

			setState(407);
			scope();
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

	public static class ExternStatementContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(qasm3Parser.EXTERN, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ExternArgumentListContext externArgumentList() {
			return getRuleContext(ExternArgumentListContext.class,0);
		}
		public ReturnSignatureContext returnSignature() {
			return getRuleContext(ReturnSignatureContext.class,0);
		}
		public ExternStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterExternStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitExternStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitExternStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternStatementContext externStatement() throws RecognitionException {
		ExternStatementContext _localctx = new ExternStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_externStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(EXTERN);
			setState(410);
			match(Identifier);
			setState(411);
			match(LPAREN);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READONLY) | (1L << MUTABLE) | (1L << CREG) | (1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << DURATION) | (1L << STRETCH))) != 0)) {
				{
				setState(412);
				externArgumentList();
				}
			}

			setState(415);
			match(RPAREN);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(416);
				returnSignature();
				}
			}

			setState(419);
			match(SEMICOLON);
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

	public static class GateStatementContext extends ParserRuleContext {
		public IdentifierListContext params;
		public IdentifierListContext qubits;
		public TerminalNode GATE() { return getToken(qasm3Parser.GATE, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public GateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterGateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitGateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitGateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateStatementContext gateStatement() throws RecognitionException {
		GateStatementContext _localctx = new GateStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(GATE);
			setState(422);
			match(Identifier);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(423);
				match(LPAREN);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(424);
					((GateStatementContext)_localctx).params = identifierList();
					}
				}

				setState(427);
				match(RPAREN);
				}
			}

			setState(430);
			((GateStatementContext)_localctx).qubits = identifierList();
			setState(431);
			scope();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public Token op;
		public IndexedIdentifierContext indexedIdentifier() {
			return getRuleContext(IndexedIdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public TerminalNode CompoundAssignmentOperator() { return getToken(qasm3Parser.CompoundAssignmentOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MeasureExpressionContext measureExpression() {
			return getRuleContext(MeasureExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			indexedIdentifier();
			setState(434);
			((AssignmentStatementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==CompoundAssignmentOperator) ) {
				((AssignmentStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				{
				setState(435);
				expression(0);
				}
				break;
			case MEASURE:
				{
				setState(436);
				measureExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(439);
			match(SEMICOLON);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			expression(0);
			setState(442);
			match(SEMICOLON);
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

	public static class CalStatementContext extends ParserRuleContext {
		public TerminalNode CAL() { return getToken(qasm3Parser.CAL, 0); }
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public TerminalNode CalibrationBlock() { return getToken(qasm3Parser.CalibrationBlock, 0); }
		public CalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterCalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitCalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitCalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalStatementContext calStatement() throws RecognitionException {
		CalStatementContext _localctx = new CalStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_calStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(CAL);
			setState(445);
			match(LBRACE);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CalibrationBlock) {
				{
				setState(446);
				match(CalibrationBlock);
				}
			}

			setState(449);
			match(RBRACE);
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

	public static class DefcalStatementContext extends ParserRuleContext {
		public TerminalNode DEFCAL() { return getToken(qasm3Parser.DEFCAL, 0); }
		public DefcalTargetContext defcalTarget() {
			return getRuleContext(DefcalTargetContext.class,0);
		}
		public DefcalOperandListContext defcalOperandList() {
			return getRuleContext(DefcalOperandListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ReturnSignatureContext returnSignature() {
			return getRuleContext(ReturnSignatureContext.class,0);
		}
		public TerminalNode CalibrationBlock() { return getToken(qasm3Parser.CalibrationBlock, 0); }
		public DefcalArgumentDefinitionListContext defcalArgumentDefinitionList() {
			return getRuleContext(DefcalArgumentDefinitionListContext.class,0);
		}
		public DefcalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefcalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefcalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefcalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcalStatementContext defcalStatement() throws RecognitionException {
		DefcalStatementContext _localctx = new DefcalStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_defcalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(DEFCAL);
			setState(452);
			defcalTarget();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(453);
				match(LPAREN);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READONLY) | (1L << MUTABLE) | (1L << QREG) | (1L << QUBIT) | (1L << CREG) | (1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << DURATIONOF) | (1L << BooleanLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
					{
					setState(454);
					defcalArgumentDefinitionList();
					}
				}

				setState(457);
				match(RPAREN);
				}
			}

			setState(460);
			defcalOperandList();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(461);
				returnSignature();
				}
			}

			setState(464);
			match(LBRACE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CalibrationBlock) {
				{
				setState(465);
				match(CalibrationBlock);
				}
			}

			setState(468);
			match(RBRACE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitwiseXorExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CARET() { return getToken(qasm3Parser.CARET, 0); }
		public BitwiseXorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBitwiseXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBitwiseXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBitwiseXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(qasm3Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(qasm3Parser.MINUS, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DurationofExpressionContext extends ExpressionContext {
		public TerminalNode DURATIONOF() { return getToken(qasm3Parser.DURATIONOF, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public DurationofExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDurationofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDurationofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDurationofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ComparisonOperator() { return getToken(qasm3Parser.ComparisonOperator, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(qasm3Parser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(qasm3Parser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(qasm3Parser.PERCENT, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOUBLE_PIPE() { return getToken(qasm3Parser.DOUBLE_PIPE, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOUBLE_ASTERISK() { return getToken(qasm3Parser.DOUBLE_ASTERISK, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(qasm3Parser.PIPE, 0); }
		public BitwiseOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBitwiseOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBitwiseOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitshiftExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitshiftOperator() { return getToken(qasm3Parser.BitshiftOperator, 0); }
		public BitshiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBitshiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBitshiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBitshiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(qasm3Parser.AMPERSAND, 0); }
		public BitwiseAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EqualityOperator() { return getToken(qasm3Parser.EqualityOperator, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOUBLE_AMPERSAND() { return getToken(qasm3Parser.DOUBLE_AMPERSAND, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexOperatorContext indexOperator() {
			return getRuleContext(IndexOperatorContext.class,0);
		}
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(qasm3Parser.TILDE, 0); }
		public TerminalNode EXCLAMATION_POINT() { return getToken(qasm3Parser.EXCLAMATION_POINT, 0); }
		public TerminalNode MINUS() { return getToken(qasm3Parser.MINUS, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(qasm3Parser.BinaryIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(qasm3Parser.OctalIntegerLiteral, 0); }
		public TerminalNode DecimalIntegerLiteral() { return getToken(qasm3Parser.DecimalIntegerLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(qasm3Parser.HexIntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(qasm3Parser.FloatLiteral, 0); }
		public TerminalNode ImaginaryLiteral() { return getToken(qasm3Parser.ImaginaryLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(qasm3Parser.BooleanLiteral, 0); }
		public TerminalNode BitstringLiteral() { return getToken(qasm3Parser.BitstringLiteral, 0); }
		public TerminalNode TimingLiteral() { return getToken(qasm3Parser.TimingLiteral, 0); }
		public TerminalNode HardwareQubit() { return getToken(qasm3Parser.HardwareQubit, 0); }
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(471);
				match(LPAREN);
				setState(472);
				expression(0);
				setState(473);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)))) != 0)) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				expression(15);
				}
				break;
			case 3:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BIT:
				case INT:
				case UINT:
				case FLOAT:
				case ANGLE:
				case COMPLEX:
				case DURATION:
				case STRETCH:
					{
					setState(477);
					scalarType();
					}
					break;
				case ARRAY:
					{
					setState(478);
					arrayType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(481);
				match(LPAREN);
				setState(482);
				expression(0);
				setState(483);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new DurationofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485);
				match(DURATIONOF);
				setState(486);
				match(LPAREN);
				setState(487);
				scope();
				setState(488);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new CallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(490);
				match(Identifier);
				setState(491);
				match(LPAREN);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << DURATIONOF) | (1L << BooleanLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
					{
					setState(492);
					expressionList();
					}
				}

				setState(495);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (BooleanLiteral - 55)) | (1L << (ImaginaryLiteral - 55)) | (1L << (BinaryIntegerLiteral - 55)) | (1L << (OctalIntegerLiteral - 55)) | (1L << (DecimalIntegerLiteral - 55)) | (1L << (HexIntegerLiteral - 55)) | (1L << (Identifier - 55)) | (1L << (HardwareQubit - 55)) | (1L << (FloatLiteral - 55)) | (1L << (TimingLiteral - 55)) | (1L << (BitstringLiteral - 55)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(500);
						((PowerExpressionContext)_localctx).op = match(DOUBLE_ASTERISK);
						setState(501);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(502);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(503);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ASTERISK - 71)) | (1L << (SLASH - 71)) | (1L << (PERCENT - 71)))) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(504);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(505);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(506);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(507);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new BitshiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(508);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(509);
						((BitshiftExpressionContext)_localctx).op = match(BitshiftOperator);
						setState(510);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(511);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(512);
						((ComparisonExpressionContext)_localctx).op = match(ComparisonOperator);
						setState(513);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(514);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(515);
						((EqualityExpressionContext)_localctx).op = match(EqualityOperator);
						setState(516);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(518);
						((BitwiseAndExpressionContext)_localctx).op = match(AMPERSAND);
						setState(519);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseXorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(520);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(521);
						((BitwiseXorExpressionContext)_localctx).op = match(CARET);
						setState(522);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(524);
						((BitwiseOrExpressionContext)_localctx).op = match(PIPE);
						setState(525);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(526);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(527);
						((LogicalAndExpressionContext)_localctx).op = match(DOUBLE_AMPERSAND);
						setState(528);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(529);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(530);
						((LogicalOrExpressionContext)_localctx).op = match(DOUBLE_PIPE);
						setState(531);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(532);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(533);
						indexOperator();
						}
						break;
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class AliasExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOUBLE_PLUS() { return getTokens(qasm3Parser.DOUBLE_PLUS); }
		public TerminalNode DOUBLE_PLUS(int i) {
			return getToken(qasm3Parser.DOUBLE_PLUS, i);
		}
		public AliasExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterAliasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitAliasExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitAliasExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasExpressionContext aliasExpression() throws RecognitionException {
		AliasExpressionContext _localctx = new AliasExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_aliasExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			expression(0);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_PLUS) {
				{
				{
				setState(540);
				match(DOUBLE_PLUS);
				setState(541);
				expression(0);
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclarationExpressionContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MeasureExpressionContext measureExpression() {
			return getRuleContext(MeasureExpressionContext.class,0);
		}
		public DeclarationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationExpressionContext declarationExpression() throws RecognitionException {
		DeclarationExpressionContext _localctx = new DeclarationExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declarationExpression);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				arrayLiteral();
				}
				break;
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				expression(0);
				}
				break;
			case MEASURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				measureExpression();
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

	public static class MeasureExpressionContext extends ParserRuleContext {
		public TerminalNode MEASURE() { return getToken(qasm3Parser.MEASURE, 0); }
		public GateOperandContext gateOperand() {
			return getRuleContext(GateOperandContext.class,0);
		}
		public MeasureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterMeasureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitMeasureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitMeasureExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureExpressionContext measureExpression() throws RecognitionException {
		MeasureExpressionContext _localctx = new MeasureExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_measureExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(MEASURE);
			setState(553);
			gateOperand();
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(qasm3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(qasm3Parser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_rangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << DURATIONOF) | (1L << BooleanLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
				{
				setState(555);
				expression(0);
				}
			}

			setState(558);
			match(COLON);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BIT) | (1L << INT) | (1L << UINT) | (1L << FLOAT) | (1L << ANGLE) | (1L << COMPLEX) | (1L << ARRAY) | (1L << DURATION) | (1L << STRETCH) | (1L << DURATIONOF) | (1L << BooleanLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (MINUS - 70)) | (1L << (TILDE - 70)) | (1L << (EXCLAMATION_POINT - 70)) | (1L << (ImaginaryLiteral - 70)) | (1L << (BinaryIntegerLiteral - 70)) | (1L << (OctalIntegerLiteral - 70)) | (1L << (DecimalIntegerLiteral - 70)) | (1L << (HexIntegerLiteral - 70)) | (1L << (Identifier - 70)) | (1L << (HardwareQubit - 70)) | (1L << (FloatLiteral - 70)) | (1L << (TimingLiteral - 70)) | (1L << (BitstringLiteral - 70)))) != 0)) {
				{
				setState(559);
				expression(0);
				}
			}

			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(562);
				match(COLON);
				setState(563);
				expression(0);
				}
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

	public static class SetExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public SetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterSetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitSetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExpressionContext setExpression() throws RecognitionException {
		SetExpressionContext _localctx = new SetExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_setExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(LBRACE);
			setState(567);
			expression(0);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					match(COMMA);
					setState(569);
					expression(0);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(575);
				match(COMMA);
				}
			}

			setState(578);
			match(RBRACE);
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ArrayLiteralContext> arrayLiteral() {
			return getRuleContexts(ArrayLiteralContext.class);
		}
		public ArrayLiteralContext arrayLiteral(int i) {
			return getRuleContext(ArrayLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(LBRACE);
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				{
				setState(581);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(582);
				arrayLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
					match(COMMA);
					setState(588);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL:
					case BIT:
					case INT:
					case UINT:
					case FLOAT:
					case ANGLE:
					case COMPLEX:
					case ARRAY:
					case DURATION:
					case STRETCH:
					case DURATIONOF:
					case BooleanLiteral:
					case LPAREN:
					case MINUS:
					case TILDE:
					case EXCLAMATION_POINT:
					case ImaginaryLiteral:
					case BinaryIntegerLiteral:
					case OctalIntegerLiteral:
					case DecimalIntegerLiteral:
					case HexIntegerLiteral:
					case Identifier:
					case HardwareQubit:
					case FloatLiteral:
					case TimingLiteral:
					case BitstringLiteral:
						{
						setState(586);
						expression(0);
						}
						break;
					case LBRACE:
						{
						setState(587);
						arrayLiteral();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(595);
				match(COMMA);
				}
			}

			setState(598);
			match(RBRACE);
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

	public static class IndexOperatorContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public SetExpressionContext setExpression() {
			return getRuleContext(SetExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public IndexOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIndexOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIndexOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIndexOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOperatorContext indexOperator() throws RecognitionException {
		IndexOperatorContext _localctx = new IndexOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indexOperator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(LBRACKET);
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(601);
				setExpression();
				}
				break;
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case COLON:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				{
				setState(604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(602);
					expression(0);
					}
					break;
				case 2:
					{
					setState(603);
					rangeExpression();
					}
					break;
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(606);
						match(COMMA);
						setState(609);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(607);
							expression(0);
							}
							break;
						case 2:
							{
							setState(608);
							rangeExpression();
							}
							break;
						}
						}
						} 
					}
					setState(615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(616);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(621);
			match(RBRACKET);
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

	public static class IndexedIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public List<IndexOperatorContext> indexOperator() {
			return getRuleContexts(IndexOperatorContext.class);
		}
		public IndexOperatorContext indexOperator(int i) {
			return getRuleContext(IndexOperatorContext.class,i);
		}
		public IndexedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIndexedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIndexedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIndexedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexedIdentifierContext indexedIdentifier() throws RecognitionException {
		IndexedIdentifierContext _localctx = new IndexedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indexedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(Identifier);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(624);
				indexOperator();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ReturnSignatureContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(qasm3Parser.ARROW, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public ReturnSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterReturnSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitReturnSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitReturnSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnSignatureContext returnSignature() throws RecognitionException {
		ReturnSignatureContext _localctx = new ReturnSignatureContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_returnSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(ARROW);
			setState(631);
			scalarType();
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

	public static class GateModifierContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(qasm3Parser.AT, 0); }
		public TerminalNode INV() { return getToken(qasm3Parser.INV, 0); }
		public TerminalNode POW() { return getToken(qasm3Parser.POW, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public TerminalNode CTRL() { return getToken(qasm3Parser.CTRL, 0); }
		public TerminalNode NEGCTRL() { return getToken(qasm3Parser.NEGCTRL, 0); }
		public GateModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterGateModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitGateModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitGateModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateModifierContext gateModifier() throws RecognitionException {
		GateModifierContext _localctx = new GateModifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_gateModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INV:
				{
				setState(633);
				match(INV);
				}
				break;
			case POW:
				{
				setState(634);
				match(POW);
				setState(635);
				match(LPAREN);
				setState(636);
				expression(0);
				setState(637);
				match(RPAREN);
				}
				break;
			case CTRL:
			case NEGCTRL:
				{
				setState(639);
				_la = _input.LA(1);
				if ( !(_la==CTRL || _la==NEGCTRL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(640);
					match(LPAREN);
					setState(641);
					expression(0);
					setState(642);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(648);
			match(AT);
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode BIT() { return getToken(qasm3Parser.BIT, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode INT() { return getToken(qasm3Parser.INT, 0); }
		public TerminalNode UINT() { return getToken(qasm3Parser.UINT, 0); }
		public TerminalNode FLOAT() { return getToken(qasm3Parser.FLOAT, 0); }
		public TerminalNode ANGLE() { return getToken(qasm3Parser.ANGLE, 0); }
		public TerminalNode BOOL() { return getToken(qasm3Parser.BOOL, 0); }
		public TerminalNode DURATION() { return getToken(qasm3Parser.DURATION, 0); }
		public TerminalNode STRETCH() { return getToken(qasm3Parser.STRETCH, 0); }
		public TerminalNode COMPLEX() { return getToken(qasm3Parser.COMPLEX, 0); }
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_scalarType);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(BIT);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(651);
					designator();
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(INT);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(655);
					designator();
					}
				}

				}
				break;
			case UINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(UINT);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(659);
					designator();
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				match(FLOAT);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(663);
					designator();
					}
				}

				}
				break;
			case ANGLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				match(ANGLE);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(667);
					designator();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(670);
				match(BOOL);
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 7);
				{
				setState(671);
				match(DURATION);
				}
				break;
			case STRETCH:
				enterOuterAlt(_localctx, 8);
				{
				setState(672);
				match(STRETCH);
				}
				break;
			case COMPLEX:
				enterOuterAlt(_localctx, 9);
				{
				setState(673);
				match(COMPLEX);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(674);
					match(LBRACKET);
					setState(675);
					scalarType();
					setState(676);
					match(RBRACKET);
					}
				}

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

	public static class QubitTypeContext extends ParserRuleContext {
		public TerminalNode QUBIT() { return getToken(qasm3Parser.QUBIT, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public QubitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qubitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterQubitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitQubitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitQubitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QubitTypeContext qubitType() throws RecognitionException {
		QubitTypeContext _localctx = new QubitTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_qubitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(QUBIT);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(683);
				designator();
				}
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(qasm3Parser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(qasm3Parser.COMMA, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(ARRAY);
			setState(687);
			match(LBRACKET);
			setState(688);
			scalarType();
			setState(689);
			match(COMMA);
			setState(690);
			expressionList();
			setState(691);
			match(RBRACKET);
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

	public static class ArrayReferenceTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(qasm3Parser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(qasm3Parser.COMMA, 0); }
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public TerminalNode READONLY() { return getToken(qasm3Parser.READONLY, 0); }
		public TerminalNode MUTABLE() { return getToken(qasm3Parser.MUTABLE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DIM() { return getToken(qasm3Parser.DIM, 0); }
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterArrayReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitArrayReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitArrayReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayReferenceTypeContext arrayReferenceType() throws RecognitionException {
		ArrayReferenceTypeContext _localctx = new ArrayReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayReferenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !(_la==READONLY || _la==MUTABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(694);
			match(ARRAY);
			setState(695);
			match(LBRACKET);
			setState(696);
			scalarType();
			setState(697);
			match(COMMA);
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case ARRAY:
			case DURATION:
			case STRETCH:
			case DURATIONOF:
			case BooleanLiteral:
			case LPAREN:
			case MINUS:
			case TILDE:
			case EXCLAMATION_POINT:
			case ImaginaryLiteral:
			case BinaryIntegerLiteral:
			case OctalIntegerLiteral:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case Identifier:
			case HardwareQubit:
			case FloatLiteral:
			case TimingLiteral:
			case BitstringLiteral:
				{
				setState(698);
				expressionList();
				}
				break;
			case DIM:
				{
				setState(699);
				match(DIM);
				setState(700);
				match(EQUALS);
				setState(701);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(704);
			match(RBRACKET);
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(LBRACKET);
			setState(707);
			expression(0);
			setState(708);
			match(RBRACKET);
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

	public static class DefcalTargetContext extends ParserRuleContext {
		public TerminalNode MEASURE() { return getToken(qasm3Parser.MEASURE, 0); }
		public TerminalNode RESET() { return getToken(qasm3Parser.RESET, 0); }
		public TerminalNode DELAY() { return getToken(qasm3Parser.DELAY, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public DefcalTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcalTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefcalTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefcalTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefcalTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcalTargetContext defcalTarget() throws RecognitionException {
		DefcalTargetContext _localctx = new DefcalTargetContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_defcalTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DELAY - 51)) | (1L << (RESET - 51)) | (1L << (MEASURE - 51)) | (1L << (Identifier - 51)))) != 0)) ) {
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

	public static class DefcalArgumentDefinitionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentDefinitionContext argumentDefinition() {
			return getRuleContext(ArgumentDefinitionContext.class,0);
		}
		public DefcalArgumentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcalArgumentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefcalArgumentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefcalArgumentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefcalArgumentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcalArgumentDefinitionContext defcalArgumentDefinition() throws RecognitionException {
		DefcalArgumentDefinitionContext _localctx = new DefcalArgumentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_defcalArgumentDefinition);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				argumentDefinition();
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

	public static class DefcalOperandContext extends ParserRuleContext {
		public TerminalNode HardwareQubit() { return getToken(qasm3Parser.HardwareQubit, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public DefcalOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcalOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefcalOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefcalOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefcalOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcalOperandContext defcalOperand() throws RecognitionException {
		DefcalOperandContext _localctx = new DefcalOperandContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_defcalOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==HardwareQubit) ) {
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

	public static class GateOperandContext extends ParserRuleContext {
		public IndexedIdentifierContext indexedIdentifier() {
			return getRuleContext(IndexedIdentifierContext.class,0);
		}
		public TerminalNode HardwareQubit() { return getToken(qasm3Parser.HardwareQubit, 0); }
		public GateOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterGateOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitGateOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitGateOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateOperandContext gateOperand() throws RecognitionException {
		GateOperandContext _localctx = new GateOperandContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gateOperand);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				indexedIdentifier();
				}
				break;
			case HardwareQubit:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(HardwareQubit);
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

	public static class ExternArgumentContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public ArrayReferenceTypeContext arrayReferenceType() {
			return getRuleContext(ArrayReferenceTypeContext.class,0);
		}
		public TerminalNode CREG() { return getToken(qasm3Parser.CREG, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExternArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterExternArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitExternArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitExternArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternArgumentContext externArgument() throws RecognitionException {
		ExternArgumentContext _localctx = new ExternArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_externArgument);
		int _la;
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case DURATION:
			case STRETCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				scalarType();
				}
				break;
			case READONLY:
			case MUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				arrayReferenceType();
				}
				break;
			case CREG:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				match(CREG);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(725);
					designator();
					}
				}

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

	public static class ArgumentDefinitionContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public QubitTypeContext qubitType() {
			return getRuleContext(QubitTypeContext.class,0);
		}
		public TerminalNode CREG() { return getToken(qasm3Parser.CREG, 0); }
		public TerminalNode QREG() { return getToken(qasm3Parser.QREG, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ArrayReferenceTypeContext arrayReferenceType() {
			return getRuleContext(ArrayReferenceTypeContext.class,0);
		}
		public ArgumentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterArgumentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitArgumentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitArgumentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDefinitionContext argumentDefinition() throws RecognitionException {
		ArgumentDefinitionContext _localctx = new ArgumentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_argumentDefinition);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BIT:
			case INT:
			case UINT:
			case FLOAT:
			case ANGLE:
			case COMPLEX:
			case DURATION:
			case STRETCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				scalarType();
				setState(731);
				match(Identifier);
				}
				break;
			case QUBIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				qubitType();
				setState(734);
				match(Identifier);
				}
				break;
			case QREG:
			case CREG:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				_la = _input.LA(1);
				if ( !(_la==QREG || _la==CREG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(737);
				match(Identifier);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(738);
					designator();
					}
				}

				}
				break;
			case READONLY:
			case MUTABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				arrayReferenceType();
				setState(742);
				match(Identifier);
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

	public static class ArgumentDefinitionListContext extends ParserRuleContext {
		public List<ArgumentDefinitionContext> argumentDefinition() {
			return getRuleContexts(ArgumentDefinitionContext.class);
		}
		public ArgumentDefinitionContext argumentDefinition(int i) {
			return getRuleContext(ArgumentDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ArgumentDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterArgumentDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitArgumentDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitArgumentDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDefinitionListContext argumentDefinitionList() throws RecognitionException {
		ArgumentDefinitionListContext _localctx = new ArgumentDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_argumentDefinitionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			argumentDefinition();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					match(COMMA);
					setState(748);
					argumentDefinition();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(754);
				match(COMMA);
				}
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

	public static class DefcalArgumentDefinitionListContext extends ParserRuleContext {
		public List<DefcalArgumentDefinitionContext> defcalArgumentDefinition() {
			return getRuleContexts(DefcalArgumentDefinitionContext.class);
		}
		public DefcalArgumentDefinitionContext defcalArgumentDefinition(int i) {
			return getRuleContext(DefcalArgumentDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public DefcalArgumentDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcalArgumentDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefcalArgumentDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefcalArgumentDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefcalArgumentDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcalArgumentDefinitionListContext defcalArgumentDefinitionList() throws RecognitionException {
		DefcalArgumentDefinitionListContext _localctx = new DefcalArgumentDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_defcalArgumentDefinitionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			defcalArgumentDefinition();
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(758);
					match(COMMA);
					setState(759);
					defcalArgumentDefinition();
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(765);
				match(COMMA);
				}
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

	public static class DefcalOperandListContext extends ParserRuleContext {
		public List<DefcalOperandContext> defcalOperand() {
			return getRuleContexts(DefcalOperandContext.class);
		}
		public DefcalOperandContext defcalOperand(int i) {
			return getRuleContext(DefcalOperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public DefcalOperandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcalOperandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterDefcalOperandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitDefcalOperandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitDefcalOperandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcalOperandListContext defcalOperandList() throws RecognitionException {
		DefcalOperandListContext _localctx = new DefcalOperandListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_defcalOperandList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			defcalOperand();
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					match(COMMA);
					setState(770);
					defcalOperand();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(776);
				match(COMMA);
				}
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			expression(0);
			setState(784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(780);
					match(COMMA);
					setState(781);
					expression(0);
					}
					} 
				}
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(787);
				match(COMMA);
				}
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(qasm3Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(qasm3Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(Identifier);
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(791);
					match(COMMA);
					setState(792);
					match(Identifier);
					}
					} 
				}
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(798);
				match(COMMA);
				}
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

	public static class GateOperandListContext extends ParserRuleContext {
		public List<GateOperandContext> gateOperand() {
			return getRuleContexts(GateOperandContext.class);
		}
		public GateOperandContext gateOperand(int i) {
			return getRuleContext(GateOperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public GateOperandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateOperandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterGateOperandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitGateOperandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitGateOperandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateOperandListContext gateOperandList() throws RecognitionException {
		GateOperandListContext _localctx = new GateOperandListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_gateOperandList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			gateOperand();
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(802);
					match(COMMA);
					setState(803);
					gateOperand();
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(809);
				match(COMMA);
				}
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

	public static class ExternArgumentListContext extends ParserRuleContext {
		public List<ExternArgumentContext> externArgument() {
			return getRuleContexts(ExternArgumentContext.class);
		}
		public ExternArgumentContext externArgument(int i) {
			return getRuleContext(ExternArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ExternArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).enterExternArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qasm3ParserListener ) ((qasm3ParserListener)listener).exitExternArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qasm3ParserVisitor ) return ((qasm3ParserVisitor<? extends T>)visitor).visitExternArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternArgumentListContext externArgumentList() throws RecognitionException {
		ExternArgumentListContext _localctx = new ExternArgumentListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_externArgumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			externArgument();
			setState(817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(813);
					match(COMMA);
					setState(814);
					externArgument();
					}
					} 
				}
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(820);
				match(COMMA);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u033a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\5\2\u0088\n\2\3\2\7\2\u008b\n"+
		"\2\f\2\16\2\u008e\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4\u0098\n\4\f"+
		"\4\16\4\u009b\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ba"+
		"\n\4\5\4\u00bc\n\4\3\5\3\5\5\5\u00c0\n\5\3\6\3\6\7\6\u00c4\n\6\f\6\16"+
		"\6\u00c7\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\u00d0\n\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ed\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f8\n\17\3\20\3\20\3\20\5\20\u00fd"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u010d\n\22\f\22\16\22\u0110\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u011a\n\23\3\24\3\24\5\24\u011e\n\24\3\24\3\24\3"+
		"\25\3\25\5\25\u0124\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u012b\n\26\3\26"+
		"\3\26\3\27\7\27\u0130\n\27\f\27\16\27\u0133\13\27\3\27\3\27\3\27\5\27"+
		"\u0138\n\27\3\27\5\27\u013b\n\27\3\27\5\27\u013e\n\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0144\n\27\f\27\16\27\u0147\13\27\3\27\3\27\3\27\5\27\u014c\n"+
		"\27\3\27\5\27\u014f\n\27\3\27\5\27\u0152\n\27\3\27\5\27\u0155\n\27\3\27"+
		"\5\27\u0158\n\27\3\30\3\30\3\30\5\30\u015d\n\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u016d\n\33\3\33"+
		"\3\33\3\33\5\33\u0172\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\5\35\u0180\n\35\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0188"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u0194\n \3 \3 \5 \u0198"+
		"\n \3 \3 \3!\3!\3!\3!\5!\u01a0\n!\3!\3!\5!\u01a4\n!\3!\3!\3\"\3\"\3\""+
		"\3\"\5\"\u01ac\n\"\3\"\5\"\u01af\n\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u01b8"+
		"\n#\3#\3#\3$\3$\3$\3%\3%\3%\5%\u01c2\n%\3%\3%\3&\3&\3&\3&\5&\u01ca\n&"+
		"\3&\5&\u01cd\n&\3&\3&\5&\u01d1\n&\3&\3&\5&\u01d5\n&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01e2\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u01f0\n\'\3\'\3\'\5\'\u01f4\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0219\n\'\f\'"+
		"\16\'\u021c\13\'\3(\3(\3(\7(\u0221\n(\f(\16(\u0224\13(\3)\3)\3)\5)\u0229"+
		"\n)\3*\3*\3*\3+\5+\u022f\n+\3+\3+\5+\u0233\n+\3+\3+\5+\u0237\n+\3,\3,"+
		"\3,\3,\7,\u023d\n,\f,\16,\u0240\13,\3,\5,\u0243\n,\3,\3,\3-\3-\3-\5-\u024a"+
		"\n-\3-\3-\3-\5-\u024f\n-\7-\u0251\n-\f-\16-\u0254\13-\3-\5-\u0257\n-\3"+
		"-\3-\3.\3.\3.\3.\5.\u025f\n.\3.\3.\3.\5.\u0264\n.\7.\u0266\n.\f.\16.\u0269"+
		"\13.\3.\5.\u026c\n.\5.\u026e\n.\3.\3.\3/\3/\7/\u0274\n/\f/\16/\u0277\13"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0287\n\61\5\61\u0289\n\61\3\61\3\61\3\62\3\62\5\62\u028f\n\62\3"+
		"\62\3\62\5\62\u0293\n\62\3\62\3\62\5\62\u0297\n\62\3\62\3\62\5\62\u029b"+
		"\n\62\3\62\3\62\5\62\u029f\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u02a9\n\62\5\62\u02ab\n\62\3\63\3\63\5\63\u02af\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u02c1\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\38\38\58\u02cd"+
		"\n8\39\39\3:\3:\5:\u02d3\n:\3;\3;\3;\3;\5;\u02d9\n;\5;\u02db\n;\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\5<\u02e6\n<\3<\3<\3<\5<\u02eb\n<\3=\3=\3=\7=\u02f0"+
		"\n=\f=\16=\u02f3\13=\3=\5=\u02f6\n=\3>\3>\3>\7>\u02fb\n>\f>\16>\u02fe"+
		"\13>\3>\5>\u0301\n>\3?\3?\3?\7?\u0306\n?\f?\16?\u0309\13?\3?\5?\u030c"+
		"\n?\3@\3@\3@\7@\u0311\n@\f@\16@\u0314\13@\3@\5@\u0317\n@\3A\3A\3A\7A\u031c"+
		"\nA\fA\16A\u031f\13A\3A\5A\u0322\nA\3B\3B\3B\7B\u0327\nB\fB\16B\u032a"+
		"\13B\3B\5B\u032d\nB\3C\3C\3C\7C\u0332\nC\fC\16C\u0335\13C\3C\5C\u0338"+
		"\nC\3C\2\3LD\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\2\r\3\2\33"+
		"\34\4\2  \"\"\4\2DDVV\4\2HHST\4\299Zc\4\2IIKL\4\2FFHH\3\2\61\62\3\2\36"+
		"\37\4\2\65\67__\3\2_`\2\u038e\2\u0087\3\2\2\2\4\u0091\3\2\2\2\6\u00bb"+
		"\3\2\2\2\b\u00bd\3\2\2\2\n\u00c1\3\2\2\2\f\u00ca\3\2\2\2\16\u00cf\3\2"+
		"\2\2\20\u00d1\3\2\2\2\22\u00d5\3\2\2\2\24\u00d9\3\2\2\2\26\u00dc\3\2\2"+
		"\2\30\u00df\3\2\2\2\32\u00e2\3\2\2\2\34\u00f0\3\2\2\2\36\u00f9\3\2\2\2"+
		" \u0100\3\2\2\2\"\u0106\3\2\2\2$\u0119\3\2\2\2&\u011b\3\2\2\2(\u0121\3"+
		"\2\2\2*\u0127\3\2\2\2,\u0157\3\2\2\2.\u0159\3\2\2\2\60\u0160\3\2\2\2\62"+
		"\u0164\3\2\2\2\64\u016c\3\2\2\2\66\u0175\3\2\2\28\u017c\3\2\2\2:\u0184"+
		"\3\2\2\2<\u018b\3\2\2\2>\u018f\3\2\2\2@\u019b\3\2\2\2B\u01a7\3\2\2\2D"+
		"\u01b3\3\2\2\2F\u01bb\3\2\2\2H\u01be\3\2\2\2J\u01c5\3\2\2\2L\u01f3\3\2"+
		"\2\2N\u021d\3\2\2\2P\u0228\3\2\2\2R\u022a\3\2\2\2T\u022e\3\2\2\2V\u0238"+
		"\3\2\2\2X\u0246\3\2\2\2Z\u025a\3\2\2\2\\\u0271\3\2\2\2^\u0278\3\2\2\2"+
		"`\u0288\3\2\2\2b\u02aa\3\2\2\2d\u02ac\3\2\2\2f\u02b0\3\2\2\2h\u02b7\3"+
		"\2\2\2j\u02c4\3\2\2\2l\u02c8\3\2\2\2n\u02cc\3\2\2\2p\u02ce\3\2\2\2r\u02d2"+
		"\3\2\2\2t\u02da\3\2\2\2v\u02ea\3\2\2\2x\u02ec\3\2\2\2z\u02f7\3\2\2\2|"+
		"\u0302\3\2\2\2~\u030d\3\2\2\2\u0080\u0318\3\2\2\2\u0082\u0323\3\2\2\2"+
		"\u0084\u032e\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\16\b\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\2\2\3\u0090\3\3\2\2\2\u0091"+
		"\u0092\7\3\2\2\u0092\u0093\7i\2\2\u0093\u0094\7A\2\2\u0094\5\3\2\2\2\u0095"+
		"\u00bc\5\f\7\2\u0096\u0098\5\b\5\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00b9\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u00ba\5\62\32\2\u009d\u00ba\5D#\2\u009e\u00ba\5&"+
		"\24\2\u009f\u00ba\5(\25\2\u00a0\u00ba\5\24\13\2\u00a1\u00ba\5H%\2\u00a2"+
		"\u00ba\5\20\t\2\u00a3\u00ba\5\64\33\2\u00a4\u00ba\5\66\34\2\u00a5\u00ba"+
		"\5\26\f\2\u00a6\u00ba\5> \2\u00a7\u00ba\5J&\2\u00a8\u00ba\5*\26\2\u00a9"+
		"\u00ba\5\30\r\2\u00aa\u00ba\5F$\2\u00ab\u00ba\5@!\2\u00ac\u00ba\5\32\16"+
		"\2\u00ad\u00ba\5,\27\2\u00ae\u00ba\5B\"\2\u00af\u00ba\5\34\17\2\u00b0"+
		"\u00ba\5\22\n\2\u00b1\u00ba\58\35\2\u00b2\u00ba\5.\30\2\u00b3\u00ba\5"+
		":\36\2\u00b4\u00ba\5<\37\2\u00b5\u00ba\5\60\31\2\u00b6\u00ba\5\36\20\2"+
		"\u00b7\u00ba\5\"\22\2\u00b8\u00ba\5 \21\2\u00b9\u009c\3\2\2\2\u00b9\u009d"+
		"\3\2\2\2\u00b9\u009e\3\2\2\2\u00b9\u009f\3\2\2\2\u00b9\u00a0\3\2\2\2\u00b9"+
		"\u00a1\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a3\3\2\2\2\u00b9\u00a4\3\2"+
		"\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00a6\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9"+
		"\u00a8\3\2\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00ab\3\2"+
		"\2\2\u00b9\u00ac\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9"+
		"\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2"+
		"\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u0095\3\2\2\2\u00bb\u0099\3\2\2\2\u00bc\7\3\2\2\2\u00bd\u00bf"+
		"\7\32\2\2\u00be\u00c0\7n\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\t\3\2\2\2\u00c1\u00c5\7<\2\2\u00c2\u00c4\5\16\b\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9\13\3\2\2\2\u00ca"+
		"\u00cb\7\31\2\2\u00cb\u00cc\7n\2\2\u00cc\r\3\2\2\2\u00cd\u00d0\5\6\4\2"+
		"\u00ce\u00d0\5\n\6\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\17"+
		"\3\2\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7A\2\2\u00d4"+
		"\21\3\2\2\2\u00d5\u00d6\7\4\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7A\2\2"+
		"\u00d8\23\3\2\2\2\u00d9\u00da\7\r\2\2\u00da\u00db\7A\2\2\u00db\25\3\2"+
		"\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\7A\2\2\u00de\27\3\2\2\2\u00df\u00e0"+
		"\7\21\2\2\u00e0\u00e1\7A\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\7\23\2\2\u00e3"+
		"\u00e4\5b\62\2\u00e4\u00e5\7_\2\2\u00e5\u00ec\7\25\2\2\u00e6\u00ed\5V"+
		",\2\u00e7\u00e8\7:\2\2\u00e8\u00e9\5T+\2\u00e9\u00ea\7;\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00ed\5L\'\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5\16\b\2\u00ef\33\3\2\2"+
		"\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\5L\'\2\u00f3\u00f4"+
		"\7?\2\2\u00f4\u00f7\5\16\b\2\u00f5\u00f6\7\20\2\2\u00f6\u00f8\5\16\b\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\35\3\2\2\2\u00f9\u00fc"+
		"\7\22\2\2\u00fa\u00fd\5L\'\2\u00fb\u00fd\5R*\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7A"+
		"\2\2\u00ff\37\3\2\2\2\u0100\u0101\7\24\2\2\u0101\u0102\7>\2\2\u0102\u0103"+
		"\5L\'\2\u0103\u0104\7?\2\2\u0104\u0105\5\16\b\2\u0105!\3\2\2\2\u0106\u0107"+
		"\7\26\2\2\u0107\u0108\7>\2\2\u0108\u0109\5L\'\2\u0109\u010a\7?\2\2\u010a"+
		"\u010e\7<\2\2\u010b\u010d\5$\23\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0112\7=\2\2\u0112#\3\2\2\2\u0113\u0114\7\27\2\2"+
		"\u0114\u0115\5~@\2\u0115\u0116\5\n\6\2\u0116\u011a\3\2\2\2\u0117\u0118"+
		"\7\30\2\2\u0118\u011a\5\n\6\2\u0119\u0113\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u011a%\3\2\2\2\u011b\u011d\78\2\2\u011c\u011e\5\u0082B\2\u011d\u011c"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7A\2\2\u0120"+
		"\'\3\2\2\2\u0121\u0123\7\13\2\2\u0122\u0124\5j\66\2\u0123\u0122\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5\n\6\2\u0126)"+
		"\3\2\2\2\u0127\u0128\7\65\2\2\u0128\u012a\5j\66\2\u0129\u012b\5\u0082"+
		"B\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7A\2\2\u012d+\3\2\2\2\u012e\u0130\5`\61\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u013a\7_\2\2\u0135\u0137\7>\2\2\u0136\u0138"+
		"\5~@\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\7?\2\2\u013a\u0135\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013e\5j\66\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\5\u0082B\2\u0140\u0141\7A\2\2\u0141\u0158\3"+
		"\2\2\2\u0142\u0144\5`\61\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0148\u014e\7.\2\2\u0149\u014b\7>\2\2\u014a\u014c\5~@\2\u014b\u014a"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\7?\2\2\u014e"+
		"\u0149\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0152\5j"+
		"\66\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0155\5\u0082B\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\7A\2\2\u0157\u0131\3\2\2\2\u0157\u0145\3\2\2\2\u0158"+
		"-\3\2\2\2\u0159\u015c\5R*\2\u015a\u015b\7E\2\2\u015b\u015d\5\\/\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7A"+
		"\2\2\u015f/\3\2\2\2\u0160\u0161\7\66\2\2\u0161\u0162\5r:\2\u0162\u0163"+
		"\7A\2\2\u0163\61\3\2\2\2\u0164\u0165\7\f\2\2\u0165\u0166\7_\2\2\u0166"+
		"\u0167\7D\2\2\u0167\u0168\5N(\2\u0168\u0169\7A\2\2\u0169\63\3\2\2\2\u016a"+
		"\u016d\5b\62\2\u016b\u016d\5f\64\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0171\7_\2\2\u016f\u0170\7D\2\2\u0170\u0172"+
		"\5P)\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\7A\2\2\u0174\65\3\2\2\2\u0175\u0176\7\35\2\2\u0176\u0177\5b\62"+
		"\2\u0177\u0178\7_\2\2\u0178\u0179\7D\2\2\u0179\u017a\5P)\2\u017a\u017b"+
		"\7A\2\2\u017b\67\3\2\2\2\u017c\u017f\t\2\2\2\u017d\u0180\5b\62\2\u017e"+
		"\u0180\5f\64\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\7_\2\2\u0182\u0183\7A\2\2\u01839\3\2\2\2\u0184\u0185"+
		"\t\3\2\2\u0185\u0187\7_\2\2\u0186\u0188\5j\66\2\u0187\u0186\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7A\2\2\u018a;\3\2\2\2\u018b"+
		"\u018c\5d\63\2\u018c\u018d\7_\2\2\u018d\u018e\7A\2\2\u018e=\3\2\2\2\u018f"+
		"\u0190\7\6\2\2\u0190\u0191\7_\2\2\u0191\u0193\7>\2\2\u0192\u0194\5x=\2"+
		"\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\7?\2\2\u0196\u0198\5^\60\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\5\n\6\2\u019a?\3\2\2\2\u019b\u019c\7\n\2\2"+
		"\u019c\u019d\7_\2\2\u019d\u019f\7>\2\2\u019e\u01a0\5\u0084C\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\7?\2\2\u01a2"+
		"\u01a4\5^\60\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\7A\2\2\u01a6A\3\2\2\2\u01a7\u01a8\7\t\2\2\u01a8\u01ae"+
		"\7_\2\2\u01a9\u01ab\7>\2\2\u01aa\u01ac\5\u0080A\2\u01ab\u01aa\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7?\2\2\u01ae\u01a9"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5\u0080A"+
		"\2\u01b1\u01b2\5\n\6\2\u01b2C\3\2\2\2\u01b3\u01b4\5\\/\2\u01b4\u01b7\t"+
		"\4\2\2\u01b5\u01b8\5L\'\2\u01b6\u01b8\5R*\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7A\2\2\u01baE\3\2\2\2\u01bb"+
		"\u01bc\5L\'\2\u01bc\u01bd\7A\2\2\u01bdG\3\2\2\2\u01be\u01bf\7\7\2\2\u01bf"+
		"\u01c1\7<\2\2\u01c0\u01c2\7s\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7=\2\2\u01c4I\3\2\2\2\u01c5\u01c6\7"+
		"\b\2\2\u01c6\u01cc\5l\67\2\u01c7\u01c9\7>\2\2\u01c8\u01ca\5z>\2\u01c9"+
		"\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\7?"+
		"\2\2\u01cc\u01c7\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\5|?\2\u01cf\u01d1\5^\60\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\7<\2\2\u01d3\u01d5\7s\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7=\2\2\u01d7"+
		"K\3\2\2\2\u01d8\u01d9\b\'\1\2\u01d9\u01da\7>\2\2\u01da\u01db\5L\'\2\u01db"+
		"\u01dc\7?\2\2\u01dc\u01f4\3\2\2\2\u01dd\u01de\t\5\2\2\u01de\u01f4\5L\'"+
		"\21\u01df\u01e2\5b\62\2\u01e0\u01e2\5f\64\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7>\2\2\u01e4\u01e5\5L\'"+
		"\2\u01e5\u01e6\7?\2\2\u01e6\u01f4\3\2\2\2\u01e7\u01e8\7\64\2\2\u01e8\u01e9"+
		"\7>\2\2\u01e9\u01ea\5\n\6\2\u01ea\u01eb\7?\2\2\u01eb\u01f4\3\2\2\2\u01ec"+
		"\u01ed\7_\2\2\u01ed\u01ef\7>\2\2\u01ee\u01f0\5~@\2\u01ef\u01ee\3\2\2\2"+
		"\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4\7?\2\2\u01f2\u01f4"+
		"\t\6\2\2\u01f3\u01d8\3\2\2\2\u01f3\u01dd\3\2\2\2\u01f3\u01e1\3\2\2\2\u01f3"+
		"\u01e7\3\2\2\2\u01f3\u01ec\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u021a\3\2"+
		"\2\2\u01f5\u01f6\f\22\2\2\u01f6\u01f7\7J\2\2\u01f7\u0219\5L\'\22\u01f8"+
		"\u01f9\f\20\2\2\u01f9\u01fa\t\7\2\2\u01fa\u0219\5L\'\21\u01fb\u01fc\f"+
		"\17\2\2\u01fc\u01fd\t\b\2\2\u01fd\u0219\5L\'\20\u01fe\u01ff\f\16\2\2\u01ff"+
		"\u0200\7X\2\2\u0200\u0219\5L\'\17\u0201\u0202\f\r\2\2\u0202\u0203\7W\2"+
		"\2\u0203\u0219\5L\'\16\u0204\u0205\f\f\2\2\u0205\u0206\7U\2\2\u0206\u0219"+
		"\5L\'\r\u0207\u0208\f\13\2\2\u0208\u0209\7O\2\2\u0209\u0219\5L\'\f\u020a"+
		"\u020b\f\n\2\2\u020b\u020c\7Q\2\2\u020c\u0219\5L\'\13\u020d\u020e\f\t"+
		"\2\2\u020e\u020f\7M\2\2\u020f\u0219\5L\'\n\u0210\u0211\f\b\2\2\u0211\u0212"+
		"\7P\2\2\u0212\u0219\5L\'\t\u0213\u0214\f\7\2\2\u0214\u0215\7N\2\2\u0215"+
		"\u0219\5L\'\b\u0216\u0217\f\23\2\2\u0217\u0219\5Z.\2\u0218\u01f5\3\2\2"+
		"\2\u0218\u01f8\3\2\2\2\u0218\u01fb\3\2\2\2\u0218\u01fe\3\2\2\2\u0218\u0201"+
		"\3\2\2\2\u0218\u0204\3\2\2\2\u0218\u0207\3\2\2\2\u0218\u020a\3\2\2\2\u0218"+
		"\u020d\3\2\2\2\u0218\u0210\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"M\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0222\5L\'\2\u021e\u021f\7G\2\2\u021f"+
		"\u0221\5L\'\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223O\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0229"+
		"\5X-\2\u0226\u0229\5L\'\2\u0227\u0229\5R*\2\u0228\u0225\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229Q\3\2\2\2\u022a\u022b\7\67\2\2"+
		"\u022b\u022c\5r:\2\u022cS\3\2\2\2\u022d\u022f\5L\'\2\u022e\u022d\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\7@\2\2\u0231\u0233"+
		"\5L\'\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0235\7@\2\2\u0235\u0237\5L\'\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2"+
		"\2\u0237U\3\2\2\2\u0238\u0239\7<\2\2\u0239\u023e\5L\'\2\u023a\u023b\7"+
		"C\2\2\u023b\u023d\5L\'\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0241\u0243\7C\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\7=\2\2\u0245W\3\2\2\2\u0246\u0249\7<\2\2\u0247"+
		"\u024a\5L\'\2\u0248\u024a\5X-\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2"+
		"\2\u024a\u0252\3\2\2\2\u024b\u024e\7C\2\2\u024c\u024f\5L\'\2\u024d\u024f"+
		"\5X-\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u024b\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\7C\2\2\u0256"+
		"\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7="+
		"\2\2\u0259Y\3\2\2\2\u025a\u026d\7:\2\2\u025b\u026e\5V,\2\u025c\u025f\5"+
		"L\'\2\u025d\u025f\5T+\2\u025e\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025f"+
		"\u0267\3\2\2\2\u0260\u0263\7C\2\2\u0261\u0264\5L\'\2\u0262\u0264\5T+\2"+
		"\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0260"+
		"\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026c\7C\2\2\u026b\u026a\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u025b\3\2\2\2\u026d"+
		"\u025e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7;\2\2\u0270[\3\2\2\2\u0271"+
		"\u0275\7_\2\2\u0272\u0274\5Z.\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2"+
		"\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276]\3\2\2\2\u0277\u0275"+
		"\3\2\2\2\u0278\u0279\7E\2\2\u0279\u027a\5b\62\2\u027a_\3\2\2\2\u027b\u0289"+
		"\7/\2\2\u027c\u027d\7\60\2\2\u027d\u027e\7>\2\2\u027e\u027f\5L\'\2\u027f"+
		"\u0280\7?\2\2\u0280\u0289\3\2\2\2\u0281\u0286\t\t\2\2\u0282\u0283\7>\2"+
		"\2\u0283\u0284\5L\'\2\u0284\u0285\7?\2\2\u0285\u0287\3\2\2\2\u0286\u0282"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u027b\3\2\2\2\u0288"+
		"\u027c\3\2\2\2\u0288\u0281\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\7R"+
		"\2\2\u028ba\3\2\2\2\u028c\u028e\7$\2\2\u028d\u028f\5j\66\2\u028e\u028d"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u02ab\3\2\2\2\u0290\u0292\7%\2\2\u0291"+
		"\u0293\5j\66\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02ab\3\2"+
		"\2\2\u0294\u0296\7&\2\2\u0295\u0297\5j\66\2\u0296\u0295\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u02ab\3\2\2\2\u0298\u029a\7\'\2\2\u0299\u029b\5j"+
		"\66\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02ab\3\2\2\2\u029c"+
		"\u029e\7(\2\2\u029d\u029f\5j\66\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02ab\3\2\2\2\u02a0\u02ab\7#\2\2\u02a1\u02ab\7,\2\2\u02a2\u02ab"+
		"\7-\2\2\u02a3\u02a8\7)\2\2\u02a4\u02a5\7:\2\2\u02a5\u02a6\5b\62\2\u02a6"+
		"\u02a7\7;\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02ab\3\2\2\2\u02aa\u028c\3\2\2\2\u02aa\u0290\3\2\2\2\u02aa"+
		"\u0294\3\2\2\2\u02aa\u0298\3\2\2\2\u02aa\u029c\3\2\2\2\u02aa\u02a0\3\2"+
		"\2\2\u02aa\u02a1\3\2\2\2\u02aa\u02a2\3\2\2\2\u02aa\u02a3\3\2\2\2\u02ab"+
		"c\3\2\2\2\u02ac\u02ae\7!\2\2\u02ad\u02af\5j\66\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02afe\3\2\2\2\u02b0\u02b1\7*\2\2\u02b1\u02b2\7:\2\2\u02b2"+
		"\u02b3\5b\62\2\u02b3\u02b4\7C\2\2\u02b4\u02b5\5~@\2\u02b5\u02b6\7;\2\2"+
		"\u02b6g\3\2\2\2\u02b7\u02b8\t\n\2\2\u02b8\u02b9\7*\2\2\u02b9\u02ba\7:"+
		"\2\2\u02ba\u02bb\5b\62\2\u02bb\u02c0\7C\2\2\u02bc\u02c1\5~@\2\u02bd\u02be"+
		"\7\63\2\2\u02be\u02bf\7D\2\2\u02bf\u02c1\5L\'\2\u02c0\u02bc\3\2\2\2\u02c0"+
		"\u02bd\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\7;\2\2\u02c3i\3\2\2\2\u02c4"+
		"\u02c5\7:\2\2\u02c5\u02c6\5L\'\2\u02c6\u02c7\7;\2\2\u02c7k\3\2\2\2\u02c8"+
		"\u02c9\t\13\2\2\u02c9m\3\2\2\2\u02ca\u02cd\5L\'\2\u02cb\u02cd\5v<\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cdo\3\2\2\2\u02ce\u02cf\t\f\2\2"+
		"\u02cfq\3\2\2\2\u02d0\u02d3\5\\/\2\u02d1\u02d3\7`\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d2\u02d1\3\2\2\2\u02d3s\3\2\2\2\u02d4\u02db\5b\62\2\u02d5\u02db"+
		"\5h\65\2\u02d6\u02d8\7\"\2\2\u02d7\u02d9\5j\66\2\u02d8\u02d7\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d4\3\2\2\2\u02da\u02d5\3\2"+
		"\2\2\u02da\u02d6\3\2\2\2\u02dbu\3\2\2\2\u02dc\u02dd\5b\62\2\u02dd\u02de"+
		"\7_\2\2\u02de\u02eb\3\2\2\2\u02df\u02e0\5d\63\2\u02e0\u02e1\7_\2\2\u02e1"+
		"\u02eb\3\2\2\2\u02e2\u02e3\t\3\2\2\u02e3\u02e5\7_\2\2\u02e4\u02e6\5j\66"+
		"\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02eb\3\2\2\2\u02e7\u02e8"+
		"\5h\65\2\u02e8\u02e9\7_\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02dc\3\2\2\2\u02ea"+
		"\u02df\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02e7\3\2\2\2\u02ebw\3\2\2\2"+
		"\u02ec\u02f1\5v<\2\u02ed\u02ee\7C\2\2\u02ee\u02f0\5v<\2\u02ef\u02ed\3"+
		"\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f6\7C\2\2\u02f5\u02f4\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6y\3\2\2\2\u02f7\u02fc\5n8\2\u02f8\u02f9"+
		"\7C\2\2\u02f9\u02fb\5n8\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2"+
		"\2\2\u02ff\u0301\7C\2\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"{\3\2\2\2\u0302\u0307\5p9\2\u0303\u0304\7C\2\2\u0304\u0306\5p9\2\u0305"+
		"\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030c\7C\2\2\u030b"+
		"\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c}\3\2\2\2\u030d\u0312\5L\'\2\u030e"+
		"\u030f\7C\2\2\u030f\u0311\5L\'\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2"+
		"\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0315\u0317\7C\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\177\3\2\2\2\u0318\u031d\7_\2\2\u0319\u031a\7C\2\2\u031a\u031c\7_\2\2"+
		"\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0322\7C\2\2\u0321"+
		"\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0081\3\2\2\2\u0323\u0328\5r"+
		":\2\u0324\u0325\7C\2\2\u0325\u0327\5r:\2\u0326\u0324\3\2\2\2\u0327\u032a"+
		"\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032c\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032b\u032d\7C\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u0083\3\2\2\2\u032e\u0333\5t;\2\u032f\u0330\7C\2\2\u0330\u0332"+
		"\5t;\2\u0331\u032f\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0338\7C"+
		"\2\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0085\3\2\2\2b\u0087"+
		"\u008c\u0099\u00b9\u00bb\u00bf\u00c5\u00cf\u00ec\u00f7\u00fc\u010e\u0119"+
		"\u011d\u0123\u012a\u0131\u0137\u013a\u013d\u0145\u014b\u014e\u0151\u0154"+
		"\u0157\u015c\u016c\u0171\u017f\u0187\u0193\u0197\u019f\u01a3\u01ab\u01ae"+
		"\u01b7\u01c1\u01c9\u01cc\u01d0\u01d4\u01e1\u01ef\u01f3\u0218\u021a\u0222"+
		"\u0228\u022e\u0232\u0236\u023e\u0242\u0249\u024e\u0252\u0256\u025e\u0263"+
		"\u0267\u026b\u026d\u0275\u0286\u0288\u028e\u0292\u0296\u029a\u029e\u02a8"+
		"\u02aa\u02ae\u02c0\u02cc\u02d2\u02d8\u02da\u02e5\u02ea\u02f1\u02f5\u02fc"+
		"\u0300\u0307\u030b\u0312\u0316\u031d\u0321\u0328\u032c\u0333\u0337";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}