package model.weapons.energy.shotguns;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.purple.Joy;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class BadLander implements EnergyWeaponInterface {
    private static final String Name = "BadLander";
    private static final String Key = "badlander";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/485f97f5a08c48161dcceda89fed1651.jpg";

    public BadLander() {
        this.combination = new Runes(Name, new Wealth(), new Joy(), new Desire(), image);
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
