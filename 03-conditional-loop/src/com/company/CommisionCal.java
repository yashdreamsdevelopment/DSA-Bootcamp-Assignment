package com.company;

import java.util.Scanner;

public class CommisionCal {
    public static void main(String[] args) {
        // Question: Calculate Commission Percentage

        // Discussion: we will take two input from the user 1. total deal done in.
        //             2. the amount you got.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount of deal done: ");
        double deal = sc.nextDouble();
        System.out.print("Enter the Amount you got: ");
        double amount = sc.nextDouble();

        float commission = commission(deal, amount);
        System.out.println("your commission is: "+ commission + "%");
    }

    // method to find commision
    static float commission(double deal, double amount){
        return (float)  (amount/deal)*100;
    }
}
