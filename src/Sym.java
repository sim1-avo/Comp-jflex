public class Sym {
    /*Keywords*/
    public static final String IF="IF";

    public static final String THEN="THEN";
    public static final String ELSE="ELSE";
    public static final String WHILE="WHILE";
    public static final String INT="INT";
    public static final String FLOAT="FLOAT";
    public static final String NUM="NUM";

    /*Separators*/
    public static final String LPAR="LPAR";
    public static final String RPAR="RPAR";
    public static final String LBRA="LBRA";
    public static final String RBRA="RBRA";
    public static final String COMMA="COMMA";
    public static final String SEMI="SEMI";

    /*Operators*/
    public static final String LT="LT";
    public static final String LE="LE";
    public static final String EQ="EQ";
    public static final String NE="NE";
    public static final String GT="GT";
    public static final String GE="GE";
    public static final String ASSIGN="ASSIGN";

    /*Intifier*/
    public static final String ID="ID";

    /*error*/
    public static final String ERROR="ERROR";


    public static final String[] terminalNames= new String[]{
            "IF","THEN", "ELSE", "WHILE", "INT", "FLOAT", "NUM",
            "LPAR", "RPAR", "LBRA", "RBRA","COMMA", "SEMI",
            "LT", "LE", "EQ", "NE", "GT", "GE", "ASSIGN",
            "ID",
            "ERROR"
    };

}
