package com.company;

public class challenge3 {
    public static final int SIZE = 9;

    public static void main(String args[]) {

        top();
        bottom();
    }

    public static void top() {
        for (int line = SIZE; line >= 0; line--) {
            char letter = 65;
            for (byte count = 0; count <=line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();
        }
    }

    public static void bottom() {
        for (int line = 0; line <= SIZE; line++) {
            char letter = 65;
            for (byte count = 0; count <=line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();
        }
    }
}

