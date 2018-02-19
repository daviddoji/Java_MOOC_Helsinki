
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // define variable
        double circunf;

        // ask user input and store it in variable
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        // compute calculation
        circunf = 2 * (double)radius * Math.PI;
        
        // print out result
        System.out.println("\nCircumference of the circle: " + circunf);
    }
}
