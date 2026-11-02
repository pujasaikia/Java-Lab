/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2;

/**
 *
 * @author Anil Saikia
 */
import java.util.ArrayList;
import java.util.Arrays;

class Test2 
{
    public static void main(String args[])
    {
        /* ............ Normal Array............ */
        // Need to specify the size for array
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // We cannot add more elements to array arr[]

        /* ............ArrayList............ */
        // Need not to specify size
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        arrl.add(1);
        arrl.add(2);
        arrl.add(3);
        arrl.add(4);
        // We can add more elements to arrl

        System.out.println(arrl);
        System.out.println(Arrays.toString(arr));
    }
}
