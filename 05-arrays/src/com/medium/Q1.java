package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        // Question: Spiral Matrix
        // Link: https://leetcode.com/problems/spiral-matrix/

        // Solution:
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> ouput = spiralOrder(matrix);
        System.out.println(ouput);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        // declaring a list to store spiral values
        List<Integer> ouput = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;


        while (m*n > ouput.size()){
            // traverse from left to right
            for (int i = left; i <= right ; i++) {
                ouput.add(matrix[top][i]);
            }

            // traverse from right to bottom
                for (int i = top+1; i <= bottom; i++) {
                    ouput.add(matrix[i][right]);
                }

            // traverse from bottom right to left
            // checking columns are not equal
            if (top != bottom){
                for (int i = right-1; i >= left ; i--) {
                    ouput.add(matrix[bottom][i]);
                }
            }

            // traverse from left bottom to top
            // checking rows are not equal
            if (left != right){
                for (int i = bottom-1; i > top ; i--) {
                    ouput.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return ouput;
    }

}
