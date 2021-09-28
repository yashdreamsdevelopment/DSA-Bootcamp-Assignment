package com.company;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        // Question: Perimeter Of Equilateral Triangle

        // Discussion: 3*Side

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side: ");
        int side = sc.nextInt();

        float perimeter = perimeterOfEquilateral(side);
        System.out.println("The perimeter of Equilateral Triangle is: "+ perimeter);
    }

    static float perimeterOfEquilateral(int side){
        return 3*side;
    }

}
