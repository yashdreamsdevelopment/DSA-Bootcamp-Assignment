package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Question: Find if a number is palindrome or not

        // Discussion: The number which is same if read in reverse order is a palindrome number
        //             eg. 181 (181) --> palindrome
        //             eg. 876 (678) --> not palindrome

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean palindrome = isPalindrome(num);
        if (palindrome){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    static boolean isPalindrome(int num){
        int sum = 0;
        int original = num;

        while(num > 0){
            int rem = num % 10;
            sum = (sum*10)+ rem;
            num/=10;
        }
        return original == sum;
    }
}
