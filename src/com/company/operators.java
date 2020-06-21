package com.company;
//Christine Yan

//declare variables of mealCost, tipPercent, and taxPercent
//set up scanner
//ask user to input mealCost, tipPercent, and taxPercent
//find amount of tip by setting up equation
//find amount of tax by setting up equation
//find total by adding mealCost, tax, and tip all together
//round the total by using Math.round
//print out total

import java.util.Scanner;
public class operators {
    public static void main(String[] args) {

        //declare variables
        double mealCost;
        int tipPercent;
        int taxPercent;

        Scanner scan = new Scanner(System.in);

        //ask the user for info
        System.out.println("What is the cost of your meal?");
        mealCost = scan.nextDouble();
        System.out.println("How much is your tip percentage?");
        tipPercent = scan.nextInt();
        System.out.println("What is your tax rate?");
        taxPercent = scan.nextInt();

        //calculations
        double tip = mealCost * tipPercent/100;
        double tax = mealCost * taxPercent/100;
        double total = mealCost + tip + tax;
        total = Math.round(total);

        System.out.println("Your total is: " + total);

    }
}
