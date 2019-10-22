package model.weapons.energy.snipers;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.purple.Jubilation;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class Beloved implements EnergyWeaponInterface {
    private static final String Name = "Beloved";
    private static final String Key = "beloved";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/a804c23a5ad568efe4da68911bacd263.jpg";

    public Beloved() {
        this.combination = new Runes(Name, new Jubilation(), new Ambition(), new Desire(), image);
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
