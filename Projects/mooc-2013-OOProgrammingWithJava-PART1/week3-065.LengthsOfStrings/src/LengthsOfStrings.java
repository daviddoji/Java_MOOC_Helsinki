import java.util.ArrayList;

public class LengthsOfStrings {
    
    // method
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        // creation of array
        ArrayList<Integer> lengthList = new ArrayList<Integer>();

        // loop 
        for (String element : list) {
            lengthList.add(element.length());
        }
        return lengthList;
    }

    // main program
    public static void main(String[] args) {
        // creation of array
        ArrayList<String> list = new ArrayList<String>();
        
        // add elements to array
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        
        // parse method call to array
        ArrayList<Integer> lengths = lengths(list);
        
        // print out
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
