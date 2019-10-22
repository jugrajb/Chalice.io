package tests.models;

import model.energytypes.EnergyTypeEnum;
import model.runes.Runes;
import model.weapons.energy.Energy;
import model.weapons.energy.fusionrifles.ErentilFR4;
import model.weapons.energy.fusionrifles.MainIngredient;
import model.weapons.energy.fusionrifles.ProeliumFR3;
import model.weapons.energy.fusionrifles.TheEpicurean;
import model.weapons.energy.handcannons.Trust;
import model.weapons.energy.handcannons.WakingVigil;
import model.weapons.energy.shotguns.BadLander;
import model.weapons.energy.sidearms.AnonymousAutumn;
import model.weapons.energy.sidearms.Drang;
import model.weapons.energy.sidearms.LastDance;
import model.weapons.energy.snipers.Beloved;
import model.weapons.energy.snipers.FateCriesFoul;
import model.weapons.energy.snipers.TwilightOath;
import model.weapons.energy.submachineguns.BadReputation;
import model.weapons.energy.submachineguns.CalusMiniTool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnergyTestSet {
    private Energy e;

    @BeforeEach
    public void before() {
        e = new Energy();
    }

    @Test
    public void testFusionRifles() {
        ErentilFR4 fr4 = new ErentilFR4();
        MainIngredient m = new MainIngredient();
        ProeliumFR3 fr3 = new ProeliumFR3();
        TheEpicurean te = new TheEpicurean();

        assertEquals("erentilfr4", fr4.getKey());
        assertEquals("Erentil FR4", fr4.getName());
        assertEquals(EnergyTypeEnum.VOID, fr4.getEnergyType());

        assertEquals("mainingredient", m.getKey());
        assertEquals("Main Ingredient", m.getName());
        assertEquals(EnergyTypeEnum.ARC, m.getEnergyType());

        assertEquals("theepicurean", te.getKey());
        assertEquals("The Epicurean", te.getName());
        assertEquals(EnergyTypeEnum.VOID, te.getEnergyType());

        assertEquals("proeliumfr3", fr3.getKey());
        assertEquals("Proelium FR3", fr3.getName());
        assertEquals(EnergyTypeEnum.SOLAR, fr3.getEnergyType());
    }

    @Test
    public void testHandCannons() {
        Trust t =new Trust();
        WakingVigil wv = new WakingVigil();

        assertEquals("trust", t.getKey());
        assertEquals("Trust", t.getName());
        assertEquals(EnergyTypeEnum.SOLAR, t.getEnergyType());

        assertEquals("wakingvigil", wv.getKey());
        assertEquals("Waking Vigil", wv.getName());
        assertEquals(EnergyTypeEnum.ARC, wv.getEnergyType());
    }

    @Test
    public void testSnipers() {
        Beloved b = new Beloved();
        FateCriesFoul f = new FateCriesFoul();
        TwilightOath t = new TwilightOath();

        assertEquals("beloved", b.getKey());
        assertEquals("Beloved", b.getName());
        assertEquals(EnergyTypeEnum.SOLAR, b.getEnergyType());

        assertEquals("fatecriesfoul", f.getKey());
        assertEquals("Fate Cries Foul", f.getName());
        assertEquals(EnergyTypeEnum.VOID, f.getEnergyType());

        assertEquals("twilightoath", t.getKey());
        assertEquals("Twilight Oath", t.getName());
        assertEquals(EnergyTypeEnum.ARC, t.getEnergyType());
    }

    @Test
    public void testSidearms() {
        AnonymousAutumn a = new AnonymousAutumn();
        Drang d = new Drang();
        LastDance ld = new LastDance();

        assertEquals("anonymousautumn", a.getKey());
        assertEquals("Anonymous Autumn", a.getName());
        assertEquals(EnergyTypeEnum.SOLAR, a.getEnergyType());

        assertEquals("drang", d.getKey());
        assertEquals("Drang", d.getName());
        assertEquals(EnergyTypeEnum.SOLAR, d.getEnergyType());

        assertEquals("lastdance", ld.getKey());
        assertEquals("Last Dance", ld.getName());
        assertEquals(EnergyTypeEnum.ARC, ld.getEnergyType());
    }

    @Test
    public void testShotguns() {
        BadLander b = new BadLander();

        assertEquals("badlander", b.getKey());
        assertEquals("BadLander", b.getName());
        assertEquals(EnergyTypeEnum.ARC, b.getEnergyType());

    }

    @Test
    public void testSmgs() {
        BadReputation br = new BadReputation();
        CalusMiniTool cmt = new CalusMiniTool();

        assertEquals("badreputation", br.getKey());
        assertEquals("Bad Reputation", br.getName());
        assertEquals(EnergyTypeEnum.SOLAR, br.getEnergyType());

        assertEquals("calusminitool", cmt.getKey());
        assertEquals("Calus Mini-Tool", cmt.getName());
        assertEquals(EnergyTypeEnum.SOLAR, cmt.getEnergyType());
    }

    @Test
    public void testSelect() {
       Runes i1 = e.selectFusionRifle("erentilfr4");
       Runes i2 = e.selectSideArm("drang");
       Runes i3 = e.selectSniper("beloved");
       Runes i4 = e.selectSubMachineGun("badreputation");
       Runes i5 = e.selectShotGun("badlander");

       assertEquals(new ErentilFR4().getName(), i1.itemName);
       assertEquals(new Drang().getName(), i2.itemName);
       assertEquals(new Beloved().getName(), i3.itemName);
       assertEquals(new BadReputation().getName(), i4.itemName);
       assertEquals(new BadLander().getName(), i5.itemName);
    }
}
