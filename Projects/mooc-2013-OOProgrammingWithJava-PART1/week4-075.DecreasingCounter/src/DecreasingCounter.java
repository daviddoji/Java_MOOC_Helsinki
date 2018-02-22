// class
public class DecreasingCounter {
    // definition of variables
    private int value; 
    private int initialValue;

    // constructor
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    // method
    public void printValue() {
        System.out.println("value: " + this.value);
    }

    // method
    public void decrease() {
        // to decrease counter value by one
        if (this.value == 0) {
            this.value = 0;
        } else {
            this.value--;
        }
    }

    // method
    public void reset() {
        this.value = 0;
    }
    
    // method
    public void setInitial() {
        this.value = initialValue;
    }
}
