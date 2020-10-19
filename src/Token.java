public class Token{
    /*Keywords*/
    public static final String IF="IF";
    public static final String THEN="THEN";
    public static final String ELSE="ELSE";
    public static final String WHILE="WHILE";
    public static final String INT="INT";
    public static final String FLOAT="FLOAT";
    public static final String NUM="NUM";

    /*Separators*/
    public static final String LPAR="(";
    public static final String RPAR=")";
    public static final String LBRA="{";
    public static final String RBRA="}";
    public static final String COMMA=",";
    public static final String SEMI=";";

    /*Operators*/
    public static final String LT="<";
    public static final String LE="<=";
    public static final String EQ="==";
    public static final String NE="!=";
    public static final String GT=">";
    public static final String GE=">=";
    public static final String ASSIGN="<--";

    /*Intifier*/
    public static final String ID="ID";

    /*error*/
    public static final String ERROR="Error";


    public static final String[] terminalNames= new String[]{
            "IF","THEN", "ELSE", "WHILE", "INT", "FLOAT", "NUM",
            "LPAR", "RPAR", "LBRA", "RBRA","COMMA", "SEMI",
            "LT", "LE", "EQ", "NE", "GT", "GE", "ASSIGN",
            "ID",
            "ERROR"
    };

}
