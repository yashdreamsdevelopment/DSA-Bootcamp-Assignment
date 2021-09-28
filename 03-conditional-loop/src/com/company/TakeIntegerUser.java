package com.company;

import java.util.Scanner;

public class TakeIntegerUser {
    public static void main(String[] args) {
        // Question: Take integer inputs till the user enters 0 and print the sum of all numbers

        // Discussion: we will take input from the user till user enters 0 as an input and if so return the sum of all
        //              the enters inputs.

        // Solution:
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
