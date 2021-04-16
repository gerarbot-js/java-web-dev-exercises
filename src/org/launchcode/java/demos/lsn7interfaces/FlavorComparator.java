package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    // Compares flavors based on name
//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

    // Compares flavors based on allergen count
    @Override
    public int compare(Flavor o1, Flavor o2) {
        if (o1.getAllergens().size() - o2.getAllergens().size() < 0) { return 1; }
        if (o1.getAllergens().size() - o2.getAllergens().size() > 0 ) { return -1; }
        return 0;
    }

}
