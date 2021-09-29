package com.company;

import java.util.Scanner;

public class LongOperation {
    public static void main(String[] args) {
        // Question: Write a program to print the sum of negative numbers, sum of positive even numbers and the sum
        //           of positive odd numbers from a list of numbers (N) entered by the user. The list terminates
        //           when the user enters a zero.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sumOfNegative = 0;
        int sumOfPositiveEven = 0;
        int sumOfPositiveOdd = 0;

        while (num != 0){
            if (num < 0){
                sumOfNegative += num;
            }else{
                if(num%2 == 0){
                    sumOfPositiveEven += num;
                }else{
                    sumOfPositiveOdd += num;
                }
            }

            System.out.print("Enter the number: ");
            num = sc.nextInt();
        }

        System.out.println("The sum of Negative numbers: "+ sumOfNegative);
        System.out.println("The sum of Positive Even numbers: "+ sumOfPositiveEven);
        System.out.println("The sum of Positive Odd numbers: " + sumOfPositiveOdd);
    }
}
