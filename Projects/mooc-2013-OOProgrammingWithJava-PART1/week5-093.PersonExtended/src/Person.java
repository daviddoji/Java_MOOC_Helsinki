import java.util.Calendar;

public class Person {
    // definition of variables
    private String name;
    private MyDate birthday;
    
    // constructor
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    // constructor overloaded
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    // constructor overloaded
    public Person(String name) {
        this.name = name;
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        this.birthday = new MyDate(day, month, year);
    }
    
    // method
    public int age() {
        // calculate the age based on the birthday and the current day

        // definition of variables
        int age;
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        // object creation using class
        MyDate thisYear = new MyDate(day, month, year);
        
        // calculation
        age = this.birthday.differenceInYears(thisYear);
        
        return age;
    }
    
    // method
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.birthday.earlier(compared.birthday)) {
            return true;
        }
        return false;
    }
    
    // getter
    public String getName() {
        return this.name;
    }
    
    // method
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
