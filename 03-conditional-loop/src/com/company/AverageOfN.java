package com.company;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        // Question: Calculate Average Of N Numbers

        // Discussion: we have a math formula i.e (n+1/2)
        //              1. sum of N numbers = n(n+1)/2
        //              2. So, for Avg. divide it by n i.e. (n+1)/2

        // Solution;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to Calculate Average of N numbers: ");
        int num = sc.nextInt();

        float avg = (num+1)/2f;
        System.out.println("The Avg. of "+ num + " numbers is: " + avg);
    }
}
