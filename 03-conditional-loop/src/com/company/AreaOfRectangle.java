package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // Question: Area Of Rectangle Program.

        // Discussion: length * height.

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the Height");
        int height = sc.nextInt();

        int area = areaOfRectangle(length, height);
        System.out.println("The area of rectangle is: "+ area);
    }

    static int areaOfRectangle(int length, int height){
        return length * height;
    }
}
