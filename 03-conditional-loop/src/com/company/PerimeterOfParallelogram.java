package com.company;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        // question: Perimeter Of Parallelogram
        // discussion: 2(a+b)

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int base = sc.nextInt();
        System.out.println("Enter the Side: ");
        int side = sc.nextInt();

        int perimeter = perimeterOfParallelogram(base, side);
        System.out.println("The perimter of parallelogram is: " + perimeter);
    }

    static int perimeterOfParallelogram(int base, int side){
        return 2*(base + side);
    }

}
