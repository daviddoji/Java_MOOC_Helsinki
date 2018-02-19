
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 0;
        int i = 0;
        
        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());

        while (i <= limit) {
            result += i;  // number++ means the same as number = number + 1
            i++;
        }
        System.out.println("Sum is " + result);
    }
}
