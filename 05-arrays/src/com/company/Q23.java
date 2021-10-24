package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q23 {
    public static void main(String[] args) {
        // Question: Saddle Point In Matrix
        // Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/

        // Solution:
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> output = luckyNumbers(matrix);
        System.out.println(output);
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (minInRow(matrix[row][col], row, matrix)){
                    if (maxInCol(matrix[row][col], col, matrix)){
                        lucky.add(matrix[row][col]);
                    }
                }
            }
        }

        return lucky;
    }

    static boolean minInRow(int ele, int row, int[][] matrix){
        int min = ele;
        int[] matrixRow = matrix[row];

        for (int i = 0; i < matrixRow.length; i++) {
            if (matrixRow[i] < min){
                return false;
            }
        }

        return true;
    }

    static boolean maxInCol(int ele, int col, int[][] matrix){
        int max = ele;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > max){
                return false;
            }
        }

        return true;
    }



}
