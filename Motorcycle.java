/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask2;

import LabTask2.Vehicle;

/**
 *
 * @author USER
 */
 class Motorcycle extends Vehicle {
    
    
    boolean hasSideCar;
    
    Motorcycle(String model, int year, double price, boolean hasSideCar){
        
        super(model, year, price);
        this.hasSideCar = hasSideCar;
        
  }
}
