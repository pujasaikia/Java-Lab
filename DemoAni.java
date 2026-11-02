/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demoani;

/**
 *
 * @author Anil Saikia
 */
class Animal {
    void sound(){
        System.out.println("this animal makes a sound");
}
}
class Dog extends Animal{
    @Override
    void sound(){
    super.sound();
    System.out.println("the dog barks");
    }
}
public class DemoAni {

    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.sound();
    }
}
