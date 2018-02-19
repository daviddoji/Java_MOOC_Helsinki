
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first word: ");
        String firstword = reader.nextLine();
        
        System.out.print("Type the second word: ");
        String secondword = reader.nextLine();
        
        int index = firstword.indexOf(secondword);
        
        if (index != -1) {
            System.out.println("The word '" + secondword + "' is found in the word '" + firstword + "'.");
        } else {
            System.out.println("The word '" + secondword + "' is not found in the word '" + firstword + "'.");
        }
    }
}
