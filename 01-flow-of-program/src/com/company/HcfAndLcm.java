package com.company;

import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        // Question: Take 2 numbers as inputs and find their HCF and LCM.

        // HCF : An H.C.F or Highest Common Factor, is the largest common factor of two or more values.
        // 12 → 1, 2, 3, 4, 6, 12
        // 16 → 1, 2, 4, 8, 16
        // The common factors are 1, 2, 4 and the highest common factor is 4.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 ");
        int num2 = sc.nextInt();

        int hcf = hcf(num1, num2);
        int lcm = lcm(num1, num2, hcf);

        System.out.println("HCF & LCM "+ num1 +" and "+ num2 +" is: "+ hcf + " and " + lcm);


    }

    static int lcm(int num1, int num2, int hcf) {
        return (num1 * num2) / hcf;
    }

    static int hcf(int num1, int num2){
        int hcf = 0;

        for (int i = 1; i<=num1 || i<=num2; i++){
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
}
