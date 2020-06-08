package com.company;
/*This is the program for challenge 2
  6/7/2020
  Christine Yan
 */
public class challenge2 {
    public static final int SIZE=4;
    public static void main(String[] args){
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }
    public static void Line(){
        System.out.print("+");
        for(int dash=0; dash<2*SIZE + 1; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() {
        for (int line = 1; line <SIZE+1; line++) {
            System.out.print("|");

            for (int space = 1; space <= -1 * line + SIZE+1; space++) {
                System.out.print(" ");
            }

            for (int slash = 1; slash <= 1 * line - 1; slash++){
                System.out.print("/");
            }

            System.out.print("*");

            for (int slash = 1; slash <= 1 * line - 1; slash++){
                System.out.print("\\");
            }

            for (int space = 1; space <= -1 * line + SIZE+1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line <SIZE+1; line++) {
            System.out.print("|");

            for (int space = 1; space <= 1 * line + 0; space++) {
                System.out.print(" ");
            }

            for (int slash = 1; slash <= -1 * line + SIZE; slash++){
                System.out.print("\\");
            }

            System.out.print("*");

            for (int slash = 1; slash <= -1 * line + SIZE; slash++){
                System.out.print("/");
            }

            for (int space = 1; space <= 1 * line + 0; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }



}

