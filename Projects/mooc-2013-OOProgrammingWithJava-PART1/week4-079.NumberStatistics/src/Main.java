import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);

        // objects creation using class
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        // print out
        System.out.println("Type numbers: ");
        
        // infinite loop
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            // for breaking infinite loop
            if (number == -1) {
                break;
            }
            all.addNumber(number);
            
            if (number%2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
        // print out
        System.out.println("sum: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
