package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student gerardo = new Student("Gerardo", 82518, 1,4);
//        gerardo.setName("Gerardo");
//        gerardo.setNumberOfCredits(1);
//        gerardo.setGpa(5.0);
        System.out.println(gerardo.getName());
        System.out.println(gerardo.getNumberOfCredits());
        System.out.println(gerardo.getGpa());
    }
}
