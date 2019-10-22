package model.weapons.energy.fusionrifles;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Excess;
import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class ErentilFR4 implements EnergyWeaponInterface {
    private static final String Name = "Erentil FR4";
    private static final String Key = "erentilfr4";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.VOID;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/a54b9d49269f6bc59a1f79622d247af9.jpg";

    public ErentilFR4() {
        this.combination = new Runes(Name, new Excess(), new Wealth(), new Desire(), image);
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
