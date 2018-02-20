
public class Greatest {

    // method
    public static int greatest(int number1, int number2, int number3) {
        // library call
        return Math.max(Math.max(number1, number2), number3);
    }

    // main program
    public static void main(String[] args) {
        // parse the method call into a varible
        int result = greatest(2, 7, 3);
        
        // print out 
        System.out.println("Greatest: " + result);
    }
}
