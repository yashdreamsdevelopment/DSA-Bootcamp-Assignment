package com.company;

import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        // Question: Fibonacci series in java.

        // Discussion: we will find the nth fibonacci number by taking the input from the user.
        // fibonacci series: 0 1 1 2 3 5 8 13 21 ...

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Nth Fibonacci number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }

        System.out.println("The " + n + " th fibonacci number is: " + b);

    }
}
