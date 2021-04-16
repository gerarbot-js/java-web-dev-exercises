package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius: ");

        try {
            double radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Error: please enter a positive number.");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);

        } catch(Exception error) {
            System.out.println("You must provide a numeric input.");
        }

        input.close();
    }
}