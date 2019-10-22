package model.weapons.energy.sidearms;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.green.Pride;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class LastDance implements EnergyWeaponInterface {
    private static final String Name = "Last Dance";
    private static final String Key = "lastdance";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/e1ad2683c69e93c1e3cf9f41f98858e6.jpg";

    public LastDance() {
        this.combination = new Runes(Name, new Pride(), new Ambition(), new Desire(), image);
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
