package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Question:  Write a program to print whether a number is even or odd, also take input.

    // Discussion: if the number is completely divisible by 2 it is even and if the number is divided by 2, and leave
    //              the remainder 1 are odd.

    // Solution:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean isEven = isEven(num);

        if (isEven){
            System.out.println("Its Even");
        }else{
            System.out.println("Its Odd");
        }
    }

    static boolean isEven(int num){
        return num%2 == 0;
    }
}
