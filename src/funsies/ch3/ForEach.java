package funsies.ch3;



public class ForEach {
    public static void main(String[] args){
        String message = "I love being a String! It's sooo much better " +
                "than being an array of characters! Wait... What are you doing? " +
                "Noooooooo!!!";

        for(char c : message.toCharArray()){
            System.out.println(c);
        }
    }
}
