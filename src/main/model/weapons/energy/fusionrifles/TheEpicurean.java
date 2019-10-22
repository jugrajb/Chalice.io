package model.weapons.energy.fusionrifles;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Excess;
import model.runes.green.Desire;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class TheEpicurean implements EnergyWeaponInterface {
    private static final String Name = "The Epicurean";
    private static final String Key = "theepicurean";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.VOID;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/da8107405a56d6e10b0612d5c5fe7440.jpg";

    public TheEpicurean() {
        this.combination = new Runes(Name, new Excess(), new Ambition(), new Desire(), image);
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
