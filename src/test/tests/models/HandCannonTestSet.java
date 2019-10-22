package tests.models;

import model.runes.Runes;
import model.weapons.kinetic.handcannons.Austringer;
import model.weapons.kinetic.handcannons.PribanaD;
import model.weapons.kinetic.KineticWeaponInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandCannonTestSet {
    private KineticWeaponInterface aus;
    private KineticWeaponInterface pd;

    @BeforeEach
    void beforeEachTest() {
        aus = new Austringer();
        pd = new PribanaD();
    }

    @Test
    void testGetKey(){
        assertEquals(aus.getKey(), "austringer");
        assertEquals(pd.getKey(), "pibanad");
    }

    @Test
    void testGetName(){
        assertEquals(aus.getName(), "Austringer");
        assertEquals(pd.getName(), "Pribana D");
    }

    @Test
    void testGetCombination(){
        Runes comboAus = aus.getCombination();
        Runes comboTrust = pd.getCombination();
        assertEquals(comboAus.itemName, "Austringer");
        assertEquals(comboTrust.itemName, "Pribana D");
    }
}
