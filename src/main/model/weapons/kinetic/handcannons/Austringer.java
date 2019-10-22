package model.weapons.kinetic.handcannons;

import model.runes.green.Desire;
import model.runes.red.Cunning;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class Austringer implements KineticWeaponInterface {
    private static final String Name = "Austringer";
    private static final String Key = "austringer";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/2f8c0b28a374749c19e3f90e5a69f371.jpg";

    public Austringer() {
        this.combination = new Runes(Name, new Desire(), new Cunning(), new Desire(), image);
    }

    public String getName() {
        return Name;
    }

    public String getKey() {
        return Key;
    }

    public Runes getCombination() {
        return combination;
    }
}
