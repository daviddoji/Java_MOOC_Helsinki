import java.util.Scanner;

public class Palindrome {
    
    // method
    public static String reverse(String text) {
        // definition of variables
        String help = "";
        int i = 0;
        
        // loop
        while (i < text.length()) {
            // reverse the text
            help = help + text.charAt(text.length()- i -1);
            i++;
        }
        return help;
    }

    // method
    public static boolean palindrome(String text) {
        // check using method call
        if (text.equals(reverse(text))) {
            return true;
        }
        return false;
    }

    // main program
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type a text: ");
        String text = reader.nextLine();
        
        // check using method call
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
