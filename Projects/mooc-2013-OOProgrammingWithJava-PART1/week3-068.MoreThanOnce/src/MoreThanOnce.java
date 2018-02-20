import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    // method
    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        // definition of variables
        int times = 0;
        
        // loop
        for (int number : list) {
            // check if variable is the one we are looking for
            if (number == searched) {
                times ++;
            }
        }
        
        // check if variable appears more than once
        if (times > 1) {
            return true;
        }
        return false;
    }

    // main program
    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // creation of array
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add elements to array
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        // ask user input
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        // check using method call
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
