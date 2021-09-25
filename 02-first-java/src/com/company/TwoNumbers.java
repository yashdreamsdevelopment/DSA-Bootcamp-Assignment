package com.company;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        // Question: Take in two numbers and an operator (+, -, *, /) and calculate the value.
        //           (Use if conditions)

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1:");
        int num1 = sc.nextInt();
        System.out.println("enter num 2:");
        int num2 = sc.nextInt();
        System.out.println("enter the operator:");
        char op = sc.next().trim().charAt(0);

        // function resolve to actually resolve the equation
        int ans = resolve(num1, num2, op);
        System.out.println("The answer is: "+ ans);
    }

    static int resolve(int num1, int num2, char op){
        return switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> Integer.MIN_VALUE;
        };
    }
}
