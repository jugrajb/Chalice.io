package tests.models;

import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;
import model.weapons.kinetic.shotguns.DustRockBlues;
import model.weapons.kinetic.shotguns.ImperialDecree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShotGunTestSet {
    private KineticWeaponInterface drb;
    private KineticWeaponInterface id;

    @BeforeEach
    void beforeEachTest() {
        drb = new DustRockBlues();
        id = new ImperialDecree();
    }

    @Test
    void testGetKey(){
        assertEquals(drb.getKey(), "dustrockblues");
        assertEquals(id.getKey(), "imperialdecree");
    }

    @Test
    void testGetName(){
        assertEquals(drb.getName(), "Dust Rock Blues");
        assertEquals(id.getName(), "Imperial Decree");
    }

    @Test
    void testGetCombination(){
        Runes comboDRB = drb.getCombination();
        Runes comboID = id.getCombination();
        assertEquals(comboDRB.itemName, "Dust Rock Blues");
        assertEquals(comboID.itemName, "Imperial Decree");
    }
}

