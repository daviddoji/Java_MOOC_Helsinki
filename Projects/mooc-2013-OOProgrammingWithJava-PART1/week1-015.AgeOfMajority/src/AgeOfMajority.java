
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variable
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        // Check age majority
        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority!");
        }
    }
}
