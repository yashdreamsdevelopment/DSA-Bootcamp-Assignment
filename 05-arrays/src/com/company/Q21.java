package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
        // Question: Two Sum
        // Link: https://leetcode.com/problems/two-sum/

        // Solution:
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);

        System.out.println(Arrays.toString(output));
    }

    static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }

        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;

    }
}
