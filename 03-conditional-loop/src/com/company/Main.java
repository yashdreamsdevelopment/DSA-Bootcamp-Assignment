package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // question: Area Of Circle Java Program
        // discussion: Area of circle: 2*PI*R*R.
        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int radius = sc.nextInt();

        float area = AreaOfCircle(radius);
        System.out.println("The area of circle is: "+ area);
    }

    static float AreaOfCircle(int radius){
        return (float)(2*Math.PI*radius*radius);
    }
}
