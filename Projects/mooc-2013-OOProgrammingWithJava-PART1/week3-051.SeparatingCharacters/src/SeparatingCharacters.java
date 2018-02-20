
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int i = 0;
        
        // ask user input
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        // loop
        while (i < name.length()) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i++;
        }
    }
}
