/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (this.value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
        // write here code that returns the value
        return this.value;
    }
    
    public void setValue(int newValue) {
        // write here code that returns the value
        if (newValue >= 0 && newValue<=this.upperLimit) {
            this.value = newValue;
        }
    }
}
