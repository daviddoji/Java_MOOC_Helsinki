import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String help = "";
        int i = 0;
        while (i < text.length()) {
            //System.out.print(text.charAt(text.length()- i -1));
            help = help + text.charAt(text.length()- i -1);
            i++;
        }
        return help;
    }

    public static boolean palindrome(String text) {
        // write code here
        if (text.equals(reverse(text))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
