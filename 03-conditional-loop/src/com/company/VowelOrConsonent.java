package com.company;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        // Question: Java Program Vowel Or Consonant.

        // Discussion: if the entered char is among the (a,e,i,o,u) or else consonant.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char letter = sc.next().toLowerCase().trim().charAt(0);

        if (letter == 'a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
            System.out.println("Its a Vowel");
        }else{
            System.out.println("Its a Consonant");
        }
    }
}
