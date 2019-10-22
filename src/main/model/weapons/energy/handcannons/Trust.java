package model.weapons.energy.handcannons;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.purple.Joy;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class Trust implements EnergyWeaponInterface {
    private static final String Name = "Trust";
    private static final String Key = "trust";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/09d614a6136d68995331620f1e208293.jpg";

    public Trust() {
        this.combination = new Runes(Name, new Desire(), new Joy(), new Desire(), image);
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

    public EnergyTypeEnum getEnergyType() {
        return energyType;
    }
}
