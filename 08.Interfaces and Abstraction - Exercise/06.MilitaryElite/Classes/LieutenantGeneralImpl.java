package MilitaryElite_06.Classes;

import MilitaryElite_06.Interfaces.LieutenantGeneral;
import MilitaryElite_06.Interfaces.Private;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }


    @Override
    public List<PrivateImpl> getPrivates() {
        return privates;
    }

    @Override
    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name: %s %s Id: %d Salary: %.02f",
                super.getFirstName(),super.getLastName(),super.getId(),super.getSalary()));
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Privates:");
        stringBuilder.append(System.lineSeparator());

        this.getPrivates().sort((o1, o2) -> Integer.compare(o2.getId(),o1.getId()));
        for (Private aPrivate : getPrivates()) {
            stringBuilder.append(aPrivate.toString());
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();

    }
}
