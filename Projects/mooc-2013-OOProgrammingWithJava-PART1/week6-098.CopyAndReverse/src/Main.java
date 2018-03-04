import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    // method
    public static int[] copy(int[] array) {
        // array creation
        int[] copied = new int[array.length];
        
        // copy the array
        // reverse the array
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        
        // clone the array
        //copied = array.clone();
        
        return copied;
    }
    
    // method
    public static int[] reverseCopy(int[] array) {
        // array creation
        int[] reversed = new int[array.length];
        
        // reverse the array
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        
        return reversed;
    }
}
