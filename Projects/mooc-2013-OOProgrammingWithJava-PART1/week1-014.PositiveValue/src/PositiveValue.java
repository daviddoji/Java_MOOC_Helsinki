
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variable
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        // Check if positive
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
