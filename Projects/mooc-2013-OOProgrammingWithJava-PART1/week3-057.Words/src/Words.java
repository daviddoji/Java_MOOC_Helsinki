import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // array creation
        ArrayList<String> words = new ArrayList<String>();
 
        // loop
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            // if typed word is empty break
            if (word.equals("")) {
                break;
            }
            // add typed word to the array
            words.add(word);
        }
        
        // print out
        System.out.println("You typed the following words:");
        
        // loop through the array
        for (String word : words) {
            System.out.println("word");
        }
    }
}
