package model.weapons.energy;

import model.energytypes.EnergyTypeEnum;
import model.runes.Runes;

public interface EnergyWeaponInterface {
    public String getName();

    public String getKey();

    public Runes getCombination();

    public EnergyTypeEnum getEnergyType();
}
