package tests.models;

import model.energytypes.EnergyTypeEnum;
import model.weapons.heavy.lightmachineguns.FixedOdds;
import model.weapons.heavy.rocketlauncher.BadOmens;
import model.weapons.heavy.rocketlauncher.SleepLess;
import model.weapons.heavy.rocketlauncher.ZenobiaD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeavyWeaponTestSet {
    @Test
    public void testLmg() {
        FixedOdds fo = new FixedOdds();

        assertEquals("fixedodds", fo.getKey());
        assertEquals("Fixed Odds", fo.getName());
        assertEquals(EnergyTypeEnum.SOLAR, fo.getEnergyType());
    }

    @Test
    public void testRockets() {
        BadOmens bo = new BadOmens();
        SleepLess sl = new SleepLess();
        ZenobiaD zd = new ZenobiaD();

        assertEquals("badomens", bo.getKey());
        assertEquals("Bad Omens", bo.getName());
        assertEquals(EnergyTypeEnum.VOID, bo.getEnergyType());

        assertEquals("sleepless", sl.getKey());
        assertEquals("SleepLess", sl.getName());
        assertEquals(EnergyTypeEnum.ARC, sl.getEnergyType());

        assertEquals("zenobiad", zd.getKey());
        assertEquals("Zenobia D", zd.getName());
        assertEquals(EnergyTypeEnum.ARC, zd.getEnergyType());
    }
}
