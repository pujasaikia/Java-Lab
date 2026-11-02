/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testthis6;

/**
 *
 * @author Anil Saikia
 */
class A{
    A(){
        this(5);
        System.out.println("hello a");
    }
    A(int x){
        System.out.println(x);
    }
}
public class TestThis6 {

    public static void main(String[] args) {
        A a=new A();
    }
}
