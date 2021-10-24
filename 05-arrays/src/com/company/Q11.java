package com.company;

import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        // Question: Count Items Matching a Rule
        // Link: https://leetcode.com/problems/count-items-matching-a-rule/

        // Solution:


    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int checker;
        if (ruleKey.equals("type")){
            checker = 0;
        }
        else if(ruleKey.equals("color")){
            checker = 1;
        }
        else{
            checker = 2;
        }
        int count = 0;

        for(int i=0;i<items.size();i++)
            if(items.get(i).get(checker).equals(ruleValue))
                count++;

        return count;
    }
}
