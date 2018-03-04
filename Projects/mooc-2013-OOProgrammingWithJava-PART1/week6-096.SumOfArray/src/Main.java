
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    // method
    public static int sum(int[] array) {
        // definition and initialization of variables
        int sum = 0;
        
        // loop through the array
        for (int number : array) {
            sum += number;
        }
        
        return sum;
    }
}
