package com.company;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        // Question: Take name as input and print a greeting message for that name.

        // Discussion: SI = P x R/100 x T.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle: ");
        float p = sc.nextFloat();
        System.out.println("Rate of Intrest: ");
        float r = sc.nextFloat();
        System.out.println("Time Period: (in years)");
        float t = sc.nextFloat();

        // simple intrest
        float SI = si(p,r,t);
        System.out.println("The Simple intrest is: "+ SI);
    }

    // method for simple intrest
    static float si(float p, float r, float t){
        return (p*r*t)/100;
    }
}
