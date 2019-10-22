package tests.models;

import model.weapons.kinetic.handcannons.Austringer;
import model.weapons.kinetic.handcannons.PribanaD;
import model.weapons.kinetic.shotguns.DustRockBlues;
import model.weapons.kinetic.shotguns.ImperialDecree;
import model.weapons.kinetic.shotguns.ParcelOfStarDust;
import model.weapons.kinetic.sidearms.SmugglersWord;
import model.weapons.kinetic.snipers.DreadedVenture;
import model.weapons.kinetic.submachineguns.HardTruths;
import model.weapons.kinetic.submachineguns.TracklessWaste;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KineticTestSet {
    @Test
    public void testSniper() {
        DreadedVenture dv = new DreadedVenture();

        assertEquals("Dreaded Venture", dv.getName());
        assertEquals("dreadedventure", dv.getKey());
    }

    @Test
    public void testHC() {
        Austringer a = new Austringer();
        PribanaD pd = new PribanaD();

        assertEquals("Austringer", a.getName());
        assertEquals("austringer", a.getKey());
        assertEquals("Pribana D", pd.getName());
        assertEquals("pibanad", pd.getKey());
    }

    @Test
    public void testShotgun() {
        DustRockBlues drb = new DustRockBlues();
        ImperialDecree id = new ImperialDecree();
        ParcelOfStarDust posd = new ParcelOfStarDust();

        assertEquals("Dust Rock Blues", drb.getName());
        assertEquals("dustrockblues", drb.getKey());
        assertEquals("Imperial Decree", id.getName());
        assertEquals("imperialdecree", id.getKey());
        assertEquals("Parcel Of StarDust", posd.getName());
        assertEquals("parcelofstardust", posd.getKey());
    }

    @Test
    public void testSmg() {
        HardTruths ht = new HardTruths();
        TracklessWaste tw = new TracklessWaste();

        assertEquals("Hard Truths", ht.getName());
        assertEquals("hardtruths", ht.getKey());
        assertEquals("Trackless Waste", tw.getName());
        assertEquals("tracklesswaste", tw.getKey());
    }

    @Test
    public void testSidearms() {
        SmugglersWord sw = new SmugglersWord();

        assertEquals("Smugglers Word", sw.getName());
        assertEquals("smugglersword", sw.getKey());
    }
}
