/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */

// class
public class BoundedCounter {
    
    // definition of variables
    private int value;
    private int upperLimit;

    // constructor
    public BoundedCounter(int upperLimit) {
        this.value = upperLimit;
        this.upperLimit = 59;
    }

    // method
    public void next() {
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    // method
    public String toString() {
        if (this.value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    // method
    public int getValue() {
        return this.value;
    }
    
    // method
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue<=this.upperLimit) {
            this.value = newValue;
        }
    }
}
