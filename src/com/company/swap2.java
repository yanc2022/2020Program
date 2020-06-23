package com.company;

import java.util.*;

public class swap2 {
    public static void main(String[] args) {
        Random number = new Random ();
        int size = number.nextInt(5)+5;
        System.out.println("you will have " + size + " random numbers");
        int[] a1 = new int [size];


        for (int i = 0; i < size; i++) {
            a1[i] = number.nextInt(100);
        }
        System.out.println(Arrays.toString(a1));

        int value1 = number.nextInt(size);
        int value2 = number.nextInt(size);

        do{
            swap(a1, value1, value2);
        }
        while (value1 == value2);

        System.out.println(Arrays.toString(a1));
    }

    public static int[] swap(int[] a, int value1, int value2) {
        int temp = a[value1];
        a[value1] = a[value2];
        a[value2] = temp;
        return a;

    }
}

