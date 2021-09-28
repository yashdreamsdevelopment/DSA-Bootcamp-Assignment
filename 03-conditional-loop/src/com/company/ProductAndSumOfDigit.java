package com.company;

import java.util.Scanner;

public class ProductAndSumOfDigit {
    public static void main(String[] args) {
        // Question: Subtract the Product and Sum of Digits of an Integer
        // Question Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

        // Discussion: user will input an integer, and find the subtraction of (product of the individual digits) and
        //              (sum of digits) of that integer.


        // solution:
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // subtraction of product and sum of digits (sPS)
        int ans = sPS(num);
        System.out.println(ans);
    }

    // method to find Subtraction of product and sum of digits of inputted integer
    static int sPS(int num){
        int product = productOfDigit(num);
        int sum = sumOfDigit(num);

        System.out.println("Product is: " + product);
        System.out.println("Sum is: " + sum);

        return (product - sum);
    }

    // method to find product of digit
    static int productOfDigit(int num){
        int product = 1;

        while(num > 0){
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
        return product;
    }

    // method to find sum of digit
    static int sumOfDigit(int num){
        int sum = 0;

        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
