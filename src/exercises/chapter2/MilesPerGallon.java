package exercises.chapter2;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much gas have you consumed (in gallons)?");
        double gas = input.nextDouble();
        input.close();

        double mpg = miles / gas;

        System.out.println("Your fuel efficiency is " + mpg + " miles per gallon.");

    }
}
