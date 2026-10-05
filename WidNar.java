/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.widnar;

/**
 *
 * @author Anil Saikia
 */
public class WidNar {

    public static void main(String[] args) {
        //widening conversion
        int num=500;
        long l=num;
        float f=1;
        
        System.out.println("Int type value " + num);
        System.out.println("Long type value " + l);
        System.out.println("Float type value " + f);
        
        //narrowing conversion
        double d=560.025;
        long lo=(long)d;
        int i=(int)lo;
        
        System.out.println("Double type value " + d);
        System.out.println("Long type value " + lo);
        System.out.println("Int type value " + i);
        
    }
}
