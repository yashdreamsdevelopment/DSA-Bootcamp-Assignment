package com.company;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        // Question: Perfect Number In Java

        // Discussion: a Positive Integer that is equal to the sum of its proper divisors.
        //             eg. 6 = 1x6
        //                 6 = 2x3
        //                 6 = 3x2
        //                 6 = 6x1
        //             so, 1+2+3 = 6 , hence 6 is a perfect number.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean perfect = isPerfect(num);

        if (perfect){
            System.out.println(num + " is Perfect");
        }else{
            System.out.println(num + " is Not Perfect");
        }
    }

    // method to find the perfect number
    static boolean isPerfect(int num){
        int sum = 0;
        int original = num;

        int i = 1;
        while(i<num){
           if (original%i == 0){
               sum += i;
           }
           i++;
        }
        return sum == original;
    }
}
