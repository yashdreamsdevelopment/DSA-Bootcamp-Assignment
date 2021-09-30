package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
	    // Question: Define two methods to print the maximum and the minimum number respectively among three numbers
        //           entered by the user.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        System.out.print("Enter num3: ");
        int c = sc.nextInt();

        maximum(a,b,c);
        minimum(a,b,c);
    }

    // method to find the maximum
    static void maximum(int a, int b, int c){
        int max = a;

        if (b>max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("The maximum from the entered is: "+ max);
    }

    // method to find the minimum
    static void minimum(int a, int b, int c){
        int min = a;

        if (b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        System.out.println("The minimum from the entered is: "+ min);
    }
}
