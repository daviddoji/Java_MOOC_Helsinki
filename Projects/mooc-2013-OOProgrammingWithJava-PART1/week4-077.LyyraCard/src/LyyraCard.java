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
public class LyyraCard {
    // definition of variables
    private double balance;

    // constructor
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    // method
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    // method
    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance = this.balance - 2.5;
        }
    }

    // method
    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance = this.balance - 4.0;
        }
    }
    
    // method
    public void loadMoney(double amount) {
        if (amount < 0) {
            this.balance = this.balance;
        } else {
            if ((this.balance + amount) <= 150.0) {
                this.balance = this.balance + amount;
            } else if ((this.balance + amount) > 150) {
                this.balance = 150.0;
            }
        }
    }
}
