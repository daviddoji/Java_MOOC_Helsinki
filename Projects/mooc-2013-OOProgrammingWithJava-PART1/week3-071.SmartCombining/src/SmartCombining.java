import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    
    // method
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        // loop through the second list
        for (int number : second) {
            // check if number is already in the first list
            if (!first.contains(number)) {
                // if not, add it
                first.add(number);
            }
        }
    }
    
    // main program
    public static void main(String[] args) {

        // creation of arrays
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // library using method call
        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // method call
        smartCombine(list1, list2);
        
        // print out
        System.out.println(list1);
        System.out.println(list2);
    }
    
    

}
