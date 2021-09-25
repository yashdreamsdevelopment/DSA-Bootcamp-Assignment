package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Question: Take a number as input and print the multiplication table for it.

        // defination: print the multiplication table of the number inputed from the user.

        // solution:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The Multiplication Table is: ");
        printTable(num);
    }

    static void printTable(int num){
        int i = 1;
        do{
            int ans = num * i;
            System.out.println(ans);
            i++;
        }while (i <= 10);
    }
}
