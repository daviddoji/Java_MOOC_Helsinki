public class Printing {

    // method
    public static void printStars(int amount) {
        // definition of varibles
        int i = 1;
        
        // loop
        while (i <= amount) {
            // print out
            System.out.print("*");
            // increase variable by 1
            i++;
        }
        // print out line break
        System.out.print("\n");
    }

    // method
    public static void printSquare(int sideSize) {
        // definition of variables
        int i = 1;
        
        // loop
        while (i <= sideSize) {
            // method call
            printStars(sideSize);
            // increase variable by 1
            i++;
        }
    }

    // method
    public static void printRectangle(int width, int height) {
        // definition of variables
        int i = 1;
        
        // loop
        while (i <= height) {
            // method call
            printStars(width);
            // increase variable by 1
            i++;
        }
    }

    public static void printTriangle(int size) {
        // definition of variables
        int i = 1;
        
        // loop
        while (i <= size) {
            // method call
            printStars(i);
            // increase variable by 1
            i++;
        }
    }

    // main program
    public static void main(String[] args) {
        // method call
        printStars(3);
        // printing --- to separate the figures
        System.out.println("\n---");  
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}
