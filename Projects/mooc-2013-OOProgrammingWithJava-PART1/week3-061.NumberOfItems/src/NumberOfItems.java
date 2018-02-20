import java.util.ArrayList;

public class NumberOfItems {

    // method
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    // main program
    public static void main(String[] args) {
        // array creation
        ArrayList<String> list = new ArrayList<String>();
        
        // add words to array
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        
        // print out
        System.out.println("There are this many items on the list:");
        
        // print out with method call
        System.out.println(countItems(list)); 
    }
}
