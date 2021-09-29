package com.company;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        // Question: Calculate Average Marks.

        // Discussion: we will take input from user as 1. nos of subjects and 2. marks in particular

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int noOfSubject = sc.nextInt();
        int totalMarks = 0;

        int i = noOfSubject; // iterator for loop
        while(i > 0){
            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();
            totalMarks += marks;
            i--;
        }
        System.out.println(totalMarks/noOfSubject);
    }
}
