package model.controller;

import exceptions.*;
import model.runes.Runes;
import model.weapons.energy.Energy;

public class WeaponEnergyController {
    private Energy energy;

    public WeaponEnergyController() {
        energy = new Energy();
    }

    public Runes getHandCannon(String item) throws WeaponNotFoundException {
        return checkIfFound(energy.selectHandCannon(item));
    }

    public Runes getSniper(String item) throws WeaponNotFoundException {
        return checkIfFound(energy.selectSniper(item));
    }

    public Runes getSideArm(String item) throws WeaponNotFoundException {
        return checkIfFound(energy.selectSideArm(item));
    }

    public Runes getShotGun(String item) throws WeaponNotFoundException {
        return checkIfFound(energy.selectShotGun(item));
    }

    public Runes getSmg(String item) throws WeaponNotFoundException {
        return checkIfFound(energy.selectSubMachineGun(item));
    }

    public Runes getFusionRifle(String item) throws WeaponNotFoundException {
        return checkIfFound(energy.selectFusionRifle(item));
    }

    private Runes checkIfFound(Runes item) throws WeaponNotFoundException {
        if (item == null) {
            throw new WeaponNotFoundException();
        }
        return item;
    }
}
