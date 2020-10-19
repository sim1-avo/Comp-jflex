/* JFlex example: part of Java language lexer specification */
import java_cup.runtime.Symbol;


/**
* This class is a simple example lexer.
*/
%%
%class Lexer
%standalone
%unicode
%line
%column

%{
      StringBuffer string = new StringBuffer();

      private Symbol generateToken(int type) {
        return new Symbol(type);
      }
      private Symbol generateToken(int type, Object value) {
        return new Symbol(type, value);
      }

      /*
      private Symbol generateError() {
        return new Symbol(Token.ERROR, yyline, yycolumn);
      }

      private Symbol generateError(Object value) {
        return new Symbol(Token.ERROR, yyline, yycolumn, value);
      }*/


%}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

Identifier = [:jletter:] [:jletterdigit:]*
IntegerLiteral = 0 | [1-9][0-9]*
FloatNumber = (0|[1-9][0-9]*)\.[0-9]*[1-9]+

%state STRING
%%
<YYINITIAL> {

  /* keywords */
  "if" { System.out.println("("+Sym.IF+")"); }
  "then" { System.out.println("("+Sym.THEN+")"); }
  "else" { System.out.println("("+Sym.ELSE+")"); }
  "while" { System.out.println("("+Sym.WHILE+")"); }
  "int" { System.out.println("("+Sym.INT+")"); }
  "float" { System.out.println("("+Sym.FLOAT+")"); }

  /* separators */
  "(" { System.out.println("("+Sym.LPAR+")"); }
  ")" { System.out.println("("+Sym.RPAR+")"); }
  "{" { System.out.println("("+Sym.LBRA+")"); }
  "}" { System.out.println("("+Sym.RBRA+")"); }
  "," { System.out.println("("+Sym.COMMA+")"); }
  ";" { System.out.println("("+Sym.SEMI+")"); }

  /* relop */
  "<" { System.out.println("("+Sym.LT+")"); }
  "<=" { System.out.println("("+Sym.LE+")"); }
  "==" { System.out.println("("+Sym.EQ+")"); }
  "!=" { System.out.println("("+Sym.NE+")"); }
  ">" { System.out.println("("+Sym.GT+")"); }
  ">=" { System.out.println("("+Sym.GE+")"); }
  "<--" { System.out.println("("+Sym.ASSIGN+")"); }

  /* identifiers */
  {Identifier}          { System.out.println("("+Sym.ID+", \""+ yytext()+"\")"); }

  /* literals */
  {IntegerLiteral}   { System.out.println("("+Sym.NUM+", \""+ yytext()+"\")"); }
  {FloatNumber}   { System.out.println("("+Sym.NUM+", \""+ yytext()+"\")"); }

  /* whitespace */
  {WhiteSpace} { /* ignore */ }
}
/* error fallback */
[^] { System.out.println("("+Sym.ERROR+", \""+yytext()+"\") Position "+yyline+":"+yycolumn); }