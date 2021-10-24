package com.company;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        // Question: Shuffle the Array
        // Link: https://leetcode.com/problems/shuffle-the-array/

        // Solution:
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] output = shuffle(nums, n);
        System.out.println(Arrays.toString(output));
    }

    static int[] shuffle(int[] nums, int n){
        int[] output = new int[2*n];

        int j = 0;
        for (int i = 0; i < nums.length; i+=2) {
            output[i] = nums[j];
            output[i+1] = nums[j+n];
            j++;
        }

        return output;

    }
}
