package model.weapons.heavy.rocketlauncher;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.heavy.HeavyWeaponInterface;

public class SleepLess implements HeavyWeaponInterface {
    private static final String Name = "SleepLess";
    private static final String Key = "sleepless";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/695c080677c65b29cc9df802236ceed5.jpg";

    public SleepLess() {
        this.combination = new Runes(Name, new Ambition(), new Desire(), new Desire(), image);
    }

    public String getName() {
        return Name;
    }

    public String getKey() {
        return Key;
    }

    public Runes getRuneCombination() {
        return combination;
    }

    public EnergyTypeEnum getEnergyType() {
        return energyType;
    }
}
