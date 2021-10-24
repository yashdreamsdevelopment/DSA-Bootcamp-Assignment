package com.hard;

public class Q1 {
    public static void main(String[] args) {
        // Question: Max Value of Equation
        // Link: https://leetcode.com/problems/max-value-of-equation/

        // Solution:
        int[][] points =  {{1,3},{2,0},{5,10},{6,-10}};
        int k = 1;

        int output = findMaxValueOfEquation(points, k);
        System.out.println(output);

    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<points.length;i++){
            for (int j = i+1; j < points.length ; j++) {
                for (int l = 0; l < 2; l++) {
                    int x1 = points[i][l];
                    int x2 = points[j][l];
                    int y1 = points[i][++l];
                    int y2 = points[j][l];

                    if (Math.abs(x1-x2)<=k){
                        System.out.println("satisfies, "+Math.abs(x1-x2));
                        int equation = y1+y2+Math.abs(x1-x2);
                        max = Math.max(equation, max);
                        System.out.println("Max is: "+max+" ,for ("+x1+","+x2+") and ("+y1+","+y2+")");
                    }
                }
            }
        }
        return max;
    }
}
