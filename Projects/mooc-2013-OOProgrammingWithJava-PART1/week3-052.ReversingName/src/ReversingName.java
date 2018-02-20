import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // definition of variables
        int i = 0;
        
        // ask user input
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        
        // loop
        while (i < name.length()) {
            System.out.print(name.charAt(name.length()- i -1));
            i++;
        }
        
        //print out for aesthetics
        System.out.println("");
    }
}
