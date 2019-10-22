package model.weapons.energy.fusionrifles;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Excess;
import model.runes.green.Desire;
import model.runes.purple.Joy;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class ProeliumFR3 implements EnergyWeaponInterface {
    private static final String Name = "Proelium FR3";
    private static final String Key = "proeliumfr3";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/ecce6ce0eb045afaf76d5494edecebbe.jpg";

    public ProeliumFR3() {
        this.combination = new Runes(Name, new Excess(), new Joy(), new Desire(), image);
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
