package com.medium;

public class Q5 {
    public static void main(String[] args) {
        // Question: Jump Game
        // Link: https://leetcode.com/problems/jump-game/

        // Solution:
        int[] nums = {3,2,1,1,4};
        boolean output = canJump(nums);
        System.out.println(output);

    }
    public static boolean canJump(int[] nums) {

        int n = nums.length;
        int reachable = 0;
        for (int i = 0; i < n; i++) {
            if (i>reachable){
                return false;
            }
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;

    }
}
