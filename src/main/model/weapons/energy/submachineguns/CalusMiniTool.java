package model.weapons.energy.submachineguns;

import model.energytypes.EnergyTypeEnum;
import model.runes.green.Desire;
import model.runes.purple.Beast;
import model.runes.purple.Jubilation;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class CalusMiniTool implements EnergyWeaponInterface {
    private static final String Name = "Calus Mini-Tool";
    private static final String Key = "calusminitool";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.SOLAR;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/982d64221a581063992ddc9aa6c32a85.jpg";

    public CalusMiniTool() {
        this.combination = new Runes(Name, new Beast(), new Jubilation(), new Desire(), image);
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
