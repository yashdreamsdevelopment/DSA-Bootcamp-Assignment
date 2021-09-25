package com.company;

import java.util.Scanner;

public class SumOfBoth {
    public static void main(String[] args) {
        // Question: Take two numbers and print the sum of both.

        // defination: take two numbers as an input from the user and retun the sum of both.

        // solution:

        Scanner sc = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = sc.nextInt();
        System.out.println("num2: ");
        int num2 = sc.nextInt();

        System.out.println("The sum is: "+sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
