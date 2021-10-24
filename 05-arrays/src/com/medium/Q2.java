package com.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2{
    public static void main(String[] args) {
        // Qustion: Set Matrix Zeroes
        // Link: https://leetcode.com/problems/set-matrix-zeroes/

        // Solution:
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
        setZeroes(matrix);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }


    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> zeroPos = new ArrayList<>();



        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0){
                    zeroPos.add(row);
                    zeroPos.add(col);
                }
            }
        }

        System.out.println(zeroPos);

        for (int i = 0; i < zeroPos.size(); i++) {
            int row = zeroPos.get(i++);
            int col = zeroPos.get(i);

            setRowColZero(row,col,matrix);
        }

    }

    public static void setRowColZero(int row, int col, int[][] matrix){
        // set the row to zero
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }

        // set the col to zero
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
