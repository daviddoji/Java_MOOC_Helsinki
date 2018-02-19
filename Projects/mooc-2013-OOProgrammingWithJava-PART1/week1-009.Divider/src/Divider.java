
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variables
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        // compute sum
        double division = (double)number1 / number2;
        
        // print out result
        System.out.println("\nDivision: " + number1 + " / " + number2 + " = " 
                + division);
    }
}
