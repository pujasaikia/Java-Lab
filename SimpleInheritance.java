/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleinheritance;

/**
 *
 * @author Anil Saikia
 */
class A{
    int i,j;
    
    void showij(){
        System.out.println("i & j: " + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k: " + (i+j+k));
    }
}
public class SimpleInheritance {

    public static void main(String[] args) {
       A superOb=new A();
       B subOb=new B();
       
       superOb.i=10;
       superOb.j=20;
       System.out.println("contents of superOb: ");
       superOb.showij();
       System.out.println();
       
       subOb.i=7;
       subOb.j=8;
       subOb.k=9;
       System.out.println("contents of subOb: ");
       subOb.showij();
       subOb.showk();
       System.out.println();
       
       System.out.println("sum of i, j & k in subOb: ");
       subOb.sum();
    }
}
