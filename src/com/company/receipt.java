package com.company;

public class receipt {

    public static void main(String[] args) {
        // Calculate total owed, assuming 8% tax / 15% tip

        int subtotal = 38 + 40 + 30;
        double tax = subtotal * 0.8;
        double tip = subtotal * 0.15;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal:" + subtotal );
        System.out.println("Tax:" + tax );
        System.out.println("Tip:" + tip );
        System.out.println("Total:" + total);

    }

}
