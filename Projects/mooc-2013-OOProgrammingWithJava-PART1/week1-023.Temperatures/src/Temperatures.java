
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // loop
        while (true) {
            System.out.println("Give a temperature: ");
            double number = Double.parseDouble(reader.nextLine());
            // check if number is within certain limits
            if (number >= (1.0*-30) && number <= (1.0*40)) {
                Graph.addNumber(number);
            }
        }        
    }
}
