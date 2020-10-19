/* JFlex example: part of Java language lexer specification */
import java_cup.runtime.*;
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
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol generateToken(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }

      private Symbol generateError() {
        return new Symbol(Token.ERROR, yyline, yycolumn);
      }
      private Symbol generateError(Object value) {
        return new Symbol(Token.ERROR, yyline, yycolumn, value);
      }


%}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

Identifier = [:jletter:] [:jletterdigit:]*
IntegerLiteral = 0 | [1-9][0-9]*
FloatNumber = 0 | [1-9][0-9]* \.[0-9]*[1-9]+

%state STRING
%%
<YYINITIAL> {

  /* keywords */
  "if" { return generateToken(Token.IF); }
  "then" { return generateToken(Token.THEN); }
  "else" { return generateToken(Token.ELSE); }
  "while" { return generateToken(Token.WHILE); }
  "int" { return generateToken(Token.INT); }
  "float" { return generateToken(Token.FLOAT); }

  /* separators */
  "(" { return generateToken(Token.LPAR); }
  ")" { return generateToken(Token.RPAR); }
  "{" { return generateToken(Token.LBRA); }
  "}" { return generateToken(Token.RBRA); }
  "," { return generateToken(Token.COMMA); }
  ";" { return generateToken(Token.SEMI); }

  /* relop */
  "<" { return generateToken(Token.LT); }
  "<=" { return generateToken(Token.LE); }
  "==" { return generateToken(Token.EQ); }
  "!=" { return generateToken(Token.NE); }
  ">" { return generateToken(Token.GT); }
  ">=" { return generateToken(Token.GE); }
  "<--" { return generateToken(Token.ASSIGN); }

  /* identifiers */
  {Identifier}          { return generateToken(Token.ID, yytext()); }

  /* literals */
  {IntegerLiteral}   { return generateToken(Token.NUM, Integer.parseInt(yytext())); }
  {FloatNumber}   { return generateToken(Token.NUM, Double.parseDouble(yytext())); }


  /* whitespace */
  {WhiteSpace} { /* ignore */ }
}
/* error fallback */
[^] { throw new Error("Illegal character <"+
yytext()+">"); }
/*end of file*/
<<EOF>> {return new Symbol(Token.EOF);}