
public class AverageOfGivenNumbers {
    
    // method
    public static int sum(int number1, int number2, int number3, int number4) {
        // return sum of passed variables
        return (number1 + number2 + number3 + number4);
    }

    // method
    public static double average(int number1, int number2, int number3,
            int number4) {
        
        // parse the method call into a varible
        int sumNumbers = sum (number1, number2, number3, number4);
        
        // return result
        return (1.0*sumNumbers) / 4;
    }

    // main program
    public static void main(String[] args) {
        // parse the method call into a varible
        double result = average(4, 3, 6, 1);
        
        // print out
        System.out.println("Average: " + result);
    }
}
