import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // object creation using class
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        
        // array creation
        ArrayList<Integer> numbers = lotteryNumbers.numbers();
        
        // print out
        System.out.println("Lottery numbers:");
        
        // sort ArrayList
        Collections.sort(numbers);
        
        // loop
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        // for aesthetics
        System.out.println("");
    }
}
