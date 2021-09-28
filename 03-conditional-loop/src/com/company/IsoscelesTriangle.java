package com.company;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        // Question: Area Of Isosceles Triangle

        // discussion: 0.5 * b * (a*a - (b*b/4))^1/2

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int b = sc.nextInt();
        System.out.println("Enter the Side");
        int a = sc.nextInt();

        float area = areaOfIsosceles(b, a);
        System.out.println("Area of Isosceles Triangle: "+ area);
    }

    static float areaOfIsosceles(int b, int a){
        return (float) (0.5 * b * Math.sqrt(a*a - (b*b/4)));
    }
}
