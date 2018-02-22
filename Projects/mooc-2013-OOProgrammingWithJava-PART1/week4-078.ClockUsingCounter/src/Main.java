
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // for reading user input
        Scanner reader = new Scanner(System.in);
        
        // objects creation using class
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        // definition of variables
        int i = 0;

        // ask initial values from the user
        System.out.print("seconds: ");
        int s = reader.nextInt();
        System.out.print("minutes: ");
        int m = reader.nextInt();
        System.out.print("hours: ");
        int h = reader.nextInt();

        // set values
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        // loop
        while ( i < 121 ) {
            // print out
            System.out.println(hours + ":" + minutes + ":" + seconds);
            // update seconds
            seconds.next();
            // check value and reset at 0
            if (seconds.getValue() == 0){
                //update minutes
                minutes.next();
            }
            // check value and reset at 0
            if (minutes.getValue() == 0 && seconds.getValue() == 0){
                // update hours
                hours.next();
            }
            // increase variable by 1
            i++;
        }
    }
}
