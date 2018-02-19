
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // Use carrot as password when running tests.
        String password = "carrot"; 

        // loop
        while (true) {
            System.out.println("Type the password: ");
            String pass = reader.nextLine();
            // check if pass is the stored one
            if (!(pass.equals(password))) {
                System.out.println("Wrong");
            } else if (pass.equals(password)) {
                System.out.println("Right!");
                break;
            }
        }
        System.out.println("\nThe secret is: jryy qbar!");
    }
}
