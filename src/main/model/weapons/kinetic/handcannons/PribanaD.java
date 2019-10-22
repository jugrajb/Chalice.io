package model.weapons.kinetic.handcannons;

import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class PribanaD implements KineticWeaponInterface {
    private static final String Name = "Pribana D";
    private static final String Key = "pibanad";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/91ca86b2cb3da4b0b4bc0eff77aae522.jpg";

    public PribanaD() {
        this.combination = new Runes(Name, new Desire(), new Wealth(), new Desire(), image);
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
