package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        // Question: Kids With the Greatest Number of Candies
        // Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

        // Solution:
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> output = kidsWithCandies(candies, extraCandies);
        System.out.println(output);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = -1;
        for(int i=0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            result.add((candies[i]+extraCandies)>=max);
        }
        return result;
    }


}
