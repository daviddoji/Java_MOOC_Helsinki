
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int result = 0;
        
        // ask user input
        System.out.println("First: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());

        // loop
        while (lowerLimit <= upperLimit) {
            // sum variables
            result += lowerLimit;
            // increase variable by 1
            lowerLimit++;
        }
        // print out result
        System.out.println("The sum " + result);
    }
}
