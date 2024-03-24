package SumOfDecimalToNonDecimal;

import java.util.Scanner;

public class SumOfDecimalToNonDecimal {

    public SumOfDecimalToNonDecimal() {
        Scanner in = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        int counter = 0;
        while (counter < 3) {
            System.out.print("Enter number #1 >>: ");
            num1 = in.nextDouble();
            System.out.print("Enter number #2 >>: ");
            num2 = in.nextDouble();
            System.out.print("Sum: ");

            if (getSum(num1, num2) % 1 == 0) {
                if (num1 % 1 != 0 || num2 % 1 != 0) {
                    System.out.printf("%.0f", getSum(num1, num2));
                    System.out.println();
                } else {
                    System.out.println(getSum((int) num1, (int) num2));
                }
            } else {
                System.out.println(getSum(num1, num2));
            }
            counter++;
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