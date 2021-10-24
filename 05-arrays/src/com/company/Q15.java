package com.company;

public class Q15 {
    public static void main(String[] args) {
        // Question: Matrix Diagonal Sum
        // Link: https://leetcode.com/problems/matrix-diagonal-sum/

        // Solution: (use two pointer logic)
        int[][] mat = { {1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1},
                {1,1,1,1}};
        int output = diagonalSum(mat);
        System.out.println(output);
    }

    static int diagonalSum(int[][] mat) {
        boolean even = (mat.length % 2 == 0);
        int ignore = Integer.MIN_VALUE;

        if (!even) {
            ignore = mat.length/2;
        }

        int left = 0;
        int right = mat.length-1;

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum = sum + (mat[i][left] + mat[i][right]);
            left++;
            right--;
        }

        if (!even){
            return sum - mat[ignore][ignore];
        }else{
            return sum;
        }
    }
}
