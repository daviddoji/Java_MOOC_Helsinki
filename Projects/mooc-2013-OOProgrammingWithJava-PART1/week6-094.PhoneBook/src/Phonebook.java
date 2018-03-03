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
public class Phonebook {
    
    // definition of variables
    private ArrayList<Person> phoneBook; 

    // constructor
    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }    
    
    // method
    public void add(String name, String number) {
        Person person = new Person(name, number);
        
        phoneBook.add(person);
    }
    
    // method
    public void printAll() {
        for (Person person : phoneBook) {
            System.out.println(person);
        }
    }
    
    // method
    public String searchNumber(String name) {
        for (Person person : phoneBook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }  
        }
        return "number not known";
    }
}
