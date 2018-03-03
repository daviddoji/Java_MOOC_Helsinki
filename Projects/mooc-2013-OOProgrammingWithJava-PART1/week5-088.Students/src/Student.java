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
public class Student {
    
    // definition of variables
    private String name;
    private String studentNumber;
    
    // constructor
    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    // getter method
    public String getName() {
        return name;
    }
    
    // method
    public String getStudentNumber() {
        return studentNumber;
    }
    
    // method
    public String toString() {
        return name + " (" + studentNumber + ")";
    }
    
}
