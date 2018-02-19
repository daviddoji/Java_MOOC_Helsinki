/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Counter {
    private int value;
    private boolean check;

    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }

    public Counter(int value) {
        this(value, false);
    }

    public Counter(boolean tarkista) {
        this(0, tarkista);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int by) {
        if (by >= 0) {
            this.value += by;
        }
    }

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
