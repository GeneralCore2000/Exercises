package bsit12bactivity01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BSIT12BActivity01 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = "", num1 = "";
    boolean start = true;

    public BSIT12BActivity01() {
        while (start) {
            System.out.print("""
                             Enter choice
                             [E]xit
                             [P]arity
                             [PA]lindrome
                             >>: """);
            try {
                input = br.readLine().trim();
            } catch (IOException e) {
            }

            if (input.matches("[Ee].*")) {
                System.err.println("System Terminated.");
                start = false;
            } else if (input.matches("[Pp][Aa].*")) {
                while (start) {
                    System.out.print("Enter a maximum of 10-digit number >>: ");
                    try {
                        num1 = br.readLine();
                    } catch (IOException ex) {
                    }
                    if (num1.matches("[0-9]{1,10}")) {
                        palindromeChecker(num1);
                        start = false;
                    } else {
                        System.err.println("[Maximum[] number is 10-digit.\n");
                    }
                }

            } else if (input.matches("[Pp].*")) {
                while (start) {
                    System.out.print("Enter a maximum of 10-digit number >>: ");
                    try {
                        num1 = br.readLine();
                    } catch (IOException ex) {
                    }
                    if (num1.matches("[0-9]{1,10}")) {
                        parityChecker(Integer.parseInt(num1));
                        start = false;
                    } else {
                        System.err.println("Maximum number is 10-digit.\n");
                    }
                }

            }
        }
    }

    public void parityChecker(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }

    public void palindromeChecker(String num) {
        ArrayList<String> reverse = new ArrayList<>();
        boolean isPalindrome = true;
        for (int i = num.length() - 1; i >= 0; i--) {
            reverse.add(num.charAt(i) + "");
        }
        for (int i = 0; i < reverse.size(); i++) {
            if (!reverse.get(i).equals(num.charAt(i) + "")) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is NOT a Palindrome number");
        }
    }

    public static void main(String[] args) {
        BSIT12BActivity01 bsit = new BSIT12BActivity01();
    }
}
