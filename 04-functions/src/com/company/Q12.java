package com.company;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        // Question: Write a function to check if a given triplet is a Pythagorean triplet or not.

        // Discussion: A Pythagorean triplet is when the sum of the square of two numbers is equal to the
        //             square of the third number.
        //             eg. a^2+b^2 = c^2

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        System.out.print("Enter num3: ");
        int c = sc.nextInt();

        boolean pythagoreanTriplet = isPythagoreanTripet(a, b, c);
        if (pythagoreanTriplet){
            System.out.println(a+","+b+","+c+" is a Pythagorean Triplet");
        }else{
            System.out.println(a+","+b+","+c+" is a Not a Pythagorean Triplet");
        }
    }

    // method to find the number is Pythagoream Triplet or not
    static boolean isPythagoreanTripet(int a, int b, int c){
        return (a*a + b*b == c*c);
    }
}
