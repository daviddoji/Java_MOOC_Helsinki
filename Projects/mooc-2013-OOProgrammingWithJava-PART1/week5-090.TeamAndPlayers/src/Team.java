/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */

import java.util.ArrayList;

// class
public class Team {
    
    // definition of variables
    private String name;
    private ArrayList<Player> team;
    private int maxSize;
    
    //constructor
    public Team(String name) {
        this.name = name;
        this.team  = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    // method
    public String getName() {
        return this.name;
    }
    
    // method
    public void addPlayer(Player player) {
        if (this.size() >= this.maxSize) {
            return;
        }
        team.add(player);
    }
    
    // method
    public void printPlayers() {
        for ( Player player : this.team ) {
            System.out.println( player );
        }
    }
    
    // method
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    // method
    public int size() {
        return this.team.size();
    }

    // method
    public int goals() {
        // definition of variables
        int amount = 0;
        
        // loop
        for (Player player : team) {
            amount += player.goals();
        }
        return amount;
    }
    
}
