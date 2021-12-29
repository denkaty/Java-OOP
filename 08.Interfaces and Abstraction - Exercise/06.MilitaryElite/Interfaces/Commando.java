package MilitaryElite_06.Interfaces;

import MilitaryElite_06.Classes.Mission;

import java.util.Collection;

public interface Commando {


    void addMission(Mission mission);

    Collection<Mission> getMissions();
}
