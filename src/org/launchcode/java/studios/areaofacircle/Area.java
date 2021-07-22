package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius?");
        double radius = input.nextDouble();
        if (radius < 0) {
            System.out.println("invalid entry");
        } else {
            double area = Circle.getArea(radius);

            System.out.println("The area of a circle with radius " + radius + " is " + area);

        }
    }
}



