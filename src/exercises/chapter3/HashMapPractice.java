package exercises.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args){
        studentIds();
        studentRoster();

    }

    public static void studentIds() {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;
        String newStudentName;

        System.out.println("Enter student ID number(s) (or enter -1 to finish):");

        // Get student IDs and names
        do {
            System.out.println("Student ID:");
            newStudentId = input.nextInt();

            // Read in the newLine before looping back
            input.nextLine();

            if (!newStudentId.equals(-1)) {
                System.out.println("Student Name:");
                newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);
            }

        } while(!newStudentId.equals(-1));

        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }

    public static void studentRoster() {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;
        String newStudentName;


        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student Name: ");
            newStudentName = input.nextLine();

            if (!newStudentName.equals("")) {
                System.out.print("Student ID: ");
                newStudentId = input.nextInt();
                students.put(newStudentId, newStudentName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }

}

