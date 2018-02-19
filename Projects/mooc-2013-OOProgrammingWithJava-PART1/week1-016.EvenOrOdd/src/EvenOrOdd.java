
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variable
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        // Check if input is even or odd
        if (num%2 == 0) {
            System.out.println("Number " + num + " is even.");
        } else {
            System.out.println("Number " + num + " is odd.");
        }

    }
}
