package model.weapons.heavy.rocketlauncher;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.purple.Jubilation;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.heavy.HeavyWeaponInterface;

public class BadOmens implements HeavyWeaponInterface {
    private static final String Name = "Bad Omens";
    private static final String Key = "badomens";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.VOID;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/d7a9848f2de9f598fe8aae242937a5d3.jpg";

    public BadOmens() {
        this.combination = new Runes(Name, new Ambition(), new Jubilation(), new Desire(), image);
    }

    public String getName() {
        return Name;
    }

    public String getKey() {
        return Key;
    }

    public Runes getRuneCombination() {
        return combination;
    }

    public EnergyTypeEnum getEnergyType() {
        return energyType;
    }
}
