import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int result = 0;
        int count = 0;
        double average = 0;
        int odds = 0;
        int evens = 0;
        
        System.out.println("Type numbers: ");
        int number;// = Integer.parseInt(reader.nextLine());
        while (true) {
            number = Integer.parseInt(reader.nextLine());            
            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            
            result += number;
            count++;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (1.0*result)/count);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);

    }
}
