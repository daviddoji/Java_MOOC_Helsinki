import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int result = 0;
        int count = 0;
        double average = 0;
        int odds = 0;
        int evens = 0;
        int number;
        
        // ask user input
        System.out.println("Type numbers: ");
        
        // loop
        while (true) {
            // parse typed number
            number = Integer.parseInt(reader.nextLine());  
            // to quit program
            if (number == -1) {
                break;
            }
            
            // check parity of number and increase variables
            if (number%2 == 0) {
                evens++;
            } else {
                odds++;
            }
            
            // add numbers to variable
            result += number;
            // increase variable by 1
            count++;
        }
        // print out results
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (1.0*result)/count);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
