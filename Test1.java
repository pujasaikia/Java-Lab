/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;

/**
 *
 * @author Anil Saikia
 */
import java.util.ArrayList;
import java.util.Arrays;

class Test1 
{
    public static void main(String args[])
    {
        /* ............ Normal Array............ */
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[0]);

        /* ............ArrayList............ */
        // Create an ArrayList with initial capacity 2
        ArrayList<Integer> arrl = new ArrayList<Integer>(2);

        // Add elements to ArrayList
        arrl.add(1);
        arrl.add(2);

        // Access elements of ArrayList
        System.out.println(arrl.get(0));
    }
}
