package com.company;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        // question: Perimeter Of Rhombus

        // discussion: suppose we are provided with the side.

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side: ");
        int side = sc.nextInt();

        int perimeter = perimeterOfRhombus(side);
        System.out.println("the perimeter of rhombus is: " + perimeter);
    }

    static int perimeterOfRhombus(int side){
        return 4*side;
    }

}
