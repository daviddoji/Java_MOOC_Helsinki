
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // creation of array
        ArrayList<Student> students = new ArrayList<Student>();
        
        // loop
        while (true) {
            // ask user name and number
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            
            // create a student object
            Student newStudent = new Student(name, number);
            
            // add student to array
            students.add(newStudent);
        }
        
        // print out list
        System.out.println("");
        for ( Student st : students ) {
            System.out.println( st );
        }
        
        // Search
        System.out.print("\nGive search term: ");
        String search = reader.nextLine();
        
        for ( Student st : students ) {
            if (st.getName().contains(search)) {
                System.out.println("Result:");
                System.out.println( st );
            }
        }
    }
}
