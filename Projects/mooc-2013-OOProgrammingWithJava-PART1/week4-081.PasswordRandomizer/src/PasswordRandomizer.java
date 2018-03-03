import java.util.Random;

public class PasswordRandomizer {
    // definition of variables
    private Random random = new Random();
    private int length;

    // constructor
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    // method
    public String createPassword() {
        // definition of variables
        String pass = "";
        int number = 25;
        int i = 0;
        
        // loop
        while (i < length) {
            // dummy variable
            int dummy = this.random.nextInt(number) + 1;
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(dummy);
            pass = pass + symbol;
            i++;
        }
        return pass;
    }
}
