import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.print("Length of the end part: ");
        int sub = Integer.parseInt(reader.nextLine());
        System.out.print("Result: ");
        
        int length = word.length();
        
        int subword = length - sub;
        String firstpart = word.substring(subword);
        
        int index = word.indexOf(firstpart);
        System.out.println(word.substring(index));
        
        //int lengthOfEnd = Integer.parseInt(reader.nextLine());
        //int startingPosition = word.length() - lengthOfEnd;
        //System.out.print("Result: " + word.substring(startingPosition, word.length()));
        
    }
}
