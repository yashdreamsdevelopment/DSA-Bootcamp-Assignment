package com.company;

import java.util.Scanner;

public class TsaOfCube {
    public static void main(String[] args) {
        //Question: Total Surface Area Of Cube

        // discussion: 6xAxA --> here, A = side of the cube.

        // solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube:");
        int a = sc.nextInt();

        int tsa = tsac(a);
        System.out.println("The Total Surface Area of the Cube is: " + tsa);
    }

    static int tsac(int a){
        return 6*a*a;
    }
}
