public class Reformatory {
    
    // definition of variables
    private int timesMeasured;

    // constructor
    public Reformatory() {
        this.timesMeasured = 0;
    }
    

    // method
    public int weight(Person person) {
        // increase variable by 1
        this.timesMeasured++;
        // return the weight of the person
        return person.getWeight();
    }
    
    // method
    public void feed(Person person) {
        // increase the weight of its parameter by one
        person.setWeight(person.getWeight() + 1);
    }
    
    // method
    public int totalWeightsMeasured() {
        return timesMeasured;
    }
}
