package com.company;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        // Question: Volume Of Pyramid

        // discussion: lxwxh / 3 --> here, l = base length, w = base width, h = pyramid height

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base length: ");
        int l = sc.nextInt();
        System.out.println("Enter the base width");
        int b = sc.nextInt();
        System.out.println("Enter the height");
        int h = sc.nextInt();

        int volume = volumeOfPyramid(l, b, h);
        System.out.println("the volume of pyramid is: " + volume);
    }

    static int volumeOfPyramid(int l, int b, int h){
        return (l*b*h)/3;
    }
}
