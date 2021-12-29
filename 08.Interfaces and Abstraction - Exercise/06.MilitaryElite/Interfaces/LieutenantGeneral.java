package MilitaryElite_06.Interfaces;

import MilitaryElite_06.Classes.PrivateImpl;

import java.util.List;

public interface LieutenantGeneral {

   List<PrivateImpl> getPrivates();

    void addPrivate(PrivateImpl priv);

}
