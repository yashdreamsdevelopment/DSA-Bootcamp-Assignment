package com.company;

import java.util.Scanner;

public class Ncr_Npr {
    public static void main(String[] args) {
        // Question:  Find Ncr & Npr

        // Discussion: Combinations are a way to calculate the total number of outcomes of an event when the order
        //             of the outcomes does not matter.
        //             nCr = n! / r! * (n - r)! --> here, n = nos of item, r = number of items being chosen at a time.

        //             nPr represents the probability of selecting an ordered set of 'r' objects from a group of 'n'
        //             number of objects. The order of objects matters in case of permutation.
        //             nPr = n!/(n-r)!

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nos of Item: ");
        int n = sc.nextInt();
        System.out.print("Number of items being chosen at a time: ");
        int r = sc.nextInt();

        int npr = nPr(n, r);
        int ncr = nCr(npr, r);

        System.out.println("nPr: " + npr);
        System.out.println("nCr: " + ncr);
    }

    static int nPr(int n, int r){
        int npr = (int) (factorialOf(n)/ factorialOf(n-r));
        return npr;
    }

    static int nCr(int npr, int r){
        int ncr = (int) (npr*(1/factorialOf(r)));
        return ncr;
    }

    static double factorialOf(int num){
        double factorial = 1;

        int i = 1;
        while(i<=num){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
