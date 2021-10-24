package com.company;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        // Question: Running Sum of 1d Array
        // link: https://leetcode.com/problems/running-sum-of-1d-array/

        // Solution:
        int[] nums = {1,2,3,4};
        int[] output = runningSum(nums);

        System.out.println(Arrays.toString(output));
    }

    static int[] runningSum(int[] nums){
        int[] output = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            output[i] = sumOfIndividual(i, nums);
        }

        return output;
    }

    // method to find the sum of sub portion of an array.
    static int sumOfIndividual(int i, int[] nums){
        int sum = 0;

        for (int j=0; j<=i;j++){
            sum += nums[j];
        }

        return sum;
    }

    // another solution:(from)
    // https://github.com/Hrishabh5

//    for(int i=1;i<nums.length;i++){
//        nums[i]+=nums[i-1];
//    }
//        return nums;
}
