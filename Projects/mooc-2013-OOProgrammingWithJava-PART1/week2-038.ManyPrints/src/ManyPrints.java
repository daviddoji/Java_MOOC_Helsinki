
import java.util.Scanner;

public class ManyPrints {
    // method
    public static void printText() {
        // print out
        System.out.println("In the beginning there were the swamp, the hoe"
                + " and Java.");
    }

    // main program
    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // ask user input
        System.out.println("How many? ");
        int times = Integer.parseInt(reader.nextLine());
        
        // definition of variables
        int i = 1;
        
        // loop
        while (i <= times) {
            // method call
            printText();
            // increase variable by 1
            i++;
        }
    }
}
