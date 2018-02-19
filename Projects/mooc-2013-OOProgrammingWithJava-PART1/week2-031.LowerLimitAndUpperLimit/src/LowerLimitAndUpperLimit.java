
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

         // ask user input
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        // loop
        while (first <= last) {
            // print out variable
            System.out.println(first);
            // increase variable by 1
            first++;
        }
    }
}
