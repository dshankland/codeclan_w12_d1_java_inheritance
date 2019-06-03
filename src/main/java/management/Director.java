package management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String nInumber, double salary, double budget) {
        super(name, nInumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus() {
        return 2 * (getSalary() / 100);
    }
}
