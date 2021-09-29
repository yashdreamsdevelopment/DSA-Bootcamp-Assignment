package com.company;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Question: Power In Java

        // Discussion: 2^4 = 2x2x2x2

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();

        double power = power(num, n);
        System.out.println(num+"^"+n+": "+ power);
    }

    static double power(int num, int n){
        int power = 1;
        while(n > 0){
            power *= num;
            n--;
        }
        return power;
    }
}
