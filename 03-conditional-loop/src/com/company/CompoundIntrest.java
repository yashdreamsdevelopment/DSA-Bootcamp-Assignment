package com.company;

import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        // Question: Compound Interest Java Program

        // Discussion: the formula we studied in 9th standard,
        //             C.I. = P((1+R)/100)^T - P --> here, P = principle, R = rate of intrest, T = time period

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of Intrest: ");
        float r = sc.nextFloat();
        System.out.print("Enter Time Period: ");
        float t = sc.nextFloat();

        float ci = compoundIntrest(p, r, t);
        System.out.println("The Compound Intrest is: " + ci);
    }

    static float compoundIntrest(int p, float r, float t){

        return (float) (p*(Math.pow(1+(r/100), t)) - p);
    }
}
