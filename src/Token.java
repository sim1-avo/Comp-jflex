public class Token{
    /*Keywords*/
    public static final String IF="IF";
    public static final String THEN="THEN";
    public static final String ELSE="ELSE";
    public static final String WHILE="WHILE";
    public static final String INT="INT";
    public static final String FLOAT="FLOAT";
    public static final int NUM=6;

    /*Separators*/
    public static final int LPAR=7;
    public static final int RPAR=8;
    public static final int LBRA=9;
    public static final int RBRA=10;
    public static final int COMMA=11;
    public static final int SEMI=12;

    /*Operators*/
    public static final int LT=13;
    public static final int LE=14;
    public static final int EQ=15;
    public static final int NE=16;
    public static final int GT=17;
    public static final int GE=18;
    public static final int ASSIGN=19;

    /*Intifier*/
    public static final int ID=20;

    /*error*/
    public static final int ERROR=21;
    /*eof*/
    public static final int EOF=22;

    public static final String[] terminalNames= new String[]{
            "IF","THEN", "ELSE", "WHILE", "INT", "FLOAT", "NUM",
            "LPAR", "RPAR", "LBRA", "RBRA","COMMA", "SEMI",
            "LT", "LE", "EQ", "NE", "GT", "GE", "ASSIGN",
            "ID",
            "ERROR",
            "EOF"
    };

}
