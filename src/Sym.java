public interface Sym{
    /*Keywords*/
    public static final int IF=0;
    public static final int THEN=1;
    public static final int ELSE=2;
    public static final  int WHILE=3;
    public static final int INT=4;
    public static final int FLOAT=5;
    public static final int NUM=6;

    /*Separators*/
    public static final int LPAR=7;
    public static final int RPAR=8;
    public static final int LBRA=9;
    public static final int RBRA=10;
    public static final int COMMA=11;
    public static final int SEMI=12;

    /*Operators*/
    public static final int LessThan=13;
    public static final int LessEqual=14;
    public static final int EQ=15;
    public static final int NotEqual=16;
    public static final int GraterThan=17;
    public static final int GraterEqual=18;
    public static final int ASSIGN=19;

    /*Intifier*/
    public static final int ID=20;

    /*error*/
    public static final int ERROR=21;
    public static final int EOF=22;

    public static final String[] terminalNames= new String[]{
            "IF","THEN", "ELSE", "WHILE", "INT", "FLOAT", "NUM",
            "LPAR", "RPAR", "LBRA", "RBRA","COMMA", "SEMI",
            "LessThan", "LessEqual", "EQ", "NotEqual", "GraterThan", "GraterEqual", "ASSIGN",
            "ID",
            "ERROR", "EOF"
    };

}
