
public class Main {

    public static void main(String[] args) {
        // object creation using class
        Dice dice = new Dice(6);

        // definition of variables
        int i = 0;
        // loop
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
