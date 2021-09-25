package com.company;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        // Question: Take 2 numbers as input and print the largest number.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1:");
        int num1 = sc.nextInt();
        System.out.println("enter num 2:");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        System.out.println("The maximun is: " + max);

    }
}
