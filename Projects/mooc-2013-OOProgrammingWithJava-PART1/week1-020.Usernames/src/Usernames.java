
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);
        
        // ask user input and store it in variable
        System.out.print("Typer your username: ");
        String username = reader.nextLine();
        System.out.print("Typer your password: ");
        String password = reader.nextLine();
        
        // Check validity of user and password
        if (username.equals("alex") && password.equals("mightyducks") || 
           (username.equals("emily") && password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
