// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/Simone/IdeaProjects/mauro-avolicino_es2_jflex/srcjflexcup/lexerGenerator.flex

/* JFlex example: part of Java language lexer specification */
import java_cup.runtime.*;
import java.util.ArrayList;


/**
* This class is a simple example lexer.
*/

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\3\u1f00\1\u3900"+
    "\1\u3a00\1\u3b00\1\u3c00\1\u3d00\3\u1f00\1\u3e00\1\u3f00\4\u1f00"+
    "\1\u4000\11\u1f00\3\u0100\1\u4100\1\u4200\13\u1f00\4\u0100\1\u4300"+
    "\63\u1f00\2\u0100\1\u4400\4\u1f00\1\u4500\100\u1f00\1\u4600\40\u1f00"+
    "\1\u4700\1\u4800\1\u1f00\1\u4900\1\u4a00\1\u4b00\1\u4c00\26\u1f00"+
    "\1\u4d00\21\u1f00\246\u0100\1\u4e00\20\u0100\1\u4f00\1\u5000\77\u1f00"+
    "\2\u0100\1\u5000\u0b05\u1f00\1\u5100\1\u5200\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\16\0\4\3"+
    "\1\1\1\5\2\3\1\6\3\3\1\7\1\10\2\3"+
    "\1\11\1\12\1\13\1\3\1\14\11\15\1\3\1\16"+
    "\1\17\1\20\1\21\2\3\32\6\4\3\1\6\1\3"+
    "\1\22\3\6\1\23\1\24\1\6\1\25\1\26\2\6"+
    "\1\27\1\6\1\30\1\31\3\6\1\32\1\33\2\6"+
    "\1\34\3\6\1\35\1\3\1\36\1\3\41\0\2\3"+
    "\4\6\4\3\1\6\2\3\1\0\7\3\1\6\4\3"+
    "\1\6\5\3\27\6\1\3\37\6\1\3\u01ca\6\4\3"+
    "\14\6\16\3\5\6\7\3\1\6\1\3\1\6\21\3"+
    "\160\0\5\6\1\3\2\6\2\3\4\6\10\3\1\6"+
    "\1\3\3\6\1\3\1\6\1\3\24\6\1\3\123\6"+
    "\1\3\213\6\1\3\5\0\2\3\236\6\11\3\46\6"+
    "\2\3\1\6\7\3\47\6\7\3\1\6\1\3\55\0"+
    "\1\3\1\0\1\3\2\0\1\3\2\0\1\3\1\0"+
    "\10\3\33\6\5\3\3\6\15\3\5\0\6\3\1\6"+
    "\4\3\13\0\5\3\53\6\37\0\4\3\2\6\1\0"+
    "\143\6\1\3\1\6\10\0\1\3\6\0\2\6\2\0"+
    "\1\3\4\0\2\6\12\0\3\6\2\3\1\6\17\3"+
    "\1\0\1\6\1\0\36\6\33\0\2\3\131\6\13\0"+
    "\1\6\16\3\12\0\41\6\11\0\2\6\4\3\1\6"+
    "\5\3\26\6\4\0\1\6\11\0\1\6\3\0\1\6"+
    "\5\0\22\3\31\6\3\0\104\3\1\6\1\3\13\6"+
    "\67\3\33\0\1\3\4\0\66\6\3\0\1\6\22\0"+
    "\1\6\7\0\12\6\2\0\2\3\12\0\1\3\7\6"+
    "\1\3\7\6\1\3\3\0\1\3\10\6\2\3\2\6"+
    "\2\3\26\6\1\3\7\6\1\3\1\6\3\3\4\6"+
    "\2\3\1\0\1\6\7\0\2\3\2\0\2\3\3\0"+
    "\1\6\10\3\1\0\4\3\2\6\1\3\3\6\2\0"+
    "\2\3\12\0\4\6\7\3\1\6\5\3\3\0\1\3"+
    "\6\6\4\3\2\6\2\3\26\6\1\3\7\6\1\3"+
    "\2\6\1\3\2\6\1\3\2\6\2\3\1\0\1\3"+
    "\5\0\4\3\2\0\2\3\3\0\3\3\1\0\7\3"+
    "\4\6\1\3\1\6\7\3\14\0\3\6\1\0\13\3"+
    "\3\0\1\3\11\6\1\3\3\6\1\3\26\6\1\3"+
    "\7\6\1\3\2\6\1\3\5\6\2\3\1\0\1\6"+
    "\10\0\1\3\3\0\1\3\3\0\2\3\1\6\17\3"+
    "\2\6\2\0\2\3\12\0\1\3\1\6\17\3\3\0"+
    "\1\3\10\6\2\3\2\6\2\3\26\6\1\3\7\6"+
    "\1\3\2\6\1\3\5\6\2\3\1\0\1\6\7\0"+
    "\2\3\2\0\2\3\3\0\10\3\2\0\4\3\2\6"+
    "\1\3\3\6\2\0\2\3\12\0\1\3\1\6\20\3"+
    "\1\0\1\6\1\3\6\6\3\3\3\6\1\3\4\6"+
    "\3\3\2\6\1\3\1\6\1\3\2\6\3\3\2\6"+
    "\3\3\3\6\3\3\14\6\4\3\5\0\3\3\3\0"+
    "\1\3\4\0\2\3\1\6\6\3\1\0\16\3\12\0"+
    "\11\3\1\6\7\3\3\0\1\3\10\6\1\3\3\6"+
    "\1\3\27\6\1\3\12\6\1\3\5\6\3\3\1\6"+
    "\7\0\1\3\3\0\1\3\4\0\7\3\2\0\1\3"+
    "\2\6\6\3\2\6\2\0\2\3\12\0\22\3\2\0"+
    "\1\3\10\6\1\3\3\6\1\3\27\6\1\3\12\6"+
    "\1\3\5\6\2\3\1\0\1\6\7\0\1\3\3\0"+
    "\1\3\4\0\7\3\2\0\7\3\1\6\1\3\2\6"+
    "\2\0\2\3\12\0\1\3\2\6\17\3\2\0\1\3"+
    "\10\6\1\3\3\6\1\3\51\6\2\3\1\6\7\0"+
    "\1\3\3\0\1\3\4\0\1\6\10\3\1\0\10\3"+
    "\2\6\2\0\2\3\12\0\12\3\6\6\2\3\2\0"+
    "\1\3\22\6\3\3\30\6\1\3\11\6\1\3\1\6"+
    "\2\3\7\6\3\3\1\0\4\3\6\0\1\3\1\0"+
    "\1\3\10\0\22\3\2\0\15\3\60\6\1\0\2\6"+
    "\7\0\4\3\10\6\10\0\1\3\12\0\47\3\2\6"+
    "\1\3\1\6\2\3\2\6\1\3\1\6\2\3\1\6"+
    "\6\3\4\6\1\3\7\6\1\3\3\6\1\3\1\6"+
    "\1\3\1\6\2\3\2\6\1\3\4\6\1\0\2\6"+
    "\6\0\1\3\2\0\1\6\2\3\5\6\1\3\1\6"+
    "\1\3\6\0\2\3\12\0\2\3\4\6\40\3\1\6"+
    "\27\3\2\0\6\3\12\0\13\3\1\0\1\3\1\0"+
    "\1\3\1\0\4\3\2\0\10\6\1\3\44\6\4\3"+
    "\24\0\1\3\2\0\5\6\13\0\1\3\44\0\11\3"+
    "\1\0\71\3\53\6\24\0\1\6\12\0\6\3\6\6"+
    "\4\0\4\6\3\0\1\6\3\0\2\6\7\0\3\6"+
    "\4\0\15\6\14\0\1\6\17\0\2\3\46\6\1\3"+
    "\1\6\5\3\1\6\2\3\53\6\1\3\115\6\1\3"+
    "\4\6\2\3\7\6\1\3\1\6\1\3\4\6\2\3"+
    "\51\6\1\3\4\6\2\3\41\6\1\3\4\6\2\3"+
    "\7\6\1\3\1\6\1\3\4\6\2\3\17\6\1\3"+
    "\71\6\1\3\4\6\2\3\103\6\2\3\3\0\40\3"+
    "\20\6\20\3\125\6\14\3\u016c\6\2\3\21\6\1\3"+
    "\32\6\5\3\113\6\3\3\3\6\17\3\15\6\1\3"+
    "\4\6\3\0\13\3\22\6\3\0\13\3\22\6\2\0"+
    "\14\3\15\6\1\3\3\6\1\3\2\0\14\3\64\6"+
    "\40\0\3\3\1\6\3\3\2\6\1\0\2\3\12\0"+
    "\41\3\3\0\2\3\12\0\6\3\130\6\10\3\51\6"+
    "\1\0\1\6\5\3\106\6\12\3\35\6\3\3\14\0"+
    "\4\3\14\0\12\3\12\0\36\6\2\3\5\6\13\3"+
    "\54\6\4\3\21\0\7\6\2\0\6\3\12\0\46\3"+
    "\27\6\5\0\4\3\65\6\12\0\1\3\35\0\2\3"+
    "\13\0\6\3\12\0\15\3\1\6\130\3\5\0\57\6"+
    "\21\0\7\6\4\3\12\0\21\3\11\0\14\3\3\0"+
    "\36\6\15\0\2\6\12\0\54\6\16\0\14\3\44\6"+
    "\24\0\10\3\12\0\3\3\3\6\12\0\44\6\122\3"+
    "\3\0\1\3\25\0\4\6\1\0\4\6\3\0\2\6"+
    "\11\3\300\6\47\0\25\3\4\0\26\6\2\3\6\6"+
    "\2\3\46\6\2\3\6\6\2\3\10\6\1\3\1\6"+
    "\1\3\1\6\1\3\1\6\1\3\37\6\2\3\65\6"+
    "\1\3\7\6\1\3\1\6\3\3\3\6\1\3\7\6"+
    "\3\3\4\6\2\3\6\6\4\3\15\6\5\3\3\6"+
    "\1\3\7\6\16\3\5\0\32\3\5\0\20\3\2\6"+
    "\23\3\1\6\13\3\5\0\5\3\6\0\1\3\1\6"+
    "\15\3\1\6\20\3\15\6\3\3\33\6\25\3\15\0"+
    "\4\3\1\0\3\3\14\0\21\3\1\6\4\3\1\6"+
    "\2\3\12\6\1\3\1\6\3\3\5\6\6\3\1\6"+
    "\1\3\1\6\1\3\1\6\1\3\4\6\1\3\13\6"+
    "\2\3\4\6\5\3\5\6\4\3\1\6\21\3\51\6"+
    "\u0177\3\57\6\1\3\57\6\1\3\205\6\6\3\4\6"+
    "\3\0\2\6\14\3\46\6\1\3\1\6\5\3\1\6"+
    "\2\3\70\6\7\3\1\6\17\3\1\0\27\6\11\3"+
    "\7\6\1\3\7\6\1\3\7\6\1\3\7\6\1\3"+
    "\7\6\1\3\7\6\1\3\7\6\1\3\7\6\1\3"+
    "\40\0\57\3\1\6\325\3\3\6\31\3\11\6\6\0"+
    "\1\3\5\6\2\3\5\6\4\3\126\6\2\3\2\0"+
    "\2\3\3\6\1\3\132\6\1\3\4\6\5\3\51\6"+
    "\3\3\136\6\21\3\33\6\65\3\306\6\112\3\315\6"+
    "\63\3\215\6\103\3\56\6\2\3\15\6\3\3\20\6"+
    "\12\0\2\6\24\3\57\6\1\0\4\3\12\0\1\3"+
    "\31\6\7\3\1\0\120\6\2\0\45\3\11\6\2\3"+
    "\147\6\2\3\4\6\1\3\4\6\14\3\13\6\115\3"+
    "\12\6\1\0\3\6\1\0\4\6\1\0\27\6\5\0"+
    "\20\3\1\6\7\3\64\6\14\3\2\0\62\6\21\0"+
    "\13\3\12\0\6\3\22\0\6\6\3\3\1\6\4\3"+
    "\12\0\34\6\10\0\2\3\27\6\15\0\14\3\35\6"+
    "\3\3\4\0\57\6\16\0\16\3\1\6\12\0\46\3"+
    "\51\6\16\0\11\3\3\6\1\0\10\6\2\0\2\3"+
    "\12\0\6\3\27\6\3\3\1\6\1\0\4\3\60\6"+
    "\1\0\1\6\3\0\2\6\2\0\5\6\2\0\1\6"+
    "\1\0\1\6\30\3\3\6\2\3\13\6\5\0\2\3"+
    "\3\6\2\0\12\3\6\6\2\3\6\6\2\3\6\6"+
    "\11\3\7\6\1\3\7\6\221\3\43\6\10\0\1\3"+
    "\2\0\2\3\12\0\6\3\244\6\14\3\27\6\4\3"+
    "\61\6\4\3\156\6\2\3\152\6\46\3\7\6\14\3"+
    "\5\6\5\3\1\6\1\0\12\6\1\3\15\6\1\3"+
    "\5\6\1\3\1\6\1\3\2\6\1\3\2\6\1\3"+
    "\154\6\41\3\153\6\22\3\100\6\2\3\66\6\50\3"+
    "\15\6\3\3\20\0\20\3\7\0\14\3\2\6\30\3"+
    "\3\6\31\3\1\6\6\3\5\6\1\3\207\6\2\3"+
    "\1\0\4\3\1\6\13\3\12\0\7\3\32\6\4\3"+
    "\1\6\1\3\32\6\13\3\131\6\3\3\6\6\2\3"+
    "\6\6\2\3\6\6\2\3\3\6\3\3\2\6\3\3"+
    "\2\6\22\3\3\0\4\3\14\6\1\3\32\6\1\3"+
    "\23\6\1\3\2\6\1\3\17\6\2\3\16\6\42\3"+
    "\173\6\105\3\65\6\210\3\1\0\202\3\35\6\3\3"+
    "\61\6\57\3\37\6\21\3\33\6\65\3\36\6\2\3"+
    "\44\6\4\3\10\6\1\3\5\6\52\3\236\6\2\3"+
    "\12\0\126\3\6\6\2\3\1\6\1\3\54\6\1\3"+
    "\2\6\3\3\1\6\2\3\27\6\252\3\26\6\12\3"+
    "\32\6\106\3\70\6\6\3\2\6\100\3\1\6\3\0"+
    "\1\3\2\0\5\3\4\0\4\6\1\3\3\6\1\3"+
    "\33\6\4\3\3\0\4\3\1\0\40\3\35\6\203\3"+
    "\66\6\12\3\26\6\12\3\23\6\215\3\111\6\267\3"+
    "\3\0\65\6\17\0\37\3\12\0\20\3\3\0\55\6"+
    "\13\0\2\3\1\0\22\3\31\6\7\3\12\0\6\3"+
    "\3\0\44\6\16\0\1\3\12\0\100\3\3\0\60\6"+
    "\16\0\4\6\13\3\12\0\246\3\53\6\15\0\10\3"+
    "\12\0\66\3\157\6\221\3\143\6\235\3\57\6\321\3"+
    "\71\6\307\3\105\6\13\3\1\6\56\0\20\3\4\0"+
    "\15\6\140\3\2\6\u0163\3\5\0\3\3\26\0\2\3"+
    "\7\0\36\3\4\0\224\3\3\0\273\3\125\6\1\3"+
    "\107\6\1\3\2\6\2\3\1\6\2\3\2\6\2\3"+
    "\4\6\1\3\14\6\1\3\1\6\1\3\7\6\1\3"+
    "\101\6\1\3\4\6\2\3\10\6\1\3\7\6\1\3"+
    "\34\6\1\3\4\6\1\3\5\6\1\3\1\6\3\3"+
    "\7\6\1\3\u0154\6\2\3\31\6\1\3\31\6\1\3"+
    "\37\6\1\3\31\6\1\3\37\6\1\3\31\6\1\3"+
    "\37\6\1\3\31\6\1\3\37\6\1\3\31\6\1\3"+
    "\10\6\2\3\62\0\4\6\1\3\33\6\1\3\2\6"+
    "\1\3\1\6\2\3\1\6\1\3\12\6\1\3\4\6"+
    "\1\3\1\6\1\3\1\6\6\3\1\6\4\3\1\6"+
    "\1\3\1\6\1\3\1\6\1\3\3\6\1\3\2\6"+
    "\1\3\1\6\2\3\1\6\1\3\1\6\1\3\1\6"+
    "\1\3\1\6\1\3\1\6\1\3\2\6\1\3\1\6"+
    "\2\3\4\6\1\3\7\6\1\3\4\6\1\3\4\6"+
    "\1\3\1\6\1\3\12\6\1\3\21\6\5\3\3\6"+
    "\1\3\5\6\1\3\21\6\104\3\327\6\51\3\65\6"+
    "\13\3\336\6\343\3\1\0\36\3\140\0\200\3\360\0"+
    "\20\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[21248];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\2\7\1\10\1\11\1\1\1\12\5\3\1\13\1\14"+
    "\1\15\2\0\1\16\1\17\1\20\2\3\1\21\3\3"+
    "\1\22\1\23\2\3\1\24\2\3\1\25\1\3\1\26"+
    "\1\3\1\27\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[48];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\76\0\135\0\174\0\233\0\76"+
    "\0\76\0\76\0\272\0\331\0\76\0\370\0\u0117\0\u0136"+
    "\0\u0155\0\u0174\0\u0193\0\u01b2\0\u01d1\0\76\0\76\0\76"+
    "\0\u01f0\0\u020f\0\76\0\76\0\76\0\u022e\0\u024d\0\233"+
    "\0\u026c\0\u028b\0\u02aa\0\u01f0\0\76\0\u02c9\0\u02e8\0\233"+
    "\0\u0307\0\u0326\0\233\0\u0345\0\233\0\u0364\0\233\0\233";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[48];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\3\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\2\3\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\7\1\21\1\22\1\7\1\23\4\7\1\24\1\25"+
    "\1\26\1\27\37\3\41\0\1\4\54\0\1\30\16\0"+
    "\1\7\5\0\1\7\5\0\2\7\4\0\13\7\15\0"+
    "\1\31\36\0\1\31\2\14\33\0\1\32\5\0\1\33"+
    "\36\0\1\34\36\0\1\35\16\0\1\7\5\0\1\7"+
    "\5\0\2\7\4\0\5\7\1\36\5\7\2\0\1\7"+
    "\5\0\1\7\5\0\2\7\4\0\5\7\1\37\5\7"+
    "\2\0\1\7\5\0\1\7\5\0\2\7\4\0\2\7"+
    "\1\40\3\7\1\41\4\7\2\0\1\7\5\0\1\7"+
    "\5\0\2\7\4\0\3\7\1\42\7\7\2\0\1\7"+
    "\5\0\1\7\5\0\2\7\4\0\3\7\1\43\7\7"+
    "\16\0\1\31\1\44\33\0\1\45\24\0\1\7\5\0"+
    "\1\7\5\0\2\7\4\0\10\7\1\46\2\7\2\0"+
    "\1\7\5\0\1\7\5\0\2\7\4\0\7\7\1\47"+
    "\3\7\2\0\1\7\5\0\1\7\5\0\2\7\4\0"+
    "\11\7\1\50\1\7\2\0\1\7\5\0\1\7\5\0"+
    "\2\7\4\0\1\7\1\51\11\7\2\0\1\7\5\0"+
    "\1\7\5\0\2\7\4\0\4\7\1\52\6\7\2\0"+
    "\1\7\5\0\1\7\5\0\2\7\4\0\1\7\1\53"+
    "\11\7\2\0\1\7\5\0\1\7\5\0\2\7\4\0"+
    "\1\54\12\7\2\0\1\7\5\0\1\7\5\0\2\7"+
    "\4\0\6\7\1\55\4\7\2\0\1\7\5\0\1\7"+
    "\5\0\2\7\4\0\5\7\1\56\5\7\2\0\1\7"+
    "\5\0\1\7\5\0\2\7\4\0\11\7\1\57\1\7"+
    "\2\0\1\7\5\0\1\7\5\0\2\7\4\0\1\7"+
    "\1\60\11\7\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[899];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\3\1\3\11\2\1\1\11\10\1\3\11"+
    "\2\0\3\11\7\1\1\11\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[48];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
      StringBuffer string = new StringBuffer();
      public ArrayList<String> SymbolTable= new ArrayList<String>();

      private Symbol generateToken(int type) {
        return new Symbol(type);
      }
      private Symbol generateToken(int type, Object value) {
              if(type==20 && !SymbolTable.contains(value.toString())){
                SymbolTable.add(value.toString());
              }
              if(type==6){
                  SymbolTable.add(value.toString());
              }
              return new Symbol(type, SymbolTable.lastIndexOf(value.toString()));
            }

      private Symbol generateError(Object value) {
        return new Symbol(Sym.ERROR, yyline, yycolumn, value);
      }




  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(Sym.EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return generateError(yytext());
            }
            // fall through
          case 25: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 26: break;
          case 3:
            { return generateToken(Sym.ID, yytext());
            }
            // fall through
          case 27: break;
          case 4:
            { return generateToken(Sym.LPAR);
            }
            // fall through
          case 28: break;
          case 5:
            { return generateToken(Sym.RPAR);
            }
            // fall through
          case 29: break;
          case 6:
            { return generateToken(Sym.COMMA);
            }
            // fall through
          case 30: break;
          case 7:
            { return generateToken(Sym.NUM, Integer.parseInt(yytext()));
            }
            // fall through
          case 31: break;
          case 8:
            { return generateToken(Sym.SEMI);
            }
            // fall through
          case 32: break;
          case 9:
            { return generateToken(Sym.LessThan);
            }
            // fall through
          case 33: break;
          case 10:
            { return generateToken(Sym.GraterThan);
            }
            // fall through
          case 34: break;
          case 11:
            { return generateToken(Sym.LBRA);
            }
            // fall through
          case 35: break;
          case 12:
            { return generateToken(Sym.RBRA);
            }
            // fall through
          case 36: break;
          case 13:
            { return generateToken(Sym.NotEqual);
            }
            // fall through
          case 37: break;
          case 14:
            { return generateToken(Sym.LessEqual);
            }
            // fall through
          case 38: break;
          case 15:
            { return generateToken(Sym.EQ);
            }
            // fall through
          case 39: break;
          case 16:
            { return generateToken(Sym.GraterEqual);
            }
            // fall through
          case 40: break;
          case 17:
            { return generateToken(Sym.IF);
            }
            // fall through
          case 41: break;
          case 18:
            { return generateToken(Sym.NUM, Double.parseDouble(yytext()));
            }
            // fall through
          case 42: break;
          case 19:
            { return generateToken(Sym.ASSIGN);
            }
            // fall through
          case 43: break;
          case 20:
            { return generateToken(Sym.INT);
            }
            // fall through
          case 44: break;
          case 21:
            { return generateToken(Sym.ELSE);
            }
            // fall through
          case 45: break;
          case 22:
            { return generateToken(Sym.THEN);
            }
            // fall through
          case 46: break;
          case 23:
            { return generateToken(Sym.FLOAT);
            }
            // fall through
          case 47: break;
          case 24:
            { return generateToken(Sym.WHILE);
            }
            // fall through
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
