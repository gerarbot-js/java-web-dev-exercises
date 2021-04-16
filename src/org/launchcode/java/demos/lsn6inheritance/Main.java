package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
//        HouseCat garfield = new HouseCat("Garfield", 12);
//        System.out.println(garfield.isTired());
//        garfield.eat();
//        System.out.println(garfield.isTired());
//
//        HouseCat spike = new HouseCat("Spike");
//        System.out.println(spike.getWeight());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());

        System.out.println(((HouseCat) suki).isSatisfied());

        // Cat salem = new Cat(8); will not work while the Cat class is an abstract class

    }
}
