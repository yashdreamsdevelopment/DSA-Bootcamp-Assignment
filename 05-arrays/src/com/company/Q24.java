package com.company;

public class Q24 {
    public static void main(String[] args) {
        // Question: Maximum Subarray
        // Link: https://leetcode.com/problems/maximum-subarray/

        // Solution;
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int output = maxSubArray(nums);
        System.out.println(output);
    }

    static int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int totalSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){
            if (curr_sum < 0){
                curr_sum = nums[i];
            }else{
                curr_sum += nums[i];
            }
            totalSum = Math.max(totalSum,curr_sum);
        }

        return totalSum;
    }
}
