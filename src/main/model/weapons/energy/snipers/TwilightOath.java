package model.weapons.energy.snipers;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.purple.Jubilation;
import model.runes.red.Cunning;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class TwilightOath implements EnergyWeaponInterface {
    private static final String Name = "Twilight Oath";
    private static final String Key = "twilightoath";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/6f9a8cf53dbf5085375552260f5ee2fd.jpg";

    public TwilightOath() {
        this.combination = new Runes(Name, new Jubilation(), new Cunning(), new Desire(), image);
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
