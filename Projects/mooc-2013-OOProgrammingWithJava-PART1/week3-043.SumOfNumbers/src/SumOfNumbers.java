public class SumOfNumbers {

    // method
    public static int sum(int number1, int number2, int number3, int number4) {
        // write your code here
        return number1 + number2 + number3 + number4;
    }

    // main program
    public static void main(String[] args) {
        // parse the method call into a varible
        int answer = sum(4, 3, 6, 1);
        
        //print out 
        System.out.println("Sum: " + answer);
    }
}
