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
public class Counter {
    
    // definition of variables
    private int value;
    private boolean check;

    // constructor
    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }

    // constructor overloading
    public Counter(int value) {
        this(value, false);
    }

    // constructor overloading
    public Counter(boolean tarkista) {
        this(0, tarkista);
    }

    // constructor overloading
    public Counter() {
        this(0, false);
    }

    // method
    public int value() {
        return this.value;
    }

    // method
    public void increase() {
        increase(1);
    }

    // method
    public void decrease() {
        decrease(1);
    }

    // method
    public void increase(int by) {
        if (by >= 0) {
            this.value += by;
        }
    }

    // method
    public void decrease(int by) {
        if (by < 0) {
            return;
        }
        this.value -= by;

        if (this.check && this.value <0) {
            this.value = 0;
        }                
    }
}
