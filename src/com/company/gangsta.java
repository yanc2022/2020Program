package com.company;

import java.util.*;
public class gangsta {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = input.nextLine();

        String fullName = new String(name);
        int indexOf = fullName.indexOf(" ");

        String last = fullName.substring(indexOf + 1);
            last = last.toUpperCase();
        String first = fullName.substring(0, indexOf);
        char initial = first.charAt(0);

        System.out.println("Your gangsta name is " + initial + "." + " " + "Diddy " + last + " " + first + "-izzle");
    }

}
