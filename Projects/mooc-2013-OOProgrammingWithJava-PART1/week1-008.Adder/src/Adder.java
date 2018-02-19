
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variables
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        // compute sum
        int sum = number1 + number2;
        
        // print out result
        System.out.println("\nSum of the numbers: " + sum);
    }
}
