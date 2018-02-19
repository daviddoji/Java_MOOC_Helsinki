
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int base = 2;
        int result = 0;
        int i = 0;
        
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (i <= limit) {
            result += (int)Math.pow(base, i);
            i++;
        }

        System.out.println("The result is " + result);

    }
}
