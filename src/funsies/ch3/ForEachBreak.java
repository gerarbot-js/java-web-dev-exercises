package funsies.ch3;

public class ForEachBreak {
    public static void main(String[] args){
        int[] intArray = {1, 3, 5, 9, 16, 23, 03, 23, 16};
        int searchNumber = 16;
        System.out.println("My gosh, how many drinks have you had?");

        for (int number : intArray) {
            System.out.println(number + "?");
            System.out.println("Higher.");
            if (number == 5) {
                System.out.println("No...");
                System.out.println("Higher!");
            } else if (number == 9) {
                System.out.println("...");
                System.out.println("HIGHER!");
            } else if (searchNumber == number) {
                System.out.println("Wait, no. I mean: Yeshh, 16!");
                break;
            }
        }
    }
}
