
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // objects creation using class
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        // method calls
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
    
        cardBrian.loadMoney(50);
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
