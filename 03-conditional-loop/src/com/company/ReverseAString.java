package com.company;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        // Question: Reverse A String In Java

        // Discussion: we will use logic of, convert a string to character array and then reverse it by indexed based logic

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String string = sc.next();

        char[] charArr = string.toCharArray();
        System.out.print("The reverse of it is: ");
        for (int i = charArr.length - 1; i >=0 ; i--) {
            System.out.print(charArr[i]);
        }
    }
}
