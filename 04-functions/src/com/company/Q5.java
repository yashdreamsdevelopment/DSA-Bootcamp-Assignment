package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Question: Define a method that returns the product of two numbers entered by user.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter your num2: ");
        float num2 = sc.nextFloat();

        float product = productOf(num1, num2);
        System.out.println("The sum is: "+ product);

    }

    // method to find the sum of two numbers
    static float productOf(float num1, float num2){
        return num1*num2;
    }

}
