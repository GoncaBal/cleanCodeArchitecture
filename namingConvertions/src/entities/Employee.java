package entities;

public class Employee extends Person{
    private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int birthOfYear, String nationalIdentity, double salary) {
        super(id, firstName, lastName, birthOfYear, nationalIdentity);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
