
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        // creation of account
        Account newAccount = new Account("Example account", 100.00);
        
        // deposit in the account
        newAccount.deposit(20.0);
        
        // print the balance
        System.out.println(newAccount);
        
    }

}
