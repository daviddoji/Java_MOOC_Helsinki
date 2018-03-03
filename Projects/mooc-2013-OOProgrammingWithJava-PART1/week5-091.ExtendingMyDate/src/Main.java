
public class Main {

    public static void main(String[] args) {
        // object creation using class
        MyDate day = new MyDate(25, 2, 2011);
        
        // method call returning new object
        MyDate newDate = day.afterNumberOfDays(7);
        
        // loop
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
    }
}
