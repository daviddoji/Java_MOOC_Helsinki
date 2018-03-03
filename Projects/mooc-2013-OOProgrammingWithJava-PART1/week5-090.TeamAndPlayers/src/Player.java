/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */

// class
public class Player {
    
    // definition of variables
    private String name;
    private int numGoals;
    
    // constructor
    public Player(String name, int numGoals) {
        this.name = name;
        this.numGoals = numGoals;
    }
    
    // constructor
    public Player(String name) {
        this.name = name;
        this.numGoals = 0;
    }

    // getter
    public String getName() {
        return this.name;
    }
    
    // method
    public int goals() {
        return this.numGoals;
    }

    @Override
    public String toString() {
        return this.name + ", goals " + this.numGoals;
    }
    
    
}
