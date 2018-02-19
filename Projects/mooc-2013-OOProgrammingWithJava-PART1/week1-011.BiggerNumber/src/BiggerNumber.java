
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        // ask user input and store it in variable
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        // compute calculation
        int max = Math.max(number2, number1);
        
        // print out result
        System.out.println("\nThe bigger number of the two numbers given was: " 
                + max);
    }
}
