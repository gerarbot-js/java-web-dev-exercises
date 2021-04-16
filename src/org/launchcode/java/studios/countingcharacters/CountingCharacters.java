package org.launchcode.java.studios.countingcharacters;

//import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {

//  make a constructor for this class:
    public CountingCharacters() {

    }
//  make a method to count the characters in a given string and print the result:
    public static void countCharacters(String message) {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        message = message.toLowerCase();

        char[] characterArray = message.toCharArray();

        for (char character : characterArray) {
            if (Character.isLetter(character) == false) {
                continue;
            }

            if (!characterCount.containsKey(character)) {
                if (Character.isLetter(character)) {
                    characterCount.put(character, 1);
                }
            } else if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character) + 1);
            }
        }

            for (Map.Entry<Character, Integer> key : characterCount.entrySet()) {
                System.out.println(key.getKey() + ": " + key.getValue());
            }
        }

//  make a method to read text from a file
    public String getTextFromFile(String pathToFile) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(pathToFile)));

        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return content;
        }

}
