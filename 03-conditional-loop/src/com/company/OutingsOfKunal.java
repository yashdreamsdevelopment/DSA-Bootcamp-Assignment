package com.company;

import java.util.Scanner;

public class OutingsOfKunal {
    public static void main(String[] args) {
        // Question: Kunal is allowed to go out with his friends only on the even days of a given month.
        //           Write a program to count the number of days he can go out in the month of August.

        // Discussion: we will assume ideal situation not a leap year.

        // Note: for just August month or any other month the days are 30-31 so directly the answer is: (31/2) = 15 days

        // Solution: (more ellobrative)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        System.out.println("jan(1) feb(2) march(3) and so on.. ");
        int month = sc.nextInt();
        int days;

        if (month>0 && month <= 12){
            if(month % 2 == 0){
                days = 30;
            }else{
                days = 31;
            }
            int outings = evenDays(days);
            System.out.println("Kunal can go for: "+ outings +" days for this month.");
        }else {
            System.out.println("Wrong month, try again...");
        }
    }

    // method to find even days.
    static int evenDays(int days){
        int count = 0;
        while(days != 0){
            // for even days
            if (days%2 == 0){
                count++;
            }
            days--;
        }
        return count;
    }
}
