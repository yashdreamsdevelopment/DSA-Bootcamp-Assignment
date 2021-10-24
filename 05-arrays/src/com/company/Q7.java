package com.company;

public class Q7 {
    public static void main(String[] args) {
        // Question: Number of Good Pairs
        // Link : https://leetcode.com/problems/number-of-good-pairs/

        // Solution:
        int[] nums = {1,2,3,1,1,3};
        int output = numIdenticalPairs(nums);
        System.out.println(output);
    }

    static int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                // condition for a good pair nums[i] == nums[j]
                if (nums[i] == nums[j] && i<j){
                    pair++;
                }
            }
        }
        return pair;
    }
}
