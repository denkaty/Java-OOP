package MilitaryElite_06.Classes;

import MilitaryElite_06.Enums.Corp;
import MilitaryElite_06.Interfaces.Egineer;

import java.util.*;

public class EngineerImpl extends SpecialisedSoldierImpl implements Egineer {
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public Collection<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Name: %s %s Id: %d Salary: %.02f",
                super.getFirstName(),super.getLastName(),super.getId(),super.getSalary()));
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append(String.format("Corps: %s",super.getCorp().getName()));
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Repairs:");
        stringBuilder.append(System.lineSeparator());

        for (Repair repair : this.getRepairs()) {
            stringBuilder.append(repair.toString());
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();


    }
}
