
import java.util.Scanner;

public class Accounts {

    // main program
    public static void main(String[] args) {        
        // creation of account using class
        Account newAccount = new Account("Example account", 100.00);
        
        // deposit in the account
        newAccount.deposit(20.0);
        
        // print the balance
        System.out.println(newAccount);
    }
}
