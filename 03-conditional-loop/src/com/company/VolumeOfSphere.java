package com.company;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // Question:  Volume Of Sphere

        // discussion: 4/3xPIxRxRxR

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();

        float volume = volumeOfSphere(r);
        System.out.println("The Volume of sphere is: "+ volume);
    }

    static float volumeOfSphere(int r){
        return (float) (Math.PI * r*r*r*4)/3;
    }
}
