
import java.util.ArrayList;

// class
public class Menu {
    // definition of variables
    private ArrayList<String> meals;

    // constructor
    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // method
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    
    // method
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
    
    // method
    public void clearMenu() {
        this.meals.clear();
    }
}
