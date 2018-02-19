
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number = 1;
        
        System.out.println("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());

        while (number <= limit) {
            System.out.println(number);
            number++;  // number++ means the same as number = number + 1
        }
        
    }
}
