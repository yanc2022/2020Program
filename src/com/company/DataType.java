package com.company;
//Christine Yan

//  declare variables (int i = 4, double d = 4.0, String s = "Greenhill"
//  create scanner
//  declare another int, double, and String
//  print something that asks the user to input specific things (such as an integer, double, and phrase)
//  make scanner read the input
//  set up variables for each output
//  make equations by adding the two values
//  print the outputs
//  when printing out the double make sure it is to one decimal place by using print f and %.1

import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {

        //declare variables
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        //scanner
        Scanner scan = new Scanner(System.in);

        //declare more variables
        int i2;
        double d2;
        String s2;

        //user input
        System.out.println("Please enter an integer: ");
        i2 = scan.nextInt();

        System.out.println("Please enter a double: ");
        d2 = scan.nextDouble();

        System.out.println("Please enter a string: ");
        s2 = scan.nextLine();
        s2 = scan.nextLine();

        //equation variables
        int calc1 = i +i2;
        double calc2 = d + d2;
        String calc3 = s + s2;

        //print
        System.out.println (); //for formatting
        System.out.println (calc1);
        System.out.printf("%.1f\n", calc2);
        System.out.println (calc3);

    }
}