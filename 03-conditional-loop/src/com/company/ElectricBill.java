package com.company;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        // Question: Calculate Electricity Bill.

        // Discussion: we will use the ideal situation in this case as...
        //             1. take the units i.e. (KWh) usage from the user. (per month)
        //             2. the ideal rate per unit in my state is 3.44 (INR/unit) - neglecting the variation of units.
        //             3. and we will ideally generate the bill for the period of one month.

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units/month: (KWh)");
        int unit = sc.nextInt();
        float rate = 3.89f;

        float bill = unit * rate;
        System.out.println("The monthly bill is: " + bill);
    }
}
