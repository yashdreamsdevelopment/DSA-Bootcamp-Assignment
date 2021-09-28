package com.company;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        // Question: Perimeter Of Circle

        // discussion: 2*PI*R.

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int radius = sc.nextInt();

        float perimeter = perimeterOfCircle(radius);
        System.out.println("The perimeter of circle is: "+ perimeter);
    }

    static float perimeterOfCircle(int radius){
        return (float)(2*Math.PI*radius);
    }

}
