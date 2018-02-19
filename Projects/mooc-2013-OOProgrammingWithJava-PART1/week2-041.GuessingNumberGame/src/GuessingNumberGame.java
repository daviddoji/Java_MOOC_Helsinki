
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // parse the method call into a varible
        int numberDrawn = drawNumber();

        // ask user input
        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        
        // definition of variables
        int guesses = 0;
        
        // loop
        while (guess != numberDrawn){
            // check variable
            if (guess < numberDrawn) {
                guesses++;
                System.out.println("The number is greater, guesses made: " 
                        + guesses);
                System.out.println("Guess a number: ");
                // parse typed number as new guess
                guess = Integer.parseInt(reader.nextLine());
            } else if (guess > numberDrawn) {
                guesses++;
                System.out.println("The number is lesser, guesses made: " 
                        + guesses);
                System.out.println("Guess a number: ");
                // parse typed number as new guess
                guess = Integer.parseInt(reader.nextLine());
            } else {
                break;
            }
        }
        // print out
        System.out.println("Congratulations, your guess is correct!");
    }

    // method
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
