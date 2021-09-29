package com.company;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        // Question: Calculate Depreciation of Value

        // Solution:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Booking Amount : ₹ ");
        long amount = input.nextLong();
        System.out.print("Enter Useful Life in years : ");
        long y = input.nextLong();
        System.out.print("Enter Depreciation Percentage : ");
        long dep = input.nextLong();
        while(y!=0){
            y--;
            amount = ((100-dep)*amount)/100;
        }
        System.out.println("Value After Depreciation : ₹ "+amount);
    }
}
