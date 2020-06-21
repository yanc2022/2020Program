package com.company;
//Christine

//make scanner
//print statement that will ask the user to enter their full name
//make string called fullName
//define indexOf
//make strings for first name and last name and use substring to separate the two
//define initial
//print out the final gangsta name

import java.util.*;
public class gangsta {
    public static void convertToGanstaName(String name) {
        String fullName = new String(name);
        int indexOf = fullName.indexOf(" ");
        String last = fullName.substring(indexOf + 1);
        last = last.toUpperCase();
        String first = fullName.substring(0, indexOf);
        char initial = first.charAt(0);
        System.out.println("Your gangsta name is " + initial + "." + " " + "Diddy " + last + " " + first + "-izzle");
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = input.nextLine();
        convertToGanstaName(name);
    }

}
