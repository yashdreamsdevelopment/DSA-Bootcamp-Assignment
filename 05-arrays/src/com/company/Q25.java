package com.company;

import java.util.ArrayList;

public class Q25 {
    public static void main(String[] args) {
        // Question: Reshape the Matrix
        // Link: https://leetcode.com/problems/reshape-the-matrix/

        // Solution:
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] output = matrixReshape(mat, r, c);

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
//        // creating the list to store all the elements of mat array in row transversing order
//        ArrayList<Integer> list = new ArrayList<>();
//
//        int matRow = mat.length;
//        int matCol = mat[0].length;
//
//        for (int row = 0; row < mat.length; row++) {
//            for (int col = 0; col < mat[row].length; col++) {
//                list.add(mat[row][col]);
//            }
//        }
//
//        // creating a new array.
//        int[][] output = new int[r][c];
//
//        if (matRow*matCol != r*c){
//            return mat;
//        }
//
//        int k = 0;
//        for (int row = 0; row < r; row++) {
//            for (int col = 0; col < c; col++) {
//                output[row][col] = list.get(k++);
//            }
//        }
//
//        return output;

        // solution 2:

        int m = mat.length;
        int n = mat[0].length;

        if (m*n != r*c){
            return mat;
        }

        int row = 0;
        int col = 0;
        int [][] res = new int[r][c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;

                if (col == c){
                    col = 0;
                    row++;
                }
            }
        }

        return res;
    }




}
