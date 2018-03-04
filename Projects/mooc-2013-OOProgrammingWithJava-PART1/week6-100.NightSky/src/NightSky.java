/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */

import java.util.Random;


public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int printedStars;

    // constructor
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    // constructor overload
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    // constructor overload
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    // method
    public void printLine() {
        // definition of variables
        Random rand = new Random();
        int lineLenght = this.width;
        
        // loop
        for (int i=0; i<lineLenght; i++) {
            if (rand.nextDouble() <= this.density) {
                System.out.print("*");
                printedStars ++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    // method
    public void print() {
        this.printedStars = 0;
        
        // loop
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }
    
    // method
    public int starsInLastPrint() {
        return printedStars;
    }
}
