
public class CashRegister {

    // definition of variables
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private double lunchPriceEconomical = 2.5;
    private double lunchPriceGourmet = 4.0;

    // constructor
    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    // method
    public double payEconomical(double cashGiven) {
        // definition of variables
        double change = 0;
        
        // check if enough cash
        if (cashGiven >= lunchPriceEconomical) {
            this.cashInRegister += lunchPriceEconomical;
            this.economicalSold++;
            change = cashGiven - lunchPriceEconomical;
            return change;
        } else {
            return cashGiven;
        }
        
    }

    public double payGourmet(double cashGiven) {
        // definition of variables
        double change = 0;
        
        // check if enough cash
        if (cashGiven >= lunchPriceGourmet) {
            this.cashInRegister += lunchPriceGourmet;
            this.gourmetSold++;
            change = cashGiven - lunchPriceGourmet;
            return change;
        } else {
            return cashGiven;
        }
    }
    
    // method
    public boolean payEconomical(LyyraCard card) {
        // check if enough money in the card
        if (card.balance() >= lunchPriceEconomical) {
            card.pay(lunchPriceEconomical);
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    // method
    public boolean payGourmet(LyyraCard card) {
        // check if enough money in the card
        if (card.balance() >= lunchPriceGourmet) {
            card.pay(lunchPriceGourmet);
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }
    
    // method
    public void loadMoneyToCard(LyyraCard card, double sum) {
        // check if amount to add is positive
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    // method
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
