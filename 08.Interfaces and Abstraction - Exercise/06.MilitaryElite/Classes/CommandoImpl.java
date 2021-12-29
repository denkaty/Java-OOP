package MilitaryElite_06.Classes;

import MilitaryElite_06.Enums.Corp;
import MilitaryElite_06.Interfaces.Commando;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new LinkedHashSet<>();
    }


    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Set<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Name: %s %s Id: %d Salary: %.02f",
                super.getFirstName(), super.getLastName(), super.getId(), super.getSalary()));
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append(String.format("Corps: %s", super.getCorp().getName()));
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Missions:");
        stringBuilder.append(System.lineSeparator());

        for (Mission mission : this.getMissions()) {
            stringBuilder.append(mission.toString());
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}
