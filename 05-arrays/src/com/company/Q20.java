package com.company;

import java.util.Arrays;

public class Q20 {
    public static void main(String[] args) {
        // Question: Determine Whether Matrix Can Be Obtained By Rotation
        // Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

        // Solution:
        int[][] mat = {{0,0,0}, {0,1,0}, {1,1,1}};
        int[][] target = {{1,1,1}, {0,1,0}, {0,0,0}};

        boolean obtained = findRotation(mat, target);
        System.out.println(obtained);
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        int n = 0;
        while (n<4){
            if (Arrays.deepEquals(mat, target)){
                return true;
            }
            rotateBy90(mat);
            n++;
        }
        return false;
    }

    static void rotateBy90(int[][] mat){
        transposeMat(mat);
        flipCol(mat);
    }

    static void transposeMat(int[][] mat){

        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    static void flipCol(int[][] mat){
        int s = 0;
        int e = mat.length-1;

        while(s<e){
            for (int i = 0; i < mat.length; i++) {
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
            }
            s++;
            e--;
        }
    }
}
