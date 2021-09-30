package com.company;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Question: Write a program that will ask the user to enter his/her marks (out of 100).
        //           Define a method that will display grades according to the marks entered as below,

        // grade system:
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//         <=40          Fail

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String grade = grade(marks);
        System.out.println("Your grade is : "+ grade);
    }

    // method to find grade respective to marks
    static String grade(int marks){
        if (marks>100) {
            return "Invalid Marks";
        }else if (marks>=91){
            return "AA";
        }else if (marks>=81){
            return "AB";
        }else if (marks>=71){
            return "BB";
        }else if (marks>=61){
            return "BC";
        }else if (marks>=51){
            return "CD";
        }else if (marks>=41){
            return "DD";
        }else if (marks<=40){
            return "Fail";
        }else return "Invalid Marks";
    }
}
