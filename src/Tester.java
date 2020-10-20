import java.io.*;
import java_cup.runtime.*;

public class Tester {
    public static void main(String[] args) throws IOException {

        File file=new File(args[0]);
        InputStream in = new FileInputStream(file);
        Reader reader = new InputStreamReader(in);

        Lexer lex=new Lexer(reader);
        Symbol s;
        while ( (s = lex.next_token()).sym != 22) {
            if (s.sym == 21) {
                System.out.println("("+Sym.terminalNames[s.sym]+", \""+s.value.toString()+"\") Position -> "+(s.left + 1)+":"+s.right);
            } else {
                if (s.value != null) System.out.println("("+Sym.terminalNames[s.sym]+", \""+s.value.toString()+"\")");
                else System.out.println("("+Sym.terminalNames[s.sym]+")");
            }
        }
    }
}
