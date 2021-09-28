package com.company;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        // Question: Area Of Equilateral Triangle

        // discussion:

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int a = sc.nextInt();

        float area = areaOfEquilateralTriangle(a);
        System.out.println("The Area of Equilateral Triangle: "+ area);
    }

    static float areaOfEquilateralTriangle(int a){
        return (float)((Math.sqrt(3)/4)* a*a);
    }
}
