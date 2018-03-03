
public class Main {

    public static void main(String[] args) {
        // objects creation using class
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        // print outs
        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );   
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );
        
        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );
        
        System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );
        System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );
    }
}
