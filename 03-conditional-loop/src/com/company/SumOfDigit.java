package com.company;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Question: Sum Of A Digits Of Number

        // Discussion: take the input from the user and return the sum of individual digits.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("sum of digits is: "+ sum);
    }

    static int sumOfDigits(int num){
        int sum = 0;

        while(num > 0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }

        return sum;

    }
}
