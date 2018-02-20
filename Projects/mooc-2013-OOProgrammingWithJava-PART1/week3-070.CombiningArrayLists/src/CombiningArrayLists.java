
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {
    
    // method
    public static void combine(ArrayList<Integer> first, 
            ArrayList<Integer> second) {
        // concatenate elements
        first.addAll(second);
    }

    // main program
    public static void main(String[] args) {
        // creation of arrays
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // library using method
        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 7);

        // method call
        combine(list1, list2);
        
        // print out
        System.out.println(list1);
        System.out.println(list2);
    }
}
