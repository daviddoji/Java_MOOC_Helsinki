/* 
 * Do not touch this!
 */

// class definition
public class Account {

    // definition of variables
    private double balance;
    private String owner;

    // constructor
    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    // method
    public void deposit(double amount) {
        balance += amount;
    }

    // method
    public void withdrawal(double amount) {
        balance -= amount;
    }

    // method
    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
