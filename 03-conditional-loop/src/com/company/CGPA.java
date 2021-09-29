package com.company;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        // Question: Calculate CGPA Java Program

        // Discussion: to get the CGPA we divide our percentage by 9.5 to get the approx CGPA

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your scored marks: ");
        float obtainedMarks = sc.nextInt();
        System.out.print("Enter total marks: ");
        float totalMarks = sc.nextInt();

        // calculate percentage
        float percentage = percentageCal(obtainedMarks, totalMarks);
        System.out.println(percentage);

        // calculate CGPA
        float divider = 9.5f; // constant value for CGPA
        float cgpa = cgpaCal(percentage, divider);

        System.out.println("Your CGPA is: "+ cgpa);

    }

    // method to find percentage
    static float percentageCal(float obtainedMarks, float totalMarks){
        return (obtainedMarks/totalMarks)*100;
    }

    // method to find CGPA
    static float cgpaCal(float percentage, float divider){
        return percentage/divider;
    }
}
