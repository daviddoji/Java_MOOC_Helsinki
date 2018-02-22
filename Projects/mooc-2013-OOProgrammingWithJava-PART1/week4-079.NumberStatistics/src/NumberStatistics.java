// class
public class NumberStatistics {
    
    // definition of variables
    private int amountOfNumbers;
    private int sum;

    // constructor
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    // method
    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum = sum + number;
    }

    // method
    public int amountOfNumbers() {
        return amountOfNumbers;
    }
    
    // method
    public int sum() {
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }

    // method
    public double average() {
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return this.sum / (double) amountOfNumbers;
        }
    }
}
