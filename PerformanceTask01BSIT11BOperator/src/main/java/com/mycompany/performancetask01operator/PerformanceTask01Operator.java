//------------------------------------------------------------------------------
//Programmed By: Vargas, John Lloyd E.
//Section: BSIT 11B
//Purpose: Task Performance 01 (Operators)
//Date: 11/02/2023 
//------------------------------------------------------------------------------
package com.mycompany.performancetask01operator;

public class PerformanceTask01Operator {

    public static void main(String[] args) {
        
        String employeeName = "Jess Diaz";
        double grossPay = 25000.0;
        
        double withHoldingTax = 15;
        double sssContribution = 3.63;
        double mediCare = 1.25;
        double pagIbig = 100;

        double netPay = grossPay
                - (((withHoldingTax / 100.00) * grossPay)
                + ((sssContribution / 100.00) * grossPay)
                + ((mediCare / 100.00) * grossPay)
                + pagIbig);

        System.out.println("Employee Name: " + "        " + employeeName);
        System.out.println("Gross Pay: " + "            " + grossPay);
        System.out.println("_____________________________________________");
        System.out.println("Deductions " + "            " + "Amount");
        System.out.println("Witholding Tax:" + "        " + (withHoldingTax / 100) * grossPay);
        System.out.println("SSS Contribution:" + "      " + (sssContribution / 100) * grossPay);
        System.out.println("Medicare:" + "              " + (mediCare / 100) * grossPay);
        System.out.println("Pagibig Contribution:" + "  " + pagIbig);
        System.out.println("_____________________________________________");
        System.out.println("Net Pay:" + "               " + netPay);

    }
}
