package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        // Question: Find First and Last Position of Element in Sorted Array
        // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        // Solution:
        int[] nums = {5,7,7,8,8,10};
        int target = 5;

        int[] output = searchRange(nums, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];

        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);

        return arr;
    }

    public static int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int pos = -1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if (nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                pos = mid;
                end = mid-1;
            }
        }

        return pos;
    }

    public static int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int pos = -1;


        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }else if (nums[mid]> target){
                end = mid-1;
            }else{
                pos = mid;
                start = mid+1;
            }
        }
        return pos;
    }
}
