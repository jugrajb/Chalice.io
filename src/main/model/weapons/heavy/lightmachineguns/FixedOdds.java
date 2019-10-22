package model.weapons.heavy.lightmachineguns;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Wealth;
import model.runes.green.Pride;
import model.runes.red.Ambition;
import model.runes.Runes;
import model.weapons.heavy.HeavyWeaponInterface;

public class FixedOdds implements HeavyWeaponInterface {
    private static final String name = "Fixed Odds";
    private static final String key = "fixedodds";
    private static final String image = "https://www.bungie.net/common/destiny2_content/icons/64f8f783ffec48fa584b32bbc373cf2a.jpg";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;

    public FixedOdds() {
        this.combination = new Runes(name, new Ambition(), new Wealth(), new Pride(), image);
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public Runes getRuneCombination() {
        return combination;
    }

    public EnergyTypeEnum getEnergyType() {
        return energyType;
    }
}
