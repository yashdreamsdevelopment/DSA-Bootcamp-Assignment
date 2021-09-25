package com.company;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Question: Input currency in rupees and output in USD.

        // Discussion: 1 Indian Rupee equals 0.014 USD.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("INR: ");
        float inr = sc.nextFloat();

        // converter
        float usd = USD(inr);

        System.out.println(inr +" INR in USD is "+ usd);
    }

    // method to convert currency (INR -> USD)
    static float USD(float inr){
        return 0.014f * inr;
    }
}
