package org.launchcode.java.studios.countingcharacters;

public class Main {
    public static void main(String[] args) {

        CountingCharacters mainCountingCharacters = new CountingCharacters();
//      String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";

        String exampleText = mainCountingCharacters.getTextFromFile("example.txt");

//       Scanner input = new Scanner(System.in);
//       System.out.println("Please enter a string to count its characters:");
//       String userInput = input.nextLine();
//       input.close();

//       Enter "hiddenFigures", "userInput", or "exampleText":
         mainCountingCharacters.countCharacters(exampleText);

    }
}
