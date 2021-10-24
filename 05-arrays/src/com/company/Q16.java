package com.company;

public class Q16 {
    public static void main(String[] args) {
        // Question: Find Numbers with Even Number of Digits
        // Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

        // Solution:
        int[] nums = {12,345,2,6,7896};
        int output = findNumbers(nums);
        System.out.println(output);

    }

    static int findNumbers(int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num){
        String newNum = num+"";

        return newNum.length()%2 == 0;
    }
}
