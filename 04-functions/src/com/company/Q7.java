package com.company;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Question: Define a method to find out if a number is prime or not.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        boolean prime = isPrime(num);

        if (prime){
            System.out.println(num + " is Prime");
        }else{
            System.out.println(num +" is not Prime");
        }
    }

    // method to find the a number is prime or not
    static boolean isPrime(int num){
        int i = 2;
        while(i*i < num){
            if (num%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
