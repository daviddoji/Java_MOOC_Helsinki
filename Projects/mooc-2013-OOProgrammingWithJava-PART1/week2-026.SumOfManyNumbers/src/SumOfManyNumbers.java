
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int sum = 0;
        
        // loop
        while (true) {
            // parse the number typed
            int number = Integer.parseInt(reader.nextLine());
            // until you type 0
            if (number == 0) {
                break;
            }
            // compute sum
            sum += number;
            // print out the result
            System.out.println("Sum now: " + sum);
        }
        // print out the result
        System.out.println("Sum in the end: " + sum);
    }
}
