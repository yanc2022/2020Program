package com.company;

import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {
        int i1;
        double d1;
        String s1;

        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        Scanner scan = new Scanner(System.in);

//        declare variables
        int i2;
        double d2;
        String s2;

//        scan variables
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        s2 = scan.nextLine();
        s2 = scan.nextLine();

//        print everything out
        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();
    }
}