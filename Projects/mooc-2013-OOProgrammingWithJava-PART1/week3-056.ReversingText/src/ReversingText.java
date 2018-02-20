
import java.util.Scanner;

public class ReversingText {

    // method
    public static String reverse(String text) {
        // definition of variables
        String reversed = "";
        int i = 0;
        
        // loop
        while (i < text.length()) {
            // go through the word in reverse order
            reversed = reversed + text.charAt(text.length()- i -1);
            // increase variable by 1
            i++;
        }
        return reversed;
    }

    // main program
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        
        // print out
        System.out.println("In reverse order: " + reverse(text));
    }
}
