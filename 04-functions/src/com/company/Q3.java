package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Question: A person is eligible to vote if his/her age is greater than or equal to 18.
        //           Define a method to find out if he/she is eligible to vote.

        // Solution;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        boolean eligibility = isEligible(age);

        if (eligibility){
            System.out.println("Yes, you can Vote");
        }else{
            System.out.println("No, you can't Vote");
        }
    }

    // method to find the eligibility
    static boolean isEligible(int age){
        return age>=18;
    }
}
