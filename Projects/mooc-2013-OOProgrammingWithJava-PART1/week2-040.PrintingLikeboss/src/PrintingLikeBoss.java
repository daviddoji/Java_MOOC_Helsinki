public class PrintingLikeBoss {

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
    public static void printWhitespaces(int amount) {
        // definition of variables
        int i = 1;
        
        // loop
        while (i <= amount) {
            // print out
            System.out.print(" ");
            // increase variable by 1
            i++;
        }
    }

    // method
    public static void printTriangle(int size) {
        // definition of varibles
        int i = 1;
        
        // loop
        while (i <= size) {
            // method calls
            printWhitespaces(size - i);
            printStars(i);
            // increase variable by 1
            i++;
        }
    }

    // method call
    public static void xmasTree(int height) {
        // definition of variables
        int i = 1;
        int j = 1;
        int k = 0;
        
        // loop for top of tree
        while (j <= height) {
            // method calls
            printWhitespaces(height - j);
            printStars(i);
            // increase variable by 2
            i+=2;
            // increase variable by 1
            j++;
        }
        
        // loop for bottom of tree
        while (k < 2) {
            // method calls
            printWhitespaces(height - 2);
            printStars(3);
            // increase varible by 1
            k++;
        }
    }

    // main program
    public static void main(String[] args) {
        // method call
        printTriangle(5);
        // printing --- to separate the figures
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
