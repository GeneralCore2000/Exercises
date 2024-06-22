package bsit12bfinals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSIT12BFinals {

    boolean isExist = false, start = true;
    String idNum = "", pin = "", choice = "";
    int attempt = 1, tempRow = 0, amount = 0, newBal = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[][] accounts = {
        {"1234567887654321", "123456", "15000", "UNLOCKED"},
        {"8765432112345678", "654321", "10000", "UNLOCKED"}
    };

    public BSIT12BFinals() {
        while (start) {
            System.out.print("Enter your ID number >>: ");
            try {
                idNum = br.readLine().trim();
            } catch (Exception e) {
            }

            //ID Num Checker if existing
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i][0].equals(idNum)) {
                    isExist = true;
                    tempRow = i;
                    break;
                }
            }

            if (isExist) {
                if (accounts[tempRow][3].equals("UNLOCKED")) {
                    authenticateAccount(idNum);
                } else {
                    System.out.println("YOUR ACCOUNT IS LOCKED");
                }

            } else {
                System.out.println("Card Number does not exist.");
            }
        }

    }

    public void authenticateAccount(String idNum) {
        while (start) {
            System.out.print("Enter PIN >>: ");
            try {
                pin = br.readLine();
            } catch (Exception e) {
            }

            if (accounts[tempRow][1].equals(pin)) {
                while (start) {
                    System.out.println("=================================="
                            + "=======");
                    System.out.println("          AUTOMATED TELLER MACHINE");
                    System.out.println("=================================="
                            + "=======");
                    System.out.print("""
                                 [1]Check Balance
                                 [2]Withdraw
                                 [3]Exit
                                 >>:""");
                    try {
                        choice = br.readLine();
                        switch (choice) {
                            case "1":
                                checkBalance();
                                break;
                            case "2":
                                withdraw();
                                break;
                            case "3":
                                System.out.println("Account number "
                                        + accounts[tempRow][0] + " logged out."
                                        + "");
                                System.out.println(""
                                        + "=================================="
                                        + "======"
                                        + "=");
                                System.out.println("          "
                                        + "AUTOMATED TELLER MACHINE");
                                System.out.println(
                                        "==================================="
                                        + "======"
                                        + "");
                                start = false;
                                break;
                            default:
                                System.out.println("Enter from choices only.");
                        }
                    } catch (IOException ex) {
                    }
                }
                break;
            } else {
                if (attempt < 3) {
                    attempt++;
                    lockAccount(attempt);
                } else {
                    start = false;
                }

            }

        }
        start = true;
    }

    public void lockAccount(int attempt) {
        System.out.println("attempt: " + attempt);
        if (attempt == 3) {
            accounts[tempRow][3] = "LOCKED";
        }
    }

    public void checkBalance() {
        System.out.println("Your account balance is: " + accounts[tempRow][2]);
    }

    public void withdraw() {
        while (start) {
            System.out.print("Enter the amount to withdraw >>: ");
            try {
                amount = Integer.parseInt(br.readLine());
            } catch (Exception e) {
            }

            if (amount > 30000) {
                System.out.println("Amount cannot exceed 30000");
            } else if (amount > Integer.parseInt(accounts[tempRow][2])) {
                System.out.println("Your balance is only: "
                        + accounts[tempRow][2]);
            }else{
                newBal = Integer.parseInt(accounts[tempRow][2]) - amount;
                accounts[tempRow][2] = newBal + "";
                break;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("          AUTOMATED TELLER MACHINE");
        System.out.println("=========================================");
        new BSIT12BFinals();

    }
}