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
public class Product {
    
    // definition of variables
    private String name;
    private int amount;
    private double price;
    
    // constructor
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    // method
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " 
                + this.amount);
    }
}
