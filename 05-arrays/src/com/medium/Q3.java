package com.medium;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        // Question: Product of Array Except Self
        // Link : https://leetcode.com/problems/product-of-array-except-self/

        // Solution:
        int[] nums = {1,2,3,4};
        int[] output = productExceptSelf(nums);

        System.out.println(Arrays.toString(output));

    }

    public static int[] productExceptSelf(int[] nums) {
//        int multiplyAll = 1;
//        int count = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                count++;
//            }else{
//                multiplyAll *= nums[i];
//            }
//        }
//
//        if (count == 0){
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = multiplyAll/nums[i];
//            }
//        }else if(count == 1){
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == 0){
//                    nums[i] = multiplyAll;
//                }else{
//                    nums[i] = 0;
//                }
//            }
//        }else{
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = 0;
//            }
//        }
//
//        return nums;

        // Solution 2:
//        int n = nums.length;
//        int[] prefix = new int[n];
//        int[] suffix = new int[n];
//
//        int temp = 1;
//
//        for (int i = 0; i < n; i++) {
//            temp=1;
//            if (i==0){
//                prefix[i] = 1;
//            }
//            for (int j = 0; j < i; j++) {
//                temp *= nums[j];
//            }
//
//            prefix[i] = temp;
//
//        }
//
//        for (int i = 0; i < n; i++) {
//            temp = 1;
//            for (int j = i+1; j < n; j++) {
//                if (j == n){
//                    suffix[j] = 1;
//                }else{
//                    temp *= nums[j];
//                }
//            }
//            suffix[i] = temp;
//        }
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = prefix[i]*suffix[i];
//        }
//
//        return nums;

        // Solution 3:
        int n = nums.length;
        int[] ans = new int[n];
        System.out.println(ans.length);
        int curr = 1;

        // prefix:
        for (int i = 0; i < n; i++) {
            ans[i] = curr;
            curr *= nums[i];
        }

        // suffix and multiplication
        curr = 1;
        for (int i = n-1; i >= 0 ; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        return ans;
    }
}
