
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum = sum + number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum() {
        // code here
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }

    public double average() {
        // code here
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return this.sum / (double) amountOfNumbers;
        }
    }
}
