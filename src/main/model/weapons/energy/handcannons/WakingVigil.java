package model.weapons.energy.handcannons;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.green.War;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class WakingVigil implements EnergyWeaponInterface {
    private static final String Name = "Waking Vigil";
    private static final String Key = "wakingvigil";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/4714cdb1cbe8054afe541aace1abb9d1.jpg";

    public WakingVigil() {
        this.combination = new Runes(Name, new Desire(), new War(), new War(), image);
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
