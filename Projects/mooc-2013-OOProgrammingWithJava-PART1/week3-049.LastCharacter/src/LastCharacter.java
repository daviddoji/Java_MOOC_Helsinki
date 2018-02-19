import java.util.Scanner;


public class LastCharacter {

    // main program
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        // parse the method call into a varible
        char last = lastCharacter(name);
        
        // print out 
        System.out.println("Last character: " + last);
    }
    
    // method
    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }
}
