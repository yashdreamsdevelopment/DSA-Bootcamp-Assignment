package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Question: Write a program to print the circumference and area of a circle of radius entered
        //           by user by defining your own method.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Radius: ");
        float r = sc.nextFloat();

        double circumference = circumference(r);
        double area = area(r);

        System.out.println("The circumference is: "+ circumference);
        System.out.println("The area is: "+ area);
    }

    // method to find circumference
    static double circumference(float r){
        return Math.round(2*Math.PI*r);
    }

    // method to find area
    static double area(float r){
        return Math.round(2*Math.PI*Math.pow(r, 2));
    }

}
