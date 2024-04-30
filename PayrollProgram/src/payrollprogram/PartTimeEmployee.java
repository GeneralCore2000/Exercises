package payrollprogram;

public class PartTimeEmployee extends Employee {

    private double ratePerHour = 0.0;
    private int hoursWorked = 0; //ratePerHour * hoursWorked = wage
    private double wage = 0;

    public double getWage() {
        return wage = ratePerHour * hoursWorked;
    }

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }
}
