package com.company;

import java.util.Scanner;

public class LargestFromAll {
    public static void main(String[] args) {
        // Question: Take integer inputs till the user enters 0 and print the largest number from
        //           all.

        // Discussion:

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        int max = Integer.MIN_VALUE;

        while (input != 0){
            if (input > max){
                max = input;
                continue;
            }
            System.out.print("Enter the number: ");
            input = sc.nextInt();
        }

        System.out.println("The maximum from the entered number is: " + max);

    }
}
