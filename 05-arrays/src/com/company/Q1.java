package com.company;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
	    // Question: Build Array from Permutation
        // Link: https://leetcode.com/problems/build-array-from-permutation/

        // Solution:
        int[] nums = {0,2,1,5,3,4};
        int[] output = buildArray(nums);

        System.out.println(Arrays.toString(output));
    }

    // method to build array from permutation
    static int[] buildArray(int[] nums){
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]];
        }

        return array;
    }
}
