import java.util.Scanner;

public class FirstCharacter {

    // main program
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        // parse the method call into a varible
        char first = firstCharacter(name);
        
        // print out 
        System.out.println("First character: " + first);
    }
    
    // method 
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
