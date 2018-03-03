
public class Main {

    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);
        MyDate fourth = new MyDate(25, 03, 2010);
        MyDate fifth = new MyDate(25, 03, 2011);

        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );
        System.out.println( fourth + " and " + fifth + " difference in years: " + fourth.differenceInYears(fifth) );
        System.out.println( fifth + " and " + fourth + " difference in years: " + fifth.differenceInYears(fourth) );
    }
}
