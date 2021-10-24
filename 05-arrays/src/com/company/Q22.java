package com.company;

import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int n = 5;
        int[] output = sumZero(n);
        System.out.println(Arrays.toString(output));
    }

    static int[] sumZero(int n) {
        int[] newArray = new int[n];
        for(int i=0; i<n; i++) {
            newArray[i]  = (i*2)-n+1;
        }
        return newArray;
    }
}
