//------------------------------------------------------------------------------
//Programmed By: Vargas, John Lloyd E.
//Section: BSIT 11B
//Purpose: Performance Task
//Date Created: 10/30/2023 
//------------------------------------------------------------------------------
package com.mycompany.taskperformance01;

public class TaskPerformance01 {

    public static void main(String[] args) {
        /*
        The computation is done inside the print fuction ?
        Do not hardcode print the output / 
        Concatenate your answer / 
         */

        //Initialize two (2) variables to hold the employee name and the gross pay /
        String employeeName = "Jess Diaz";
        double grossPay = 25000.0;

        //No instruction for declaring and initializing the following deductions
        //Declare and initialize the net pay that is calculated after taking the following deductions. 
        double netPay = grossPay;

        System.out.println("Employee Name: " + "        " + employeeName);
        System.out.println("Gross Pay: " + "            " + grossPay);
        System.out.println("_____________________________________________");
        System.out.println("Deductions " + "            " + "Amount");
        System.out.println("Witholding Tax:" + "        " + (15 / 100) * grossPay);
        System.out.println("SSS Contribution:" + "      " + (3.63 / 100) * grossPay);
        System.out.println("Medicare:" + "              " + (1.25 / 100) * grossPay);
        System.out.println("Pagibig Contribution:" + "  " + 100);
        System.out.println("_____________________________________________");
        System.out.println("Net Pay:" + "               " + (netPay
                - (((15 / 100.00) * grossPay)
                + ((3.63 / 100.00) * grossPay)
                + ((1.25 / 100.00) * grossPay)
                + 100.00)));

    }
}
