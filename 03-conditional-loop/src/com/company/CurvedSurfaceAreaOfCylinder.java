package com.company;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        // Question: Curved surface area of cylinder

        // discussion: 2xPIxRxH --> here. R=base radius, H=height of the cylinder

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base radius: ");
        int r = sc.nextInt();
        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        float CSA  = csa(r, h);
        System.out.println("The Curved Surface Area of Cylinder:" + CSA);
    }

    static float csa(int r, int h){
        return (float) (2*Math.PI*r*h);
    }
}
