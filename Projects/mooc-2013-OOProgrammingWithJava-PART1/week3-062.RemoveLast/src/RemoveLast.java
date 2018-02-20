import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    
    // method
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.remove(list.size() - 1));
    }

    // main program
    public static void main(String[] args) {
        // array creation
        ArrayList<String> persons = new ArrayList<String>();
        
        // add persons to array
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        // print out
        System.out.println("Persons:");
        System.out.println(persons);

        // sort the persons
        Collections.sort(persons);

        // remove the last
        removeLast(persons);

        // print out again
        System.out.println(persons);
    }
}
