
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());
        
        // extract substring
        String result = word.substring(0, length);
        
        // print out
        System.out.println("Result: " + result);
    }
}
