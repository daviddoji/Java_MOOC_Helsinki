
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variable
        System.out.print("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        // Check for the greatest
        if (number1 > number2) {
            System.out.println("Greater number:  " + number1);
        } else if (number1 < number2) {
            System.out.println("Greater number:  " + number2);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
