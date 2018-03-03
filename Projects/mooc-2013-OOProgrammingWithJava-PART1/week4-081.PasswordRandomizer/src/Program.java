public class Program {
    public static void main(String[] args) {
        // object creation using class
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        
        // print out
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
