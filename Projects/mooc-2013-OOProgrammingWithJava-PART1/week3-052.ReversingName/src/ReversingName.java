import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        System.out.print("In reverse order: ");
        while (i < name.length()) {
            System.out.print(name.charAt(name.length()- i -1));
            i++;
        }
        System.out.println("");
    }
}
