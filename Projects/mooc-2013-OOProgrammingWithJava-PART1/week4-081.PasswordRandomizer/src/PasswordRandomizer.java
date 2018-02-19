import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        int number = 25;
        
        int i = 0;
        while (i < length) {
            int dummy = this.random.nextInt(number) + 1;
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(dummy);
            pass = pass + symbol;
            i++;
        }

        return pass;
    }
}
