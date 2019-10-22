package tests.models;

import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;
import model.weapons.kinetic.submachineguns.HardTruths;
import model.weapons.kinetic.submachineguns.TracklessWaste;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubMachineGunsTestSet {
    private KineticWeaponInterface ht;
    private KineticWeaponInterface tw;

    @BeforeEach
    void beforeEachTest() {
        ht = new HardTruths();
        tw = new TracklessWaste();
    }

    @Test
    void testGetKey(){
        assertEquals(ht.getKey(), "hardtruths");
        assertEquals(tw.getKey(), "tracklesswaste");
    }

    @Test
    void testGetName(){
        assertEquals(ht.getName(), "Hard Truths");
        assertEquals(tw.getName(), "Trackless Waste");
    }

    @Test
    void testGetCombination(){
        Runes comboAus = ht.getCombination();
        Runes comboTrust = tw.getCombination();
        assertEquals(comboAus.itemName, "Hard Truths");
        assertEquals(comboTrust.itemName, "Trackless Waste");
    }
}
