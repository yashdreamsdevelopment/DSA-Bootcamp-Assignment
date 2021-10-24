package com.company;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        // Question: Find the Highest Altitude
        // Link: https://leetcode.com/problems/find-the-highest-altitude/

        // Solution:
        int[] gain = {-5, 1, 5, 0, -7};
        int output = largestAltitude(gain);
        System.out.println(output);
    }

    static int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude[i+1] = gain[i] + altitude[i];
        }

        System.out.println(Arrays.toString(altitude));

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < altitude.length; i++) {
            max = Math.max(max, altitude[i]);
        }
        return max;
    }
}
