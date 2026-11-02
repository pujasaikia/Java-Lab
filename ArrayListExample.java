/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylistexample;

/**
 *
 * @author Anil Saikia
 */
import java.util.*;
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Jack");
        al.add("Tyler");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}
