
public class Least {

    // method
    public static int least(int number1, int number2) {
        // library call
        return Math.min(number1, number2);
    }

    // main program
    public static void main(String[] args) {
        // parse the method call into a varible
        int result = least(2, 7);
        
        // print out
        System.out.println("Least: " + result);
    }
}
