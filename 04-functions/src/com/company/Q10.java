package com.company;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Question: Write a function to find if a number is a palindrome or not. Take number as parameter.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        boolean palindrome = isPalindrome(num);
        if (palindrome){
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println(num+" is not Palindrome");
        }
    }

    // method to find a number is Palindrome or not.
    static boolean isPalindrome(int num){
        int original = num;

        int palindrome = 0;
        while(num>0){
            int rem = num%10;
            palindrome = (palindrome*10)+rem;
            num /= 10;
        }

        return original == palindrome;
    }
}
