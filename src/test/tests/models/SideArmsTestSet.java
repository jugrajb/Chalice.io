package tests.models;

import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;
import model.weapons.kinetic.sidearms.SmugglersWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SideArmsTestSet {
    private KineticWeaponInterface side;

    @BeforeEach
    void beforeEachTest() {
        side = new SmugglersWord();
    }

    @Test
    void testGetKey(){
        assertEquals(side.getKey(), "smugglersword");
    }

    @Test
    void testGetName(){
        assertEquals("Smugglers Word", side.getName());
    }

    @Test
    void testGetCombination(){
        Runes comboSide = side.getCombination();
        assertEquals(comboSide.itemName, "Smugglers Word");
    }
}
