package com.company;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Question: Volume Of Cylinder

        // discussion: Pi x R x R x H

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        System.out.println("Enter the height");
        int h = sc.nextInt();

        float volume = volumeOfCylinder(r, h);
        System.out.println("the volume of cylinder is: " + volume);
    }

    static float volumeOfCylinder(int r, int h){
        return (float) (Math.PI*r*r*h);
    }
}
