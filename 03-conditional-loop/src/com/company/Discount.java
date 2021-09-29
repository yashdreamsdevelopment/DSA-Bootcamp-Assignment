package com.company;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        // Question: Calculate Discount Of Product

        // Discussion: consider a situation where user provides,
        //             1. actual price of the product.
        //             2. discounted price of the product.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Actual Price: ");
        float actualPrice = sc.nextFloat();
        System.out.println("Enter the Discounted Price: ");
        float discountedPrice = sc.nextFloat();

        float discoutIs = discountCal(actualPrice, discountedPrice);
        System.out.println("You avial a discout of: " + discoutIs + "%");
    }

    static float discountCal(float actualPrice, float discountedPrice){
        return (discountedPrice/actualPrice) * 100f;
    }
}
