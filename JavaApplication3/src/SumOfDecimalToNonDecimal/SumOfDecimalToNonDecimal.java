package SumOfDecimalToNonDecimal;

import java.util.Scanner;

public class SumOfDecimalToNonDecimal {

    public SumOfDecimalToNonDecimal() {
        Scanner in = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        System.out.print("Enter 1st number >>: ");
        num1 = in.nextDouble();
        System.out.print("Enter 2nd number >>: ");
        num2 = in.nextDouble();
        if (getSum(num1, num2) % 1 == 0) {
            System.out.println(getSum((int)num1,(int)num2));
        }else{
            System.out.println(getSum(num1,num2));
        }
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public double getSum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        SumOfDecimalToNonDecimal app = new SumOfDecimalToNonDecimal();
    }
}
