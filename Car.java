/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask2;

/**
 *
 * @author USER
 */
 class Car extends Vehicle {
    
    int numberOfDoors = 4;
    
    Car (String model, int year, double price, int numberOfDoors){
        super(model, year, price);
        this.numberOfDoors = numberOfDoors;       
    }
}
