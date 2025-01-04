package taskperformance;

import java.util.Scanner;

public class TaskPerformance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fullName = "", firstName = "", smallLetters = "";
        int punctuation = 0, choice = 0, consonant = 0, vowel = 0;
        boolean start = true;

        System.out.println("----------------------------------------------------");
        while (start) {
            System.out.println("Name Format: Surname, First Name Middle.");
            System.out.print("Enter Name >>: ");
            fullName = in.nextLine().trim();

            for (int i = 0; i < fullName.length(); i++) {
                if (fullName.lastIndexOf('.') != -1) {
                    if (fullName.charAt(i) == ',') {
                        punctuation++;
                    }
                }
            }
            while (start) {
                if (punctuation == 1) {
                    firstName = fullName.substring(fullName.indexOf(',') + 1, fullName.lastIndexOf(' '));

                    for (int i = 0; i < fullName.length(); i++) {
                        smallLetters = fullName.toLowerCase();
                        if (smallLetters.charAt(i) == 'a'
                                || smallLetters.charAt(i) == 'e'
                                || smallLetters.charAt(i) == 'i'
                                || smallLetters.charAt(i) == 'o'
                                || smallLetters.charAt(i) == 'u') {
                            vowel++;
                        } else if (smallLetters.charAt(i) >= 'a' && smallLetters.charAt(i) <= 'z') {
                            consonant++;
                        }
                    }
                    System.out.println("Welcome" + firstName + " Merry Christmas!");
                    System.out.println("----------------------------------------------------");
                    System.out.print("[1]Count Consonants [2]Count Vowels >>: ");
                    choice = in.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Number of consonants: " + consonant);
                            start = false;
                            break;
                        case 2:
                            System.out.println("Number of vowels: " + vowel);
                            start = false;
                            break;
                        default:
                            System.out.println("Invalid input. Select from the choices.");
                            System.out.println("----------------------------------------------------");
                            break;
                    }

                } else {
                    System.out.println("Invalid input. Enter Correct Name Format.");
                    System.out.println("----------------------------------------------------");
                }
            }
        }
    }
}
