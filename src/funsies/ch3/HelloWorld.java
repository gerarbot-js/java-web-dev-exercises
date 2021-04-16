package funsies.ch3;

import funsies.ch4.HelloDieHard;
import org.launchcode.java.demos.lsn1datatypes.Message;

public class HelloWorld {
    public static void main (String[] args) {
        String message = "Hello, World, you little fucker.";
        System.out.println(message);
        System.out.println("Cut to commercial! Cut to commercial! \n Later, on the rerun...");
        String editedMessage = message.replace("fucker", "PLACE THAT I LOVE");

        System.out.println(editedMessage);
    }
}
