package com.company;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        // Question: Volume Of Cone Java Program

        // discussion: volume for right circular cone is: PIxRxRxH / 3

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        System.out.println("Enter the height");
        int h = sc.nextInt();

        float volume = volumeOfCone(r, h);
        System.out.println("the volume of cone is: " + volume);
    }

    static float volumeOfCone(int r, int h){
        return (float) (Math.PI*r*r*h) / 3;
    }
}
