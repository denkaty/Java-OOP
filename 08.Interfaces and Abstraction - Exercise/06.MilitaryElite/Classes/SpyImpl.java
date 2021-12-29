package MilitaryElite_06.Classes;

import MilitaryElite_06.Interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%n" +
                        "Code Number: %s",
                super.getFirstName(),super.getLastName(),super.getId(),
                this.getCodeNumber());
    }
}
