package com.company;

import java.util.Scanner;

public class Main {
     static boolean checkLeapYear(int year){
         // check if the year is completely divisible by 4.
        if (year % 4 == 0){
            // check if the year is century year or not.
            if (year % 100 == 0){
                // check if the century year is completely divisible by 400.
                return (year % 400 == 0);
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
	    // question: Input a year and find whether it is a leap year or not.

        // defination: A leap year is exactly divisible by 4 except for century years (years ending with 00).
        //              The century year is a leap year only if it is perfectly divisible by 400.

        // solution:

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(checkLeapYear(year)){
            System.out.println(year + " its a leap year");
        }else{
            System.out.println(year + " its not a leap year");
        }
    }
}
