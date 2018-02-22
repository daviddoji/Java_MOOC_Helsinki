public class Main {
    
    public static void main(String[] args) {
        // object creation using class
        DecreasingCounter counter = new DecreasingCounter(100);

        // method calls
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.reset();
        counter.printValue();
        counter.setInitial();
        counter.printValue();
    }
}
