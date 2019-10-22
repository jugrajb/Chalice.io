package model.weapons.energy.sidearms;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.green.Pride;
import model.runes.purple.Joy;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class Drang implements EnergyWeaponInterface {
    private static final String Name = "Drang";
    private static final String Key = "drang";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/682960ff3c1cb34f439c08ebfb38db68.jpg";

    public Drang() {
        this.combination = new Runes(Name, new Pride(), new Joy(), new Desire(), image);
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
