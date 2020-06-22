package com.company;
//Christine Yan

//make scanner
//ask the user how many words they want to input
//declare variable for number
//create condition statement with if/else to check if the number meets the constraints of being between 1 and 10
//make a for loop that repeats based off what the user input
//make variable for word
//in the for loop, ask user to enter word
//create condition statement with if/else to check if the length of word meets the constraints of being between 2 and 10000
//create method to divide word
//in the method, make for loops to determine whether character is even or odd
//return output to main function

import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many words do you want to input (between 1 and 10)?");
        int number = input.nextInt();

        //to make sure number is between 1 and 10
        if (number <= 10 && number >= 1) {
            for (int n = 0; n < number; n++) {
                String word;

                System.out.println("Please enter your word (# of letters between 2 and 10,000: )");
                word = input.next();

                //to make sure length of word is between 2 and 10000
                if (word.length()<=10000 &&  word.length()>=2) {
                    String divideWord = divideWord(word);
                    System.out.println(divideWord);
                }
                else {
                    //will tell user to try again
                    System.out.println("Try again and make sure your word is between 2 and 10,000 letters long");
                    //will stop process if constraints not met
                    break;
                }

            }
        } else
            //will tell user to try again
            System.out.print("Try again and make sure your number is between 1 and 10");
    }
    //create a method to divide word
        public static String divideWord (String word){
            String even = "";
            String odd = "";


            for (int i = 0; i < word.length(); i += 2) {
                even = even + word.charAt(i);
            }

            for (int i = 1; i < word.length(); i += 2) {
                odd = odd + word.charAt(i);
            }
            return (even + " " + odd);

        }
    }


