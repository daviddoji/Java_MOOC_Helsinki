
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // ask user input and store it in variable
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        // Check age
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
