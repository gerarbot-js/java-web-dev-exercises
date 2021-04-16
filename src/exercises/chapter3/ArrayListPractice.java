package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
         sumOfEvens();
         fiveLetterWords();
         arrayPracticeSearch();
    }

    public static void sumOfEvens() {
         ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(2);
            numbers.add(4);
            numbers.add(9);
            numbers.add(23);
            numbers.add(1);
            numbers.add(7);
            numbers.add(6);
            numbers.add(29);
            numbers.add(31);
            numbers.add(8);

            int sum = 0;

                for (int number : numbers) {
                    if (number % 2 == 0) {
                        sum += number;
                    }
                }

                System.out.println(sum);
    }

    public static void fiveLetterWords() {
        ArrayList<String> words = new ArrayList<>();
            words.add("Hello");
            words.add("World");
            words.add("Floor");
            words.add("Honk");
            words.add("Difficult");
            words.add("Easy");
            words.add("Films");
            words.add("Court");
            words.add("Weird");
            words.add("Clandestine");

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the length of word you would like to search:");
            int searchLength = input.nextInt();

            for (String word : words) {
                if (word.length() == searchLength) {
                    System.out.println(word);
                }
            }
    }

    public static void arrayPracticeSearch() {
        String passage = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] passageArray = passage.split(" ");
        ArrayList<String> passageArrayList = new ArrayList<String>(Arrays.asList(passageArray));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of characters you would like to search for: ");
        int number = input.nextInt();

        for (String word : passageArrayList) {
            if (word.length() == number) {
                System.out.println(word);
            }
        }
        input.close();
    }
}

