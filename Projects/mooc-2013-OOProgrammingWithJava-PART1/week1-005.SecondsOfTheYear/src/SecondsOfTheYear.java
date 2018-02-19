public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // definition of variables
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        
        // calculation
        int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;

        // print out
        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

}
