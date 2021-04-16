package funsies.ch3;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("I bet I can count to 100 faster than you.");
        int noCount = 0;

        for (int i = 0; i <= 100; i++) {
            if (i > 0 && i < 3) {
                System.out.println(i);
            } else if (i == 3) {
                System.out.println("Skip a few");
            } else if (i > 3 && i <= 98) {
                noCount++;
            } else if (i > 98) {
                System.out.println(i);
            }
        }
        System.out.println("Hurrr, hurr, hurr!");
    }
}
