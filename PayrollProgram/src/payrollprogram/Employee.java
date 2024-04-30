package payrollprogram;

abstract class Employee {

    private String name = "";

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
