package phonebook;

import java.util.Scanner;

public class PhoneBook {

    Scanner in = new Scanner(System.in);
    String name = "", number = "", choice = "";
    int terminator = 0;
    boolean start = true, nameStart = true, numberStart = true;
    String[][] phoneBook = {
        {"09548732435", "John Lloyd"},
        {"09548289454", "Ericka Gaspar"},
        {"09128475032", "Karl De Leon"}
    };

    public PhoneBook() {

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
        PhoneBook p = new PhoneBook();
        p.showPhoneBook();
    }

}
