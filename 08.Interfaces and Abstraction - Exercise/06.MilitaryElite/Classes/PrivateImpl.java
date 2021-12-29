package MilitaryElite_06.Classes;

import MilitaryElite_06.Interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d Salary: %.02f",
                super.getFirstName(),super.getLastName(),super.getId(),this.getSalary());

    }
}
