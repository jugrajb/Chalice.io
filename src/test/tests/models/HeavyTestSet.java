package tests.models;

import model.runes.Runes;
import model.weapons.heavy.Heavy;
import model.weapons.heavy.HeavyWeaponInterface;
import model.weapons.heavy.lightmachineguns.FixedOdds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeavyTestSet {
    private Heavy heavy;

    @BeforeEach
    public void beforeEachTest() {
        this.heavy = new Heavy();
    }

    @Test
    public void getSelectMachineGuns() {
        Runes item = heavy.selectMachineGun("fixedodds");
        assertEquals("Fixed Odds", item.itemName);
    }

    @Test
    public void selectMachineGun() {
        Runes item = heavy.selectRocket("sleepless");
        assertEquals("SleepLess", item.itemName);
    }
}

