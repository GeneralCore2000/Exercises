package payrollprogram;

public class FullTimeEmployee extends Employee {

    private double monthlySalary = 0.0;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
