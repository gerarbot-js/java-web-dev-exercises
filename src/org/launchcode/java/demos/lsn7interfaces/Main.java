package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        //Comparator comparator = new FlavorComparator();
        //flavors.sort(comparator);
        flavors.sort(new FlavorComparator()); // This combines the previous two lines of code into one

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        cones.sort(new ConeComparator());

        // TODO: Bonus Mission requires a comparator class to sort the 'toppings' array however I please.

        toppings.sort(new ToppingComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Sorted Flavors:\n" + flavors + "\n\nSorted Cones:\n" + cones);

        // TODO: Print the toppings in alphabetical order.
        System.out.println("\nSorted Toppings:\n" + toppings);
    }
}
