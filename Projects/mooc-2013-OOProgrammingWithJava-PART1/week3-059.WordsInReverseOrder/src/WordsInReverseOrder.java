import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // array creation
        ArrayList<String> words = new ArrayList<String>();
        
        // loop
        while (true) {
            // ask user input
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            // check if typed word is on the array
            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            }
            // otherwise, add word to array
            words.add(word);
        }
        
        // library method to reverse an array
        Collections.reverse(words);
        
        // print out
        System.out.println("You typed the following words:");
        
        // loop through the array
        for (String word : words) {
            System.out.println("word");
        }
    }
}
