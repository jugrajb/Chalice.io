package model.controller;

import model.runes.Runes;
import model.weapons.heavy.Heavy;

public class WeaponHeavyController {
    private Heavy heavy;


    public WeaponHeavyController() {
        heavy = new Heavy();
    }

    public Runes getMachineGun(String item) {
        return heavy.selectMachineGun(item);
    }

    public Runes getRockets(String item) {
        return heavy.selectRocket(item);
    }
}
