
import java.util.Scanner;

public class LengthOfName {
    
    // main program
    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        // parse the method call into a varible
        int length = calculateCharacters(name);
        
        // print out 
        System.out.println("Number of characters: " + length);
    }
    
    // method
    public static int calculateCharacters(String text) {
        return text.length();
    }
}
