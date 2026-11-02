/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testthis4;

/**
 *
 * @author Anil Saikia
 */
class A{
    void m(){System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
        this.m();
    }
    }
public class TestThis4 {

    public static void main(String[] args) {
        A a=new A();
        a.n();
    }
}
