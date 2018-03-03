import java.util.Random;

// class
public class Dice {
    
    // definition of variables 
    private Random random = new Random();
    private int numberOfSides;
    
    // constructor
    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
    }

    // method
    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return this.random.nextInt(this.numberOfSides) + 1;
    }
}
