package com.company;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        // Question: Future Investment Value

        // Discussion: we will assume ideal situation of fixed return. inputs to be taken
        //             1. deposit amount (in INR)
        //             2. expected return (in %)
        //             3. time period (in yrs)

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int a = sc.nextInt();
        System.out.print("Enter the Expected return: ");
        float r = sc.nextFloat();
        System.out.print("Time period of investment: ");
        float t = sc.nextFloat();

        float futureValue = fIV(a, r, t);
        System.out.println("The Future Investment Value will be: " + futureValue);
        System.out.println("*Term and condition apply");
    }

    // method to find future investment value
    static float fIV(int a, float r, float t){
        return a*(((r*t)/100) + 1);
    }
}
