package model.weapons.energy.fusionrifles;

import model.energytypes.EnergyTypeEnum;
import model.runes.blue.Excess;
import model.runes.green.Desire;
import model.runes.red.Cunning;
import model.runes.Runes;
import model.weapons.energy.EnergyWeaponInterface;

public class MainIngredient implements EnergyWeaponInterface {
    private static final String Name = "Main Ingredient";
    private static final String Key = "mainingredient";
    private Runes combination;
    private EnergyTypeEnum energyType = EnergyTypeEnum.ARC;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/b0fe53213ec8698ed6e3308df5030a1e.jpg";

    public MainIngredient() {
        this.combination = new Runes(Name, new Excess(), new Cunning(), new Desire(), image);
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
