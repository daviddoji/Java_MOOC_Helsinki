
public class Accounts {

    // main program
    public static void main(String[] args) {        
        // Accounts creation using class
        Account A = new Account("A",100.00);
        Account B = new Account("B",0.00);
        Account C = new Account("C",0.00);
        
        // transfer money between accounts using method calls
        transfer(A, B, 50.0);
        transfer(B, C, 25.0);
    }
    
    // method
    public static void transfer(Account from, Account to, double howMuch) {
        // withdraw money from "from" account
        from.withdrawal(howMuch);
        
        // deposit money in "to" account
        to.deposit(howMuch);
    }
}
