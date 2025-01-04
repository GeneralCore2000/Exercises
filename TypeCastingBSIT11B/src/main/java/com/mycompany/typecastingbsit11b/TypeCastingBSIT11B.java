//------------------------------------------------------------------------------
//Programmed by: Vargas, John Lloyd E.
//Section: BSIT11b
//Purpose:  Attendance
//Date: October 21, 2023
//------------------------------------------------------------------------------

package com.mycompany.typecastingbsit11b;

public class TypeCastingBSIT11B {

    public static void main(String[] args) {
        //A implicit casting
        int x = 32;
        float var_f = x;
        System.out.println("int to float: " + var_f);
        
        //C implicit casting
        int z = 3;
        double d = z;
        System.out.println("int to double: " + d);
        
        //D implicit casting
        byte b = 10;
        float var_b = b;
        System.out.println("byte to float: " + var_b);
        
        //E explicit casting
        double x2 = 3.5;
        float y = (float) x2;
        System.out.println("double to float: " + y);
    }
}
