
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int number = 1;
        
        // ask user input
        System.out.println("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());

        // loop
        while (number <= limit) {
            // print out variable
            System.out.println(number);
            // increase variable by 1
            number++;
        }
    }
}
