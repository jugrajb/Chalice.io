package tests.controllers;

import model.controller.WeaponHeavyController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeavyControllerTestSet {
    private WeaponHeavyController whc;

    @BeforeEach
    void beforeEachTest() {
        whc = new WeaponHeavyController();
    }

    @Test
    void testGetMachineGun(){
        assertEquals("Fixed Odds", whc.getMachineGun("fixedodds").itemName);
    }

    @Test
    void testGetRockets(){
        assertEquals("Bad Omens", whc.getRockets("badomens").itemName);
    }

}
