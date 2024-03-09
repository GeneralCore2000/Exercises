package Test;

import java.util.Scanner;

public class Test {

    Scanner in = new Scanner(System.in);
    String name = "", number = "", choice = "";
    int terminator = 0;
    boolean start = true, nameStart = true, numberStart = true;
    String[][] phoneBook = new String[5][2];

    public Test() {
        phoneBook[0][0] = "099999999";
        phoneBook[0][1] = "John";
        phoneBook[1][0] = "099999999";
        phoneBook[1][1] = "Ericka";
        phoneBook[2][0] = "099999999";
        phoneBook[2][1] = "Gaspar";

        while (start) {
            showPhoneBook();
            System.out.print("[A]dd\n[E]xit\nYour choice >>: ");
            choice = in.nextLine().toUpperCase();

            switch (choice) {
                case "A":
                    if (terminator < 3) {
                        while (nameStart) {
                            System.out.print("Enter name >>: ");
                            name = in.nextLine();

                            if (name.equals("")) {
                                System.out.println("Name must not be blank.");
                            } else {
                                nameStart = false;
                            }
                        }
                        while (numberStart) {
                            System.out.print("Enter number >>: ");
                            number = in.nextLine();

                            if (number.length() < 11 || number.length() > 11) {
                                System.out.println("Number must only be 11 Digits.");
                            } else {
                                numberStart = false;
                                addToPhoneBook(number, name);
                            }

                        }

                    } else {
                        System.out.println("Phone book is already full");
                        break;
                    }
                case "E":
                    start = false;
                    break;
                default:
                    System.out.println("Enter from choices only.");
            }

        }
    }

    public void showPhoneBook() {
        System.out.println("==============================================");
        System.out.println("\t\tPHONE BOOK");
        System.out.println("==============================================");
        System.out.println("\tNUMBERS \t | \t NAME");
        System.out.println("==============================================");
        for (int i = 0; i < phoneBook.length; i++) {
            System.out.print("[" + (i + 1) + "]     ");
            for (int j = 0; j < phoneBook[0].length; j++) {
                if (phoneBook[i][j].equals("")) {
                    break;
                }
                System.out.print(phoneBook[i][j] + "\t\t");
            }
            System.out.println("");
        }
        System.out.println("==============================================");
    }

    public void addToPhoneBook(String num, String name) {
        int flag = 0;
        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook[0].length; j++) {
                if (phoneBook[i][j].equals("")) {
                    if (j == 0) {
                        phoneBook[i][j] = num;
                    } else {
                        phoneBook[i][j] = name;
                    }
                } else {
                    flag = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test p = new Test();
        p.showPhoneBook();
    }

}
