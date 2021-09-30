package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Question: Define a program to find out whether a given number is even or odd.

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        boolean even = isEven(num);
        if (even){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }

    // method to find whether a number is even or odd
    static boolean isEven(int num){
        return num%2==0;
    }
}
