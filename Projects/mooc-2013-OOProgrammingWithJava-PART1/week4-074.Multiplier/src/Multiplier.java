/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Multiplier {
    private int ownNumber;
    
    // constructor
    public Multiplier(int number) {
        this.ownNumber = number;
    }
    
    // method for multiply
    public int multiply(int otherNumber) {
        return otherNumber*this.ownNumber;
    }
    
}
