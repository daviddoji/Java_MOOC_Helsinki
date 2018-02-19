
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        // Accounts creation
        Account mattsAccount = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account",0.00);
        
        // withdraw money from Matt's account
        mattsAccount.withdrawal(100.0);
        
        // deposit money in my account
        myAccount.deposit(100.0);
        
        // print balances
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }

}
