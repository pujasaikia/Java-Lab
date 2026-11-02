/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testthis5;

/**
 *
 * @author Anil Saikia
 */
class A{
    A(){System.out.println("hello a");
}
    A(int x){
        System.out.println(x);
    }
}
public class TestThis5 {

    public static void main(String[] args) {
       A a=new A(10);
    }
}
