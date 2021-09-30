package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Question: Write a program to print the sum of two numbers entered by user by defining your own method.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter your num2: ");
        float num2 = sc.nextFloat();

        float sum = sumOf(num1, num2);
        System.out.println("The sum is: "+ sum);

    }

    // method to find the sum of two numbers
    static float sumOf(float num1, float num2){
        return num1+num2;
    }
}
