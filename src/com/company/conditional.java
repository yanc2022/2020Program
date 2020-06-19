package com.company;
//Christine

//declare int min and max
//print random number
//set up if statements

import java.util.Scanner;
public class conditional {
    public static void main(String args[]) {
        int min = 1;
        int max = 137;

            int n = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("your randomly generated number is: " + n);

            if (n % 2 == 1)
                System.out.println("weird");

            if ((n % 2 == 0) && (n >= 2 && n <= 5))
                System.out.println("not weird");

            if ((n % 2 == 0) && (n >= 6 && n <= 20))
                System.out.println("weird");

            if ((n % 2 == 0) && (n > 20))
                System.out.println("not weird");

    }
}
