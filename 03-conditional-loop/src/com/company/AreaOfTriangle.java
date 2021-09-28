package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        // Question: Area Of Triangle
        // discussion: 1/2*base*height

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int base = sc.nextInt();
        System.out.println("Enter the Height");
        int height = sc.nextInt();

        float area = areaOfTriangle(base, height);
        System.out.println("The Area of Triangle is: "+ area);
    }

    static float areaOfTriangle(int base, int height){
        return 0.5f*base*height;
    }
}
