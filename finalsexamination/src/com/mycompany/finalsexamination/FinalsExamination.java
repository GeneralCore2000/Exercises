package com.mycompany.finalsexamination;

import java.util.Scanner;

public class FinalsExamination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName = "";
        String firstName = "";
        String newFullName = "";
        int indexComma = 0;
        int indexLastSpace = 0;
        int choice = 0;
        int nameLength = 0;
        int numVowels = 0, numConsonants = 0;
        boolean checker1 = true;

        while (checker1) {

            System.out.println("----------------------------------------------"
                    + "---------------------------------");
            System.out.println("Name format: Surname, First Name M.I.");

            System.out.print("Enter Full Name >>: ");
            fullName = input.nextLine();

            fullName = fullName.trim();

            nameLength = fullName.length();

            if (fullName.indexOf(",") != -1) {

                if (fullName.charAt(nameLength - 1) == '.') {

                    indexComma = fullName.indexOf(",");

                    indexLastSpace = fullName.lastIndexOf(" ");

                    firstName = fullName.substring(indexComma + 1,
                            indexLastSpace);

                    firstName = firstName.trim();

                    System.out.println("--------------------------------------"
                            + "-----------------------------------------");
                    System.out.println("Welcome " + firstName + "! What can"
                            + " I do for you today?");

                    boolean checker2 = true;
                    do {

                        System.out.println("[1]Count Consonants.");
                        System.out.println("[2]Count Vowels.");
                        System.out.print(">>: ");

                        choice = input.nextInt();

                        if (choice == 1 || choice == 2) {

                            newFullName = fullName.replace(",", "");
                            newFullName = newFullName.replace(".", "");
                            newFullName = newFullName.replace(" ", "");

                            newFullName = newFullName.toLowerCase();

                            for (int i = 0; i <= newFullName.length() - 1; i++) {

                                if (newFullName.charAt(i) == 'a'
                                        || newFullName.charAt(i) == 'e'
                                        || newFullName.charAt(i) == 'i'
                                        || newFullName.charAt(i) == 'o'
                                        || newFullName.charAt(i) == 'u') {
                                    numVowels++;
                                } else {
                                    numConsonants++;
                                }

                            }

                            if (choice == 1) {
                                System.out.println("--------------------------"
                                        + "-------------------------------------"
                                        + "----------------");
                                System.out.println("Number of consonants: "
                                        + numConsonants);

                                //Set checker2 false to exit loop.
                                checker2 = false;
                            } else if (choice == 2) {
                                System.out.println("--------------------------"
                                        + "-------------------------------------"
                                        + "----------------");
                                System.out.println("Number of vowels: "
                                        + numVowels);

                                checker2 = false;
                            }
                        } else {
                            System.out.println("Invalid input. "
                                    + "Pick from choices.");
                            System.out.println("------------------------------"
                                    + "----------------------------------------"
                                    + "---------");
                        }

                    } while (checker2);

                    System.out.println("Thank you " + firstName
                            + ", Merry Christmas!");

                    System.out.println("--------------------------------------"
                            + "-----------------------------------------");

                    checker1 = false;

                } else {
                    System.out.println("Invalid name format. Re-enter name");

                }
            } else {
                System.out.println("Invalid name format. Re-enter name.");
            }
        }
    }
}
