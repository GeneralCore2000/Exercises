package factorialcalculator;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, mul = 0, ans = 1, i = 0;

        System.out.println("<-------------Factorial Calculator--------------->");

        for (int ctr = 0; ctr < 5; ctr++) {

            System.out.print("Enter a positive integer: ");
            num = in.nextInt();

            if (num < 1) {
                System.out.println("Invalid input! Program stopped!");
                break;
                
            } else {
                System.out.print(num + "!" + " = ");
                while (mul < num) {
                    mul++;
                    System.out.print(mul);
                    if (mul < num) {
                        System.out.print(" x ");
                        i++;
                    }
                    ans *= mul;
                }
                System.out.println("");
                System.out.println("The factorial of " + num + " is: " + ans);
                mul = 0;
                ans = 1;
            }
        }
    }
}
