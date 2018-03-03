import java.util.ArrayList;
import java.util.Random;

// class
public class LotteryNumbers {
    
    // definition of variable
    private ArrayList<Integer> numbers;

    // constructor
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created using method
        this.drawNumbers();
    }

    // method
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    // method
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        
        // definition of variables
        int i = 1;
        
        // loop
        while (i <= 7) {
            int drawnNumber = random.nextInt(39) + 1;
            // check if number is on the list
            if (!this.containsNumber(drawnNumber)) {
                this.numbers.add(drawnNumber);
            } else {
                i--;
            }
            i++;
        }
    }

    // method
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
