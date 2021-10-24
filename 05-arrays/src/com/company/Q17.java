package com.company;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        // Question: Transpose Matrix
        // Link: https://leetcode.com/problems/transpose-matrix/

        // Solution:
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] output = transpose(matrix);


    }

    static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int[][] output = new int[c][r]; // new int[c][r] bcz, in transpose row becomes column and vice versa.

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                output[j][i] = matrix[i][j];
            }
        }

        return output;
    }
}
