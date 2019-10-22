package model.weapons.energy.submachineguns;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.purple.Beast;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class BadReputation implements EnergyWeaponInterface {
    private static final String Name = "Bad Reputation";
    private static final String Key = "badreputation";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/cf7686ea1020e77ddec4c222eb793617.jpg";

    public BadReputation() {
        this.combination = new Runes(Name, new Beast(), new Wealth(), new Desire(), image);
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
