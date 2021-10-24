package com.company;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        // Question: Concatenation of Array
        // link: https://leetcode.com/problems/concatenation-of-array/

        // Solution;
        int[] nums = {1,2,3};
        int[] output = getConcatenation(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(output));
    }

    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int length = 2*(n);
        int[] output = new int[length];

        for (int i=0; i<nums.length; i++){
            output[i] = nums[i];
            output[i+n] = nums[i];
        }

        return output;
    }
}
