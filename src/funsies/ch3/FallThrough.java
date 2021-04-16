package funsies.ch3;

import java.util.Scanner;

public class FallThrough {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10... What is it?");
        int number = input.nextInt();
        String result;
        switch (number) {
            case 1:
                result = "Nope";
                break;
            case 2:
                result = "Sorry";
                break;
            case 3:
                result = "Not three";
                break;
            case 4:
                result = "Haha, wrong!";
                break;
            case 5:
                result = "Try again";
                break;
            case 6:
                result = "Yes! Just kidding. No.";
                break;
            case 7:
                result = "Close";
                break;
            case 8:
                result = "Yes!!! I hit eight deer on my way over today.";
                break;
            case 9:
                result = "Wrong";
                break;
            case 10:
                result = "No";
                break;
            default:
                result = "Whaaaat?";
        }

        System.out.println(result);
    }

}
