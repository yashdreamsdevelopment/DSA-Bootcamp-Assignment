package com.company;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        // Question: LCM Of Two Numbers

        // Discussion: Least Common Multiple(LCM) is a method to find the smallest common multiple between any
        //             two or more numbers.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int hcf = hcf(num1, num2);
        int lcm = lcm(num1, num2, hcf);

        System.out.println("the lcm is: " + lcm);

    }

    // method to find the hcf
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

    // method to find the lcm
    static int lcm(int num1, int num2, int hcf){
        return (num1*num2)/hcf;
    }
}
