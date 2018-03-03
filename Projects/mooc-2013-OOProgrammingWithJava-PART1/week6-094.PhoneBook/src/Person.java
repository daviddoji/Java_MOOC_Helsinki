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
public class Person {
    
    // definition of variables
    private String name;
    private String number;

    // constructor
    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " number: " + number;
    }

    // getter
    public String getName() {
        return name;
    }

    // getter
    public String getNumber() {
        return number;
    }
    
    // method
    public void changeNumber(String newNumber) {
        number = newNumber;
    }
}
