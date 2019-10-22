package tests.controllers;

import model.controller.WeaponEnergyController;
import exceptions.WeaponNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnergyControllerTestSet {
    private WeaponEnergyController wkc;

    @BeforeEach
    void beforeEachTest() {
        wkc = new WeaponEnergyController();
    }

    @Test
    void testGetSHC() throws WeaponNotFoundException {
        assertEquals("Trust", wkc.getHandCannon("trust").itemName);
    }

    @Test
    void testGetSSn() throws WeaponNotFoundException {
        assertEquals("Fate Cries Foul", wkc.getSniper("fatecriesfoul").itemName);
    }

    @Test
    void testGetSSh() throws WeaponNotFoundException {
        assertEquals("BadLander", wkc.getShotGun("badlander").itemName);
    }

    @Test
    void testGetSSMG() throws WeaponNotFoundException {
        assertEquals("Bad Reputation", wkc.getSmg("badreputation").itemName);
    }

    @Test
    void testGetSSd() throws WeaponNotFoundException {
        assertEquals("Drang", wkc.getSideArm("drang").itemName);
    }

    @Test
    void testGetFus() throws WeaponNotFoundException {
        assertEquals("Main Ingredient", wkc.getFusionRifle("mainingredient").itemName);
    }
}
