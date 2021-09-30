package com.company;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Question: Write a program to print the factorial of a number by defining a method named 'Factorial'

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        long factorial = factorial(num);
        System.out.println(num+"! = "+ factorial);
    }

    // method to find factorial
    static long factorial(int num){
        long fact = 1;
        if (num == 0 || num == 1){
            return fact;
        }

        int i = 1;
        while(i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
