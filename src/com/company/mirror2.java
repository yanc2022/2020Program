package com.company;

public class mirror2 {
    public static void main(String[] args){
        Line();
        Top();
        Bottom();
        Line();
    }
    public static void Line(){
        System.out.print("#");
        for(int dash=0; dash<16; dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top(){
        //line 1
        System.out.print("|");
        for(int space=0; space<6; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<0; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<6; space++){
            System.out.print(" ");
        }
        System.out.println("|");

//line 2
        System.out.print("|");
        for(int space=0; space<4; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<4; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<4; space++){
            System.out.print(" ");
        }
        System.out.println("|");

//line 3
        System.out.print("|");
        for(int space=0; space<2; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<8; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<2; space++){
            System.out.print(" ");
        }
        System.out.println("|");

//line 4
        System.out.print("|");
        for(int space=0; space<0; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<12; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<0; space++){
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void Bottom(){
        //line 1
        System.out.print("|");
        for(int space=0; space<0; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<12; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<0; space++){
            System.out.print(" ");
        }
        System.out.println("|");

//line 2
        System.out.print("|");
        for(int space=0; space<2; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<8; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<2; space++){
            System.out.print(" ");
        }
        System.out.println("|");

//line 3
        System.out.print("|");
        for(int space=0; space<4; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<4; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<4; space++){
            System.out.print(" ");
        }
        System.out.println("|");

//line 4
        System.out.print("|");
        for(int space=0; space<6; space++){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=0; dot<0; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space=0; space<6; space++){
            System.out.print(" ");
        }
        System.out.println("|");
    }
}


