import java.util.ArrayList;

public class SumOfNumbers {
    
    // method
    public static int sum(ArrayList<Integer> list) {
        // definition of variables
        int result = 0;
        
        // loop
        for (int element : list) {
            result += element;
        }
        return result;
    }

    // main program
    public static void main(String[] args) {
        // array creation
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add elements to array
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        // print out with method call
        System.out.println("The sum: " + sum(list));

        // add new element
        list.add(10);
        
        // print out again with method call
        System.out.println("The sum: " + sum(list));
    }
}
