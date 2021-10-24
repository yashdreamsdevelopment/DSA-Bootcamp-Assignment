package com.company;


import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        // Question: How Many Numbers Are Smaller Than the Current Number
        // Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

        // Solution:
        int[] nums = {7,7,7,7};
        int[] output = smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(output));
    }

    static int[] smallerNumbersThanCurrent(int[] nums){
        int[] output = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j==i){
                    continue;
                }else{
                        if (nums[j] < item){
                            k++;
                            output[i] = k;
                        }
//
                }
            }
        }

        return output;
    }
}
