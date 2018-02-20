
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type the first word: ");
        String word = reader.nextLine();
        System.out.print("Type the second word: ");
        String subword = reader.nextLine();
        
        // definition of variables
        int index = word.indexOf(subword);
        
        // check if subword is in word
        if (index != -1) {
            System.out.println("The word '" + subword 
                    + "' is found in the word '" + word + "'.");
        } else {
            System.out.println("The word '" + subword 
                    + "' is not found in the word '" + word + "'.");
        }
    }
}
