package model.weapons.energy.sidearms;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.green.Pride;
import model.runes.green.War;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class AnonymousAutumn implements EnergyWeaponInterface {
    private static final String Name = "Anonymous Autumn";
    private static final String Key = "anonymousautumn";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/a33d4e17977cb5b47499709213a19e35.jpg";

    public AnonymousAutumn() {
        this.combination = new Runes(Name, new Pride(), new War(), new Desire(), image);
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
