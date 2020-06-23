package com.company;

import java.util.Random;
import java.util.Scanner;

//Christine Yan
//make scanner
//ask user how many days
//declare days and sum as integers
//create for loop
//generate random temperatures by using array and for loop
//sum them together
//calculate average by dividing sum by days
//create for loop to check how many are above average
//print out answers

public class array {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many days? "); //ask user to input the number of days
        int days = console.nextInt();


        int [] intArray = new int[days];
        int sum = 0;
        Random randy = new Random();

        for (int i = 0; i < days; i++) { //randomly generate temperatures
            intArray [i] = randy.nextInt(85)+25;
            System.out.println ("Day " + (i + 1) + "'s high temperature: " + intArray[i]);
            sum += intArray[i];
        }

        double average = (double) sum / days; //check if each day is above average
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (intArray[i] > average) {
                count++;
            }
        }

        System.out.printf("Average temp = %.1f\n", average); // print results
        System.out.println(count + " days above average");
    }
}


