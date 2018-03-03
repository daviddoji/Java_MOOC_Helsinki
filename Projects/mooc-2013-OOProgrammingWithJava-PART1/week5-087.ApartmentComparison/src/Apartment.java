
public class Apartment {

    // definition of variables
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    // constructor
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    // method
    public boolean larger(Apartment otherApartment) {
        // check if the compared one is bigger
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }
    
    // auxiliary method
    private int price() {
        return pricePerSquareMeter * squareMeters;
    }
    
    // method
    public int priceDifference(Apartment otherApartment) {
        // definition of variable
        int difference;
        
        // computation
        difference = this.price() - otherApartment.price();
        
        return Math.abs(difference);
    }
    
    // method 
    public boolean moreExpensiveThan(Apartment otherApartment) {
        // check if the compared one is more expensive
        if (this.price() > otherApartment.price()) {
            return true;
        }
        return false;
    }
}
