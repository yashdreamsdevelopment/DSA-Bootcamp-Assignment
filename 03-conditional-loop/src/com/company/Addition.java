package com.company;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Question: Addition Of Two Numbers

        // Discussion: we will take two input from the user and return the sum of it.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float a = sc.nextFloat();
        System.out.print("Enter num2: ");
        float b = sc.nextFloat();

        float sum = sum(a, b);
        System.out.println("sum is: "+ sum);
    }

    static float sum(float a, float b){
        return a+b;
    }
}
