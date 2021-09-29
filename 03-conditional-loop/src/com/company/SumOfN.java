package com.company;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        // Question: Sum Of N Numbers

        // Discussion: sum on N numbers is: n(n+1)/2

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth number: ");
        int n = sc.nextInt();

        int sum = sumOfN(n);
        System.out.println("The sum of "+n+" numbers is: "+sum);
    }

    // method to find the sum of N numbers
    static int sumOfN(int n){
        return n*(n+1)/2;
    }
}
