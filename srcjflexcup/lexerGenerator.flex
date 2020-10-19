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
/*
%{
      StringBuffer string = new StringBuffer();

      private Symbol generateToken(int type) {
        return new Symbol(type);
      }
      private Symbol generateToken(int type, Object value) {
        return new Symbol(type, value);
      }

      private Symbol generateError() {
        return new Symbol(Token.ERROR, yyline, yycolumn);
      }

      private Symbol generateError(Object value) {
        return new Symbol(Token.ERROR, yyline, yycolumn, value);
      }


%}*/
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

Identifier = [:jletter:] [:jletterdigit:]*
IntegerLiteral = 0|[1-9][0-9]*
FloatNumber = (0|[1-9][0-9]*)\.[0-9]*[1-9]+

%state STRING
%%
<YYINITIAL> {

  /* keywords */
  "if" { System.out.println("("+Token.IF+")"); }
  "then" { System.out.println("("+Token.THEN+")"); }
  "else" { System.out.println("("+Token.ELSE+")"); }
  "while" { System.out.println("("+Token.WHILE+")"); }
  "int" { System.out.println("("+Token.INT+")"); }
  "float" { System.out.println("("+Token.FLOAT+")"); }

  /* separators */
  "(" { System.out.println("("+Token.LPAR+")"); }
  ")" { System.out.println("("+Token.RPAR+")"); }
  "{" { System.out.println("("+Token.LBRA+")"); }
  "}" { System.out.println("("+Token.RBRA+")"); }
  "," { System.out.println("("+Token.COMMA+")"); }
  ";" { System.out.println("("+Token.SEMI+")"); }

  /* relop */
  "<" { System.out.println("("+Token.LT+")"); }
  "<=" { System.out.println("("+Token.LE+")"); }
  "==" { System.out.println("("+Token.EQ+")"); }
  "!=" { System.out.println("("+Token.NE+")"); }
  ">" { System.out.println("("+Token.GT+")"); }
  ">=" { System.out.println("("+Token.GE+")"); }
  "<--" { System.out.println("("+Token.ASSIGN+")"); }

  /* identifiers */
  {Identifier}          { System.out.println("("+Token.ID+", \""+ yytext()+"\")"); }

  /* literals */
  {IntegerLiteral}   { System.out.println("("+Token.NUM+", \""+ yytext()+"\")"); }
  {FloatNumber}   { System.out.println("("+Token.NUM+", \""+ yytext()+"\")"); }


  /* whitespace */
  {WhiteSpace} { /* ignore */ }
}
/* error fallback */
[^] { System.out.println("("+Token.ERROR+", \""+yytext()+"\") Position "+yyline+":"+yycolumn); }