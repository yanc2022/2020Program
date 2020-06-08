package com.company;

public class mirror3 {
    public static final int SIZE=5; //declaring global constant
    public static void main(String[] args){
        Line();
        Top();
        Bottom();
        Line();
    }
    public static void Line(){
        System.out.print("#");
        for(int dash=0; dash<4*SIZE; dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top() {
        for (int line = 1; line <SIZE+1; line++) {
            System.out.print("|");

            for (int space = 1; space <= -2 * line + 2*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");

            for (int dot = 1; dot <= 4 * line - SIZE+1; dot++){
                System.out.print(".");
            }
            System.out.print("<>");

            for (int space = 1; space <= -2 * line + 2*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
            }
        }
        

    public static void Bottom() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");

            for (int space = 1; space <= 2 * line -SIZE/2; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");

            for (int dot = 1; dot <= -4 * line+4*SIZE; dot++){
                System.out.print(".");
            }
            System.out.print("<>");

            for (int space = 1; space <= 2 * line -SIZE/2; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}









