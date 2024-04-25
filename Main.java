/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask2;

import LabTask2.Motorcycle;
import LabTask2.Vehicle;
import LabTask2.Car;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String args[]){
        
        Vehicle parentObj = new Vehicle("VehicleModel", 1900, 69000);
        Car childObj1 = new Car("Chevrolet Nova", 1960, 80000, 4);
        Motorcycle childObj2 = new Motorcycle("Royal Enfield Classic 350", 2009, 3199, false);
        
        //printing attributes of parent
        System.out.println(parentObj.model);
        System.out.println(parentObj.year);
        System.out.println(parentObj.price);
        
        //printing attributes of child 1
        System.out.println(childObj1.model); // accessed atribute of parent
        System.out.println(childObj1.year); // accessed atribute of parent
        System.out.println(childObj1.price); // accessed atribute of parent
        System.out.println(childObj1.numberOfDoors);
        
        //printing attributes of child 2
        System.out.println(childObj2.model); // accessed atribute of parent
        System.out.println(childObj2.year); // accessed atribute of parent
        System.out.println(childObj2.price); // accessed atribute of parent
        System.out.println(childObj2.hasSideCar);
        
        
        
    }
}
