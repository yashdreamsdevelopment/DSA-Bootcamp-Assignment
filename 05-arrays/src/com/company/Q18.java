package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        // Question: Add to Array-Form of Integer
        // Link: https://leetcode.com/problems/add-to-array-form-of-integer/

        // Solution:
        int[] num = {2,1,5};
        int k = 806;
        List<Integer> output = addToArrayForm(num, k);
        System.out.println(output);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> output = new ArrayList<>();

        int n = num.length;
        int i = n- 1;

        while (i>=0 || k>0){
            if (i>=0){
                output.add((num[i]+k) % 10);
                k = (num[i]+k)/10;
            }else{
                output.add(k%10);
                k /= 10;
            }
            i--;
        }

        Collections.reverse(output);
        return output;
    }
}
