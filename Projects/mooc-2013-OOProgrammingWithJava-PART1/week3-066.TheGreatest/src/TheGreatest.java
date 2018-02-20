import java.util.ArrayList;

public class TheGreatest {
    
    // method
    public static int greatest(ArrayList<Integer> list) {
        // definition of variables and initialization
        int largest = list.get(0);
        
        // loop
        for(int i : list){
            // check if varible is greater than variable
            if(i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    // main program 
    public static void main(String[] args) {
        // creation of array
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add elements to array
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        // print out with method call
        System.out.println("The greatest number is: " + greatest(list));
    }
}
