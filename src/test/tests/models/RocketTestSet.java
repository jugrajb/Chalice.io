package tests.models;

import model.energytypes.EnergyTypeEnum;
import model.runes.Runes;
import model.weapons.heavy.HeavyWeaponInterface;
import model.weapons.heavy.rocketlauncher.BadOmens;
import model.weapons.heavy.rocketlauncher.SleepLess;
import model.weapons.heavy.rocketlauncher.ZenobiaD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RocketTestSet {
    private SleepLess sleep;
    private BadOmens bad;
    private ZenobiaD zen;

    @BeforeEach
    void beforeEachTest() {
        sleep = new SleepLess();
        bad = new BadOmens();
        zen = new ZenobiaD();
    }

    @Test
    void testGetKey(){
        assertEquals(sleep.getKey(), "sleepless");
        assertEquals(bad.getKey(), "badomens");
        assertEquals(zen.getKey(), "zenobiad");
    }

    @Test
    void testGetName(){
        assertEquals(sleep.getName(), "SleepLess");
        assertEquals(bad.getName(), "Bad Omens");
        assertEquals(zen.getName(), "Zenobia D");
    }

    @Test
    void testGetEnergyType() {
        assertEquals(EnergyTypeEnum.ARC, sleep.getEnergyType());
        assertEquals(EnergyTypeEnum.VOID, bad.getEnergyType());
        assertEquals(EnergyTypeEnum.ARC, zen.getEnergyType());
    }

    @Test
    void testGetCombination(){
        Runes comboSleep = sleep.getRuneCombination();
        Runes comboZen = zen.getRuneCombination();
        Runes comboBad = bad.getRuneCombination();
        assertEquals(comboSleep.itemName, "SleepLess");
        assertEquals(comboBad.itemName, "Bad Omens");
        assertEquals(comboZen.itemName, "Zenobia D");
    }
}
