import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int result = 1; // limited by integer type
        int i = 1;
        
        // ask user input
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());

        // loop
        while (i <= limit) {
            // multiply variables
            result *= i;
            // increase variable by 1
            i++;
        }
        // print out result
        System.out.println("Factorial is " + result);
    }
}
