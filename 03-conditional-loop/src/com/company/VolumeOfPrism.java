package com.company;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        // Question: Volume Of Prism

        // discussion: v = B x H --> here, b = base area, h = height

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Area: ");
        int b = sc.nextInt();
        System.out.println("Enter the height");
        int h = sc.nextInt();

        float volume = volumeOfPrism(b, h);
        System.out.println("The volume of prism is: " + volume);
    }

    static float volumeOfPrism(int b, int h){
        return b * h;
    }
}
