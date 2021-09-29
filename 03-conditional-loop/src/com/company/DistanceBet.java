package com.company;

import java.util.Scanner;

public class DistanceBet {
    public static void main(String[] args) {
        // Question: Calculate Distance Between Two Point

        // Discussion: d = sqrt{(x_2 - x_1)^2 + (y_2-y_1)^2}

        // Solution:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the co-ordinates of the 1st point (x1, y1): ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        System.out.print("Enter the co-ordinate of the 2nd point (x2, y2): ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        float distance = distanceBetTwoPoint(x1, x2, y1, y2);
        System.out.println("The distance between "+x1+" "+y1+" and "+x2+" "+y2+" is: "+distance);
    }

    static float distanceBetTwoPoint(float x1, float x2, float y1, float y2){
        return (float) Math.sqrt((x2-x1)*(x2-x1) + (y2 - y1)*(y2 - y1));
    }
}
