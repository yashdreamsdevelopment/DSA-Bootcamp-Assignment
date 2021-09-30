package com.company;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        // Question: Write a function that returns the sum of first n natural numbers.

        // Discussion: sum of N natural number = N(N+1)/2

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sumOfN = sumOfN(n);
        System.out.println("The sum of first "+n+" natural number is: "+ sumOfN);
    }

    // method to find the sum of first N natural number
    static int sumOfN(int n){
        return n*(n+1)/2;
    }
}
