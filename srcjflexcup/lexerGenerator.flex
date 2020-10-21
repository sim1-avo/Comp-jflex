/* JFlex example: part of Java language lexer specification */
import java_cup.runtime.*;
import java.util.ArrayList;


/**
* This class is a simple example lexer.
*/
%%
%class Lexer
%cup
%unicode
%line
%column

%{
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
              return new Symbol(type, SymbolTable.indexOf(value.toString()));
            }

      private Symbol generateError(Object value) {
        return new Symbol(Sym.ERROR, yyline, yycolumn, value);
      }


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
  "if" { return generateToken(Sym.IF); }
  "then" { return generateToken(Sym.THEN); }
  "else" { return generateToken(Sym.ELSE); }
  "while" { return generateToken(Sym.WHILE); }
  "int" { return generateToken(Sym.INT); }
  "float" { return generateToken(Sym.FLOAT); }

  /* separators */
  "(" { return generateToken(Sym.LPAR); }
  ")" { return generateToken(Sym.RPAR); }
  "{" { return generateToken(Sym.LBRA); }
  "}" { return generateToken(Sym.RBRA); }
  "," { return generateToken(Sym.COMMA); }
  ";" { return generateToken(Sym.SEMI); }

  /* relop */
  "<" { return generateToken(Sym.LessThan); }
  "<=" { return generateToken(Sym.LessEqual); }
  "==" { return generateToken(Sym.EQ); }
  "!=" { return generateToken(Sym.NotEqual); }
  ">" { return generateToken(Sym.GraterThan); }
  ">=" { return generateToken(Sym.GraterEqual); }
  "<--" { return generateToken(Sym.ASSIGN); }

  /* identifiers */
  {Identifier}          { return generateToken(Sym.ID, yytext());}

  /* literals */
  {IntegerLiteral}   { return generateToken(Sym.NUM, Integer.parseInt(yytext())); }
  {FloatNumber}   { return generateToken(Sym.NUM, Double.parseDouble(yytext())); }


  /* whitespace */
  {WhiteSpace} { /* ignore */ }
}
/* error fallback */
[^] { return generateError(yytext()); }

<<EOF>> {return new Symbol(Sym.EOF);}