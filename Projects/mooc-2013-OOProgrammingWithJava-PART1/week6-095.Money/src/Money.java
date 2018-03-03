
public class Money {

    // definition of variables
    private final int euros;
    private final int cents;

    // constructor
    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    // method
    public int euros() {
        return euros;
    }

    // method
    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

    // method 
    public Money plus(Money added) {
        // definition of variables and initialization
        int newEuros = this.euros + added.euros();
        int newCents = this.cents + added.cents();
        
        // check cents overload
        if (newCents > 99) {
            newCents -= 100;
            newEuros ++;
        }
        
        // object creation and initialization
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
    
    // method
    public boolean less(Money compared) {
        // compared euros and cents
        if (this.euros < compared.euros){
            return true;
        } 
        if (this.euros == compared.euros ){
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    // method
    public Money minus(Money decremented) {
        // check using method
        if (this.less(decremented)) {
            int newEuros = 0;
            int newCents = 0;
            
            // object creation and initialization
            Money newMoney = new Money(newEuros, newCents);
        
            return newMoney;
        } else {
            // definition of variables and initialization
            int newEuros = this.euros - decremented.euros;
            int newCents = this.cents - decremented.cents;
            
            // make calculation for cents
            if (this.cents < decremented.cents) {
                newEuros--;
                newCents =  100 - decremented.cents;
            }
        
            // object creation and initialization
            Money newMoney = new Money(newEuros, newCents);
        
            return newMoney;
        }
    }
}
