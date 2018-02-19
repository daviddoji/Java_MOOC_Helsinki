import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        Boolean status = true;
        
        while (status) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (!word.equals("")) {
                words.add(word);
            } else if (word.equals("")){
                words.remove(word);
                status = false;
            }  
        }
        System.out.println("You typed the following words:");
        int place = 0;
        while(place < words.size()) {
            System.out.println(words.get(place));
            place++;
        }
    }
    
}
