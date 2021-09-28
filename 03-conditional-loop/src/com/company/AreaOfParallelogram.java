package com.company;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        // Question: Area Of Parallelogram.

        // discussion: Base * height

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int base = sc.nextInt();
        System.out.println("Enter the Height");
        int height = sc.nextInt();

        int area = areaOfParallelogram(base, height);
        System.out.println("The area of parallelogram: " + area);
    }

    static int areaOfParallelogram(int b, int h){
        return b * h;
    }
}
