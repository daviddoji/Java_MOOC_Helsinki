
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 0;
        
        System.out.println("First: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());

        while (lowerLimit <= upperLimit) {
            result += lowerLimit;  // number++ means the same as number = number + 1
            lowerLimit++;
        }
        System.out.println("The sum " + result);
        
    }
}
