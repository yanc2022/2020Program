package com.company;
//Christine Yan

//create random object
//declare int variable for size
//print something that will tell them what the random size is
//declare array with size
//create for loop
//create restraints for the value of number
//print original array
//create two random values to be swapped
//make if statement to make sure the values are different
//make method to swap the two values
//print output

import java.util.*;

public class swap2 {
    public static void main(String[] args) {
        Random number = new Random();
        int size = number.nextInt(5) + 5; //make values between 5 and 10
        System.out.println("you will have " + size + " random numbers");
        int[] a1 = new int[size]; //create array with randomly generated size


        for (int i = 0; i < size; i++) {
            a1[i] = number.nextInt(100);
        }
        System.out.println(Arrays.toString(a1));

        int value1 = number.nextInt(size); //declare the two places that will be swapped
        int value2 = number.nextInt(size);

        if (value1 != value2) { //value1 can't equal value 2 because nothing will be swapped

            swap(a1, value1, value2);
            System.out.println(Arrays.toString(a1));
        }
    }

    public static int[] swap(int[] a, int value1, int value2) { //method to swap values
        int temp = a[value1];
        a[value1] = a[value2];
        a[value2] = temp;
        return a;

    }
}

