package MilitaryElite_06.Interfaces;

import MilitaryElite_06.Classes.Repair;

import java.util.Collection;


public interface Egineer {

    Collection<Repair> getRepairs();

    void addRepair(Repair repair);

}
