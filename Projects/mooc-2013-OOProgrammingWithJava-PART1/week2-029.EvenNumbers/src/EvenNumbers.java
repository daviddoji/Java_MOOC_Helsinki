
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int number = 1;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;  // number++ means the same as number = number + 1
        }
    }
}
