package com.company;

import java.util.Scanner;

public class KeepTakingInput {
    public static void main(String[] args) {
        // Question: Keep taking numbers as inputs till the user enters ‘0’, after that print sum of all.

        // solution

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int input = sc.nextInt();
        int sum = 0;

        while(input != 0){
            sum += input;
            System.out.print("enter number: ");
            input = sc.nextInt();
        }

        System.out.println("sum is: "+ sum);

    }
}
