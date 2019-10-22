package model.controller;

import exceptions.*;
import model.runes.Runes;
import model.weapons.kinetic.Kinetic;

public class WeaponKineticController {
    private Kinetic kinetic;

    public WeaponKineticController() {
        kinetic = new Kinetic();
    }

    public Runes getHandCannon(String item) throws WeaponNotFoundException {
        return checkIfFound(kinetic.selectHandCannon(item));
    }

    public Runes getSniper(String item) throws WeaponNotFoundException {
        return checkIfFound(kinetic.selectSniper(item));
    }

    public Runes getSideArm(String item) throws WeaponNotFoundException {
        return checkIfFound(kinetic.selectSideArm(item));
    }

    public Runes getShotGun(String item) throws WeaponNotFoundException {
        return checkIfFound(kinetic.selectShotGun(item));
    }

    public Runes getSmg(String item) throws WeaponNotFoundException {
        return checkIfFound(kinetic.selectSubMachineGun(item));
    }

    private Runes checkIfFound(Runes item) throws WeaponNotFoundException {
        if (item == null) {
            throw new WeaponNotFoundException();
        }
        return item;
    }
}
