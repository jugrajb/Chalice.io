package model.weapons.energy.snipers;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Pride;
import model.runes.green.War;
import model.runes.purple.Jubilation;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class FateCriesFoul implements EnergyWeaponInterface {
    private final String name = "Fate Cries Foul";
    private final String key = "fatecriesfoul";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.VOID;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/b7df307c3eb9f4638ec102f1640fe33a.jpg";

    public FateCriesFoul() {
        this.combination = new Runes(name, new Jubilation(), new War(), new Pride(), image);
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public Runes getCombination() {
        return combination;
    }

    public EnergyTypeEnum getEnergyType() {
        return energyType;
    }
}
