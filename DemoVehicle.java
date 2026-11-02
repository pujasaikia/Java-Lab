/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demovehicle;

/**
 *
 * @author Anil Saikia
 */
class Vehicle{
    void start(){
        System.out.println("the vehicle starts");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("the car starts with a key ignition");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("the bike starts with a kick");
    }
}
public class DemoVehicle {

    public static void main(String[] args) {
        Vehicle myVehicle=new Vehicle();
        myVehicle.start();
        
        Vehicle myCar=new Car();
        myCar.start();
        
        Vehicle myBike=new Bike();
        myBike.start();
    }
}