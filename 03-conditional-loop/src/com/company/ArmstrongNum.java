package com.company;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        // Question: Armstrong Number In Java

        // Discussion: Armstrong number is a number that is equal to the sum of cubes of its digits.
        //             eg: 135 = 1^3 + 3^3 + 5^3

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean armstrong = isArmstrong(num);
        if (armstrong){
            System.out.println("Its ArmStrong number");
        }else{
            System.out.println("Not an ArmStrong number");
        }
    }

    static boolean isArmstrong(int num){
        int orginal = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            int cubeOfDigit = (int) Math.pow(digit, 3);
            sum += cubeOfDigit;
            num /= 10;
        }

        return orginal == sum;
    }
}
