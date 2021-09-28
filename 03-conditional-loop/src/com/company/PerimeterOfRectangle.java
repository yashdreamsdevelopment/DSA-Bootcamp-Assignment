package com.company;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        // Question: Perimeter Of Rectangle

        // discussion: 2(length + width)

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the width: ");
        int width = sc.nextInt();

        int perimeter = perimeterOfRectangle(length, width);
        System.out.println("the perimeter of rectangle is: " + perimeter);
    }

    static int perimeterOfRectangle(int length, int width){
        return 2*(length + width);
    }
}
