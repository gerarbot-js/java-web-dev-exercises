package exercises.chapter2;

import java.util.Locale;
import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and " +
                "of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String term = input.nextLine();
        String termLowerCase = term.toLowerCase();
        input.close();

        int index = alice.toLowerCase().indexOf(termLowerCase);
        int length = term.length();

        System.out.println("The word appears at index " + index + " and has a length of " + length);

        alice = alice.replace(term, "");

        System.out.println("The passage with " + term + " removed: " + alice);

    }
}