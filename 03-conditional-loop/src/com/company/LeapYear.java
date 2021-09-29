package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Question: Check if Leap year or not.

        // Discussion: if the year is divisible by 4 then it is a Leap year
        //             and if the year is century year (XX00s) then it should be divisible by 400.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        boolean leap = isLeap(year);

        if (leap){
            System.out.println(year+" is leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }

    // method to find leap year or not
    static boolean isLeap(int year){
        if (year%4 == 0){
            if (year%100 == 0){
                return (year%400 == 0);
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
