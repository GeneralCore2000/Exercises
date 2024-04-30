package payrollprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunEmployee {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String tempName = "", choice = "", tempSalary = "";

    public RunEmployee() {
        System.out.println("======================================");
        System.out.println("             Simple Payroll");
        System.out.println("======================================");
        System.out.print("Enter name >>: ");
        try {
            tempName = br.readLine();
        } catch (Exception e) {
        }

        System.out.print("Are they [P]art time or [F]ull time?\n>>: ");
        try {
            choice = br.readLine().toLowerCase().trim();
        } catch (Exception e) {
        }

        if (choice.equals("")) {
            System.out.println("Input cannot be empty.");
        } else if (choice.charAt(0) == 'p') {
            typeOfWork("p");
        } else if (choice.charAt(0) == 'f') {
            typeOfWork("f");
        } else {
            System.out.println("Pick from choices only.");
        }
    }

    public void typeOfWork(String chosenTypeOfWork) {
        boolean hasNoForeignCharacter = true;
        switch (chosenTypeOfWork) {
            case "f":
                for (int i = 0; i < choice.length(); i++) {
                    if (choice.charAt(i) == 'f') {
                        hasNoForeignCharacter = false;
                        monthlySalaryCalculate();
                        break;
                    } else {
                        break;
                    }
                }
                if (hasNoForeignCharacter == true) {
                    for (int i = 0; i < choice.length(); i++) {
                        if (choice.charAt(i) == 'u') {
                            if (choice.substring(i - 1).equals("full") || 
                                choice.substring(i - 1).equals("full time")) {
                                monthlySalaryCalculate();
                                break;
                            } else {
                                System.out.println("Enter from choices only.");
                                break;
                            }
                        }
                    }
                }
                break;
            case "p":
                for (int i = 0; i < choice.length(); i++) {
                    if (choice.charAt(i) == 'p') {
                        hasNoForeignCharacter = false;
                        salaryCalculate();
                        break;
                    } else {
                        break;
                    }
                }
                if (hasNoForeignCharacter == true) {
                    for (int i = 1; i < choice.length(); i++) {
                        if (choice.charAt(i) == 'a') {
                            if (choice.substring(i - 1).equals("part") || 
                                choice.substring(i - 1).equals("part time")) {
                                salaryCalculate();
                            } else {
                                System.out.println("Please pick from choices.");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public void monthlySalaryCalculate() {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setName(tempName);
        tempName = "";
        System.out.print("Enter salary per month >>: ");
        try {
            fte.setMonthlySalary(Double.parseDouble(br.readLine()));
        } catch (Exception e) {
        }
        System.out.println("======================================");
        fte.getName();
        if (fte.getMonthlySalary() % 1 == 0) {
            System.out.printf("Salary: %,.0f\n", fte.getMonthlySalary());
        } else {
            System.out.printf("Salary: %,.2f\n", fte.getMonthlySalary());
        }
    }

    public void salaryCalculate() {
        PartTimeEmployee pte = new PartTimeEmployee();
        double tempRatePerHour = 0;
        int tempHoursWorked = 0;
        pte.setName(tempName);
        tempName = "";
        System.out.print("Enter rate per hour and no. of hours work\n"
                + "separated by comma.\n"
                + "Sample: 195, 8\n"
                + ">>: ");
        try {
            tempSalary = br.readLine();
        } catch (Exception e) {
        }

        for (int i = 0; i < tempSalary.length(); i++) {
            if (tempSalary.charAt(i) == ',') {
                tempRatePerHour = Double.parseDouble(
                        tempSalary.substring(0, i));
                tempHoursWorked = Integer.parseInt(
                        tempSalary.substring(i + 2, tempSalary.length()));
                pte.setWage(tempRatePerHour, tempHoursWorked);
                System.out.println("======================================");
                pte.getName();
                if (pte.getWage() % 1 == 0) {
                    System.out.printf("Wage: %,.0f\n", pte.getWage());
                } else {
                    System.out.printf("Wage: %,.2f\n", pte.getWage());
                }
            }
        }
    }

    public static void main(String[] args) {
        new RunEmployee();
    }
}
