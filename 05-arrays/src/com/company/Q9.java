package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        // Question: Create Target Array in the Given Order
        // Link: https://leetcode.com/problems/create-target-array-in-the-given-order/

        // Solution:
        int[] nums = {0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        int[] output = createTargetArray(nums, index);
        System.out.println(Arrays.toString(output));
    }

    static int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];

        ArrayList<Integer> list = new ArrayList<Integer>();

        // now we have to add the value of nums[i] at the index[i] of the list
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        // now the list is created we have to insert the list elements into the target array
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }

        return target;

    }
}
