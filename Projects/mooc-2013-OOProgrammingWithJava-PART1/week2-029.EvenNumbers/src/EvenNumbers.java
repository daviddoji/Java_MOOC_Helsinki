
public class EvenNumbers {

    public static void main(String[] args) {
        // definition of variables
        int number = 1;

        // loop
        while (number < 101) {
            // check if number is even
            if (number%2 == 0) {
                // print out number
                System.out.println(number);
            }
            // increase variable by 1
            number++;
        }
    }
}
