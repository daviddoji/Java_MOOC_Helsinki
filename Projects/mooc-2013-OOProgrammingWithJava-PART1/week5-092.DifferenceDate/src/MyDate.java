
public class MyDate {
    // definition of variables
    private int day;
    private int month;
    private int year;

    // constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // method
    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }

    // method
    public int differenceInYears(MyDate comparedDate) {
        // definition of variables
        int years2days_A;
        int months2days_A;
        int days_A;
        int years2days_B;
        int months2days_B;
        int days_B;
        int total_A;
        int total_B;
        int difference;
        
        years2days_A = this.year * 365;
        months2days_A = this.month * 30;
        days_A = this.day;
        
        total_A = years2days_A + months2days_A + days_A;
        
        years2days_B = comparedDate.year * 365;
        months2days_B = comparedDate.month * 30;
        days_B = comparedDate.day;
        
        total_B = years2days_B + months2days_B + days_B;
        
        difference = total_A  - total_B;
        
        if (Math.abs(difference%365) >= 0) {
            return Math.abs(difference/365);
        }
        //return difference;
        return 0;
    }
}
