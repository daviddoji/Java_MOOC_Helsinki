
public class Main {

    public static void main(String[] args) {
        // object creation using class
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + 
                threeMultiplier.multiply(2));

        // object creation using class
        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + 
                fourMultiplier.multiply(2));

        // print out 
        System.out.println("threeMultiplier.multiply(1): " + 
                threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + 
                fourMultiplier.multiply(1));
    }
}
