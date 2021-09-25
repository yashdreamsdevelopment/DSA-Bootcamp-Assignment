package com.company;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        // Question: Take name as input and print a greeting message for that name.

        // Discussion: we will take a name as an input from the user and pass it to the greet function.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next();

        // passing the name to the greet method
        greet(name);
    }

    // greet method taking name as an argument
    static void greet(String name){
        System.out.println("Hello, "+name);
        System.out.println("Happy Coding");
    }
}
