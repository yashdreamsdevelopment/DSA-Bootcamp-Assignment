package com.company;


public class Q19 {
    public static void main(String[] args) {
        // Question: Maximum Population Year
        // Link: https://leetcode.com/problems/maximum-population-year/

        // Solution:
        int[][] logs = {{1993,1999},{2000,2010}};
        int output = maximumPopulation(logs);
        System.out.println(output);
    }

    static int maximumPopulation(int[][] logs) {

        // Bruteforce code:
        int[] population = new int[101];

//        for (int i = 0; i < logs.length; i++) {
//            for (int j = logs[i][0]; j < logs[i][1] ; j++) {
//                population[j-1950]++;
//            }
//        }
//
//        int maxVal = 0;
//        int maxYear = 1950;
//        for (int i = 0; i < 101; i++) {
//            if (maxVal<population[i]){
//                maxVal = population[i];
//                maxYear = i+1950;
//            }
//        }
//
//        return maxYear;

        // Optimized code:
        for (int i = 0; i < logs.length; i++) {
            population[logs[i][0] - 1950]++;
            population[logs[i][1] - 1950]--;
        }

        for (int i = 1; i < 101; i++) {
            population[i] = population[i]+population[i-1];
        }

        int maxVal = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (maxVal<population[i]){
                maxVal = population[i];
                maxYear = i+1950;
            }
        }

        return maxYear;
    }
}
