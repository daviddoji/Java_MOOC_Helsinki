import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 1;
        int i = 1;
        
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());

        while (i <= limit) {
            result *= i;  // number++ means the same as number = number + 1
            i++;
        }
        System.out.println("Factorial is " + result);

    }
}
