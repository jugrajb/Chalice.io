package tests.models;

import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;
import model.weapons.kinetic.snipers.DreadedVenture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnipersTestSet {
    private KineticWeaponInterface dv;

    @BeforeEach
    void beforeEachTest() {
        dv = new DreadedVenture();
    }

    @Test
    void testGetKey(){
        assertEquals(dv.getKey(), "dreadedventure");
    }

    @Test
    void testGetName(){
        assertEquals("Dreaded Venture", dv.getName());
    }

    @Test
    void testGetCombination(){
        Runes comboAus = dv.getCombination();
        assertEquals(comboAus.itemName, "Dreaded Venture");
    }
}
