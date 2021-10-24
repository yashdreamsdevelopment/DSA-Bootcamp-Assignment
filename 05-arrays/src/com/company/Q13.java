package com.company;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        // Question: Flipping an Image
        // Link: https://leetcode.com/problems/flipping-an-image/

        // Solution:
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] output = flipAndInvertImage(image);
//        System.out.println(Arrays.toString(output));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] flipImage = flip(image);
        int[][] invertedImage = invert(flipImage);

        return invertedImage;
    }

    static int[][] flip(int[][] image){
        int[][] flipped = new int[image.length][];

        for (int i = 0; i < image.length; i++) {
            flipped[i] = reverse(image[i]);
        }

        return flipped;
    }

    static int[][] invert(int[][] flipedImage){
        int[][] inverted = new int[flipedImage.length][];

        for (int i = 0; i < flipedImage.length; i++) {
            inverted[i] = invertImage(flipedImage[i]);
        }

        return inverted;
    }

    static int[] invertImage(int[] img){

        for (int i = 0; i < img.length; i++) {
            if (img[i] == 0){
                img[i] = 1;
            }else{
                img[i] = 0;
            }
        }

        return img;

    }

    static int[] reverse(int[] img){
        int[] reversed = new int[img.length];

        int j = img.length;

        for (int i = 0; i < reversed.length; i++) {
            reversed[j-1] = img[i];
            j--;
        }

        return reversed;
    }
}
