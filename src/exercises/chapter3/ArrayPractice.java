package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printNumbers();
        arrayPractice.splitString();
    }

    public void printNumbers() {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        System.out.println("All numbers in the array: ");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("All odd numbers in the array: ");
        for (int number : numbers) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }

    public void splitString() {
        String passage = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] passageArray = passage.split(" ");
        System.out.println(Arrays.toString(passageArray));

        passageArray = passage.split("\\.");
        System.out.println(Arrays.toString(passageArray));
    }
}