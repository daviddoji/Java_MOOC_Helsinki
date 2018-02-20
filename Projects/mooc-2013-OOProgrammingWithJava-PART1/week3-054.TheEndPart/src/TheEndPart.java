import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int sub = Integer.parseInt(reader.nextLine());
        
        // print out
        System.out.print("Result: ");
        
        // definition of variables
        int length = word.length();
        int subword = length - sub;
        String firstpart = word.substring(subword);
        int index = word.indexOf(firstpart);
        
        // print out
        System.out.println(word.substring(index));
    }
}
