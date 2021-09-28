package com.company;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        // Question: Perimeter Of Square

        // discussion: 4 x side.

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side: ");
        int side = sc.nextInt();

        int perimeter = perimeterOfSquare(side);
        System.out.println("the perimeter of square is: " + perimeter);
    }

    static int perimeterOfSquare(int side){
        return 4*side;
    }
}
