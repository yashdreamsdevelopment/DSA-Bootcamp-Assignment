package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Question:  Input a number and print all the factors of that number (use loops).

        // discussion: 7! =  7x6x5x4x3x2x1.

        // solution:
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double factorial = factorialOf(num);
        System.out.println(factorial);
    }

    static double factorialOf(int num){
        double factorial = 1;

        int i = 1;
        while(i<=num){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
