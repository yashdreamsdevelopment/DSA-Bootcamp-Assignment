package com.company;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        // question: Area Of Rhombus
        // discussion: d1 * d2 / 2

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Diagonal 1: ");
        int d1 = sc.nextInt();
        System.out.println("Enter the Diagonal 2");
        int d2 = sc.nextInt();

        int area = areaOfRhombus(d1, d2);
        System.out.println("The area of Rhombus is: "+ area);
    }

    static int areaOfRhombus(int d1, int d2){
        return d1 * d2 / 2;
    }
}
