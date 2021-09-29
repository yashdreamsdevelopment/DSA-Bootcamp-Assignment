package com.company;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        // Question:  HCF Of Two Numbers Program

        // Discussion: HCF (Highest Common Factor) of two natural numbers x and y is the largest possible
        //             number that divides both x and y.
        //             eg. HCF(18, 27)
        //             18 --> 2, 3, 3.
        //             27 --> 3, 3, 3.

        // Algorithm:
//        Define two variables - A, B
//        Set loop from 1 to max of A, B
//        Check if both are completely divided by same loop number, if yes, store it
//        Display the stored number is HCF

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();

        int hcf = hcf(num1, num2);
        System.out.println("HCF is: "+ hcf);

    }

    static int hcf(int num1, int num2){
        int i = 1;
        int hcf = 0;

        while(i<=num1 || i<=num2){
            if (num1%i == 0 && num2%i==0){
                hcf = i;
            }
            i++;
        }
        return hcf;
    }
}
