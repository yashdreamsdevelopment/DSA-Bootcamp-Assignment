package com.company;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        // Question: Write a function that returns all prime numbers between two given numbers.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = sc.nextInt();
        System.out.print("Enter the num2: ");
        int b = sc.nextInt();

        printPrime(a, b);

    }

    // method to print all the prime numbers between the range
    static void printPrime(int a, int b){
        for (int i = a; i <= b ; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int num){
        int i = 2;
        while(i*i < num){
            if (num%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
