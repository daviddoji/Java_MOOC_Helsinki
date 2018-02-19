
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // ask user input and store it in variable
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        // Check if year is leap
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
