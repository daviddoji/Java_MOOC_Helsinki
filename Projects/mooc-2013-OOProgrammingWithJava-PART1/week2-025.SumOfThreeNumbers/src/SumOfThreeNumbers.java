
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int sum = 0;
        int read; // store numbers read from user in this variable

        // ask for the user input
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        
        // compute sum
        sum = sum + read;

        // print out the result
        System.out.println("Sum: " + sum);
    }
}
