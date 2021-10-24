package com.company;

public class Q4 {
    public static void main(String[] args) {
        // Question: Richest Customer Wealth
        // link: https://leetcode.com/problems/richest-customer-wealth/

        // Solution:
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int output = maximumWealth(accounts);

        System.out.println(output);
    }

    static int maximumWealth(int[][] accounts){
        // accounts[i][j]
        // ixj --> i=customer, j=bank accounts.
        int wealth = 0;
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
//            if(wealth > maxWealth){
//                maxWealth = wealth;
//            }
            maxWealth = Math.max(maxWealth, wealth);
            wealth = 0;
        }

        return maxWealth;
    }
}
