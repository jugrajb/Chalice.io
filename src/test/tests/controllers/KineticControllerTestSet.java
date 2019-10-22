package tests.controllers;

import model.controller.WeaponKineticController;
import exceptions.WeaponNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KineticControllerTestSet {
    private WeaponKineticController wkc;

    @BeforeEach
    void beforeEachTest() {
        wkc = new WeaponKineticController();
    }

    @Test
    void testGetSHC() throws WeaponNotFoundException {
        assertEquals("Austringer", wkc.getHandCannon("austringer").itemName);
    }

    @Test
    void testGetSSn() throws WeaponNotFoundException {
        assertEquals("Dreaded Venture", wkc.getSniper("dreadedventure").itemName);
    }

    @Test
    void testGetSSh() throws WeaponNotFoundException {
        assertEquals("Dust Rock Blues", wkc.getShotGun("dustrockblues").itemName);
    }

    @Test
    void testGetSSMG() throws WeaponNotFoundException {
        assertEquals("Hard Truths", wkc.getSmg("hardtruths").itemName);
    }

    @Test
    void testGetSSd() throws WeaponNotFoundException {
        assertEquals("Smugglers Word", wkc.getSideArm("smugglersword").itemName);
    }

}
