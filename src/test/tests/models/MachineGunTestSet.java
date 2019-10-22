package tests.models;

import model.energytypes.EnergyTypeEnum;
import model.runes.Runes;
import model.weapons.heavy.HeavyWeaponInterface;
import model.weapons.heavy.lightmachineguns.FixedOdds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MachineGunTestSet {
    private FixedOdds fixedOdds;

    @BeforeEach
    void beforeEachTest() {
        fixedOdds = new FixedOdds();
    }

    @Test
    void testGetKey(){
        assertEquals(fixedOdds.getKey(), "fixedodds");
    }

    @Test
    void testGetName(){
        assertEquals(fixedOdds.getName(), "Fixed Odds");
    }

    @Test
    void testGetCombination(){
        Runes comboAus = fixedOdds.getRuneCombination();
        assertEquals(comboAus.itemName, "Fixed Odds");
    }

    @Test
    void testEnergyType(){
        assertEquals(EnergyTypeEnum.SOLAR, fixedOdds.getEnergyType());
    }


}
