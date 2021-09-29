package com.company;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        // Question: Calculate Batting Average

        // Discussion: In cricket, a player's batting average is the total number of runs they have scored divided
        //              by the number of times they have been out,

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter number of times they have been out: ");
        int outs = sc.nextInt();

        int avg = runs/outs;
        System.out.println("The Batting Average is: "+avg);
    }
}
