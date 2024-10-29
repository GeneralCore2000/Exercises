/*
================================================================================
Name: John loyd vargas, Ruzzel Del Rosario, Jhulius pama,ernest james caparas,
kel mendiola
Section: BSIT12B
Purpose:FinalExaminationATM
Date:15/06/2024
================================================================================
 */
package com.mycompany.finalexaminationatm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FinalExaminationAtm {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String cardNumber = "", pin = "", choice = "";
    int withdrawAmount = 0;

    boolean isExisting = true, start = true;
    String accounts[][] = {{"12345671234566712", "654321", "200000", "Unlocked"},
    {"1231231231231231", "123456", "500000", "Unlocked"}};

    //0 0 - 0 1
    //1 0 - 1 1
    public FinalExaminationAtm() {
        while (true) {
            System.out.println("============================================="
                    + "==");
            System.out.println("           AUTOMATED TELLER MACHINE        ");
            System.out.println("============================================="
                    + "==");
            System.out.print("Enter Card number >>: ");
            try {
                cardNumber = input.readLine();
            } catch (IOException ex) {

            }
            for (int i = 0; i < accounts.length; i++) {
                for (int j = 0; j < accounts[i].length; j++) {
                    if (cardNumber.equals(accounts[i][0])
                            && !accounts[i][3].equals("Locked")) {
                        isExisting = true;
                        if (isExisting) {
                            authenticateAccount(i);

                        } else {
                            System.out.println("Account does not exist.");
                            break;
                        }
                    } else if (accounts[i][3].equals("Locked")) {
                        System.out.println("Your account is locked.");
                        break;
                    } else {
                        isExisting = false;
                    }
                }

            }

        }
    }

    public void authenticateAccount(int row) {
        int attempt = 0;
        while (start) {
            System.out.print("Enter PIN >>: ");
            try {
                pin = input.readLine();
            } catch (Exception e) {
            }
            if (pin.equals(accounts[row][1])) {
                break;
            } else {
                lockAccount(attempt++);

            }
        }
        while (start) {
            System.out.println("==========================================="
                    + "====");
            System.out.println("           AUTOMATED TELLER MACHINE        ");
            System.out.println("==========================================="
                    + "====");

            System.out.print("[1]Check balance\n[2]Withdraw\n[3]Exit\n>>: ");

            try {
                choice = input.readLine();
            } catch (Exception e) {
            }

            switch (choice) {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    withdraw();
                    break;
                case "3":
                    for (int i = 0; i < accounts.length; i++) {
                        if (cardNumber.equals(accounts[i][0])) {
                            System.out.println("Account number "
                                    + accounts[i][0] + " logged out.");
                        }
                    }
                    break;
                default:
                    System.out.println("Enter from choices only.");
            }
        }

    }

    public void lockAccount(int attempt) {
        if (attempt < 3) {
            System.out.println("Your account has been locked");
            for (int i = 0; i < accounts.length; i++) {
                for (int j = 0; j < accounts[i].length; j++) {
                    if (cardNumber.equals(accounts[i][0])) {
                        accounts[i][3] = "Locked";
                        attempt = 0;
                    } else {
                        isExisting = false;
                    }
                }

            }
        } else {
            System.out.println("Invalid pin.");
        }
    }

    public void checkBalance() {
        System.out.print("Your balance is: ");
        for (int i = 0; i < accounts.length; i++) {
            if (cardNumber.equals(accounts[i][0])) {
                System.out.println(accounts[i][2]);
                start = false;
            }
        }
    }

    public void withdraw() {
        double balance = 0;
        System.out.print("Enter amount >>: ");
        for (int i = 0; i < accounts.length; i++) {
            if (cardNumber.equals(accounts[i][0])) {
                try {

                    withdrawAmount = Integer.parseInt(input.readLine());
                } catch (Exception e) {
                }
                balance = Integer.parseInt(accounts[i][0]);
                if (balance < withdrawAmount) {
                    System.out.println("Your balance is only: " + balance);
                } else {
                    accounts[i][2] = balance - withdrawAmount + "";
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new FinalExaminationAtm();
    }
}
