package model.weapons.heavy.rocketlauncher;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.purple.Jubilation;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.heavy.HeavyWeaponInterface;

public class ZenobiaD implements HeavyWeaponInterface {
    private static final String Name = "Zenobia D";
    private static final String Key = "zenobiad";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/b390cac46aea226353e07e07f6cc6f2d.jpg";

    public ZenobiaD() {
        this.combination = new Runes(Name, new Ambition(), new Jubilation(), new Desire(), image);
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
