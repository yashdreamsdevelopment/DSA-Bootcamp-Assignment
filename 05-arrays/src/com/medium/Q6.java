package com.medium;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        // Question: Rotate Array
        // Link: https://leetcode.com/problems/rotate-array/

        // Solution:
        int[] nums = {1,2,3,4,5,6,7};
        int k = 8;
        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k){
        int n = nums.length;
         k = k%n;
        flip(nums,0, n-1);
        flip(nums, 0, k-1);
        flip(nums, k, n-1);
    }
    public static void flip(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
