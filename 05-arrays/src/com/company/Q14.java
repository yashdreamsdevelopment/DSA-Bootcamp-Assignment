package com.company;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        // Question: Cells with Odd Values in a Matrix
        // Link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

        // solution:
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};

        int oddCells = oddCells(m, n, indices);

        System.out.println(oddCells);
    }

    static int oddCells(int m, int n, int[][] indices) {
//        int[] row = new int[m];
//        int[] col = new int[n];
//        int count = 0;
//
//        for (int i = 0; i < indices.length; i++) {
//            row[indices[i][0]]++;
//            col[indices[i][1]]++;
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((row[i] + col[j]) % 2 != 0){
//                    count++;
//                }
//            }
//        }
//
//        return count;

        int res[][] = new int[m][n];
        int count=0;
        for(int[] r : res)
            Arrays.fill(r,0);
        for(int[] r : indices){
            for(int i = 0; i < n; i++)
                res[r[0]][i]+=1;
            for(int j = 0; j < m; j++)
                res[j][r[1]]+=1;
        }

        for(int c[] : res)
            for(int i = 0;i < n;i++)
            {
                if(c[i]%2!=0)
                    count++;
            }

        return count;
    }
}
