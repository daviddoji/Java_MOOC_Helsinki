
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition and initialization of variables
        int result = 0;
        int i = 0;
        
        // ask user input
        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());

        // loop
        while (i <= limit) {
            // sum variables
            result += i;
            // increase variable by 1
            i++;
        }
        //print out result
        System.out.println("Sum is " + result);
    }
}
