package com.company;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Christine Yan

//import scanner
//make a method for a welcome screen and instructions
//make a method for the reader
//create file reader
//create scanner to read file
//create if statement for if the token equals the answer the user gave
//in the if statement, print out that the user guessed correctly and also add to the score and rounds count, then add return statement
//if the user guesses incorrectly, print out that the user guessed incorrectly and only add to the rounds count, then add return statement
//declare score and roundNum as integers
//declare scoreRound as array
//ask the user whether they want to play
//create while loop that works when the user types "Y"
//ask the user whether they want to guess a food or number
//create if statement for if the answer wants to guess a food
//ask user to enter a food
//add scoreRound
//print out the score and round number
//ask if the user wants to play again
//create else if statement for if the user wants to guess a number
//ask user to type number between 1 and 50
//declare num as double
//create while loop for when the user inputs a number outside or range reminding user to be aware of constraints
//ask user to guess another number
//add scoreRound
//print out the score and round number
//ask if the user wants to play again
//create else statement for when the user chooses something other than a word or number and ask if the user wants to play again



public class game {

        public static void main(String[] args) throws IOException {
            Scanner input = new Scanner(System.in);
            Welcome();
            System.out.print("Do you want to play (Y or N)? ");
            String play = input.next();
            int score = 0;
            int roundNum = 0;
            int[] scoreRound = {score, roundNum};

            while (play.toUpperCase().equals("Y")) {
                System.out.print("Do you want to guess a type of food (F) or a number (N)? ");
                String wordType = input.next();
                if (wordType.toUpperCase().equals("F")) {
                    System.out.print("Type a food you want to guess: ");
                    String answer = input.next();
                    scoreRound = Reader(answer, scoreRound);
                    System.out.println("Score: " + scoreRound[0] + "\nRounds: " + scoreRound[1]);
                    System.out.println( );
                    System.out.print("Do you want to play again(Y or N)? ");
                    play = input.next();
                } else if (wordType.toUpperCase().equals("N")) {
                    System.out.print("Type a number between 1-50 inclusive that you want to guess (both decimals and integers work): ");
                    String answer2 = input.next();
                    double num = Double.parseDouble(answer2);
                    while (num < 1 || num > 50) {
                        System.out.println("You can only guess numbers between 1-50 inclusive");
                        System.out.print("Guess another number here (both decimals and integers work): ");
                        answer2 = input.next();
                        num = Double.parseDouble(answer2);
                    }
                    scoreRound = Reader(answer2, scoreRound);
                    System.out.println("Score: " + scoreRound[0] + "\nRounds: " + scoreRound[1]);
                    System.out.println( );
                    System.out.print("Do you want to play again(Y or N): ");
                    play = input.next();
                } else {
                    System.out.println("You can only choose between a number and a word");
                    System.out.print("Do you want to play again(Y or N): ");
                    play = input.next();
                }
            }
            Close(scoreRound);
        }

        public static int[] Reader(String answer, int[] scoreRound) throws IOException {
            FileReader readF = new FileReader("c:/temp/info.txt");
            Scanner myScanner = new Scanner(readF);
            int [] initial= scoreRound;
            while (myScanner.hasNext()) {
                String token = myScanner.next();
                if (token.toUpperCase().equals(answer.toUpperCase())) {
                    scoreRound[0] = scoreRound[0] + 1;
                    scoreRound[1] = scoreRound[1] + 1;
                    System.out.println("Guess is correct!");
                    return scoreRound;
                }
            }
            System.out.println("Guess is incorrect!");
            scoreRound[1] = scoreRound[1] + 1;
            return scoreRound;
        }

        public static void Welcome() {
            System.out.println("*----------------------*");
            System.out.println("|                      |");
            System.out.println("|      Welcome to      |");
            System.out.println("|     our guessing     |");
            System.out.println("|         game!        |");
            System.out.println("|                      |");
            System.out.println("*-----Instructions-----*");
            System.out.println("| Try to guess as many |\n| types of food and    |\n| numbers (decimals or |\n| integers) between    |\n| 1-50 as possible.    |");
            System.out.println("| Every time you get a |\n| word or number right |\n| you get 1 point.     |");
            System.out.println("| You can play as many |\n| times as you want    |");
            System.out.println("*----------------------*");
        }
        public static void Close(int scoreRound[]){
            String space=" ";
            System.out.println("*----------------------*");
            System.out.println("|  Thanks for playing  |");
            System.out.printf("|  Final Score #:%2d%4s|\n", scoreRound[0], space);
            System.out.printf("|  Rounds played:%2d%4s|\n", scoreRound[1],space);
            System.out.println("|         Bye!         |");
            System.out.println("*----------------------*");
        }
    }

