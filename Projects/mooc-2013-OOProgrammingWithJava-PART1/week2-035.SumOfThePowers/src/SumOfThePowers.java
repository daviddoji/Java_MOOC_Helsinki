
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int base = 2;
        int result = 0;
        int i = 0;
        
        // ask user input
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        // loop
        while (i <= limit) {
            // make exponentiation
            result += (int)Math.pow(base, i);
            // increase varible by 1
            i++;
        }
        // print out result
        System.out.println("The result is " + result);
    }
}
