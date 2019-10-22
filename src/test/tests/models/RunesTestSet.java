package tests.models;

import model.runes.blue.Excess;
import model.runes.blue.Pleasure;
import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.green.Pride;
import model.runes.green.War;
import model.runes.purple.Beast;
import model.runes.purple.Joy;
import model.runes.purple.Jubilation;
import model.runes.red.Ambition;
import model.runes.red.Cunning;
import model.runes.red.Gluttony;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunesTestSet {
    @Test
    public void testBlue() {
        Excess e = new Excess();
        Pleasure p = new Pleasure();
        Wealth w = new Wealth();
        assertEquals(e.getName(), e.getName());
        assertEquals(e.getImage(), e.getImage());

        assertEquals(p.getImage(), p.getImage());
        assertEquals(p.getName(), p.getName());

        assertEquals(w.getImage(), w.getImage());
        assertEquals(w.getName(), w.getName());
    }

    @Test
    public void testGreen() {
        Desire d = new Desire();
        Pride p = new Pride();
        War w = new War();

        assertEquals(d.getName(), d.getName());
        assertEquals(d.getImage(), d.getImage());

        assertEquals(p.getImage(), p.getImage());
        assertEquals(p.getName(), p.getName());

        assertEquals(w.getImage(), w.getImage());
        assertEquals(w.getName(), w.getName());
    }

    @Test
    public void testPurple() {
        Beast b = new Beast();
        Joy j = new Joy();
        Jubilation jb = new Jubilation();

        assertEquals(b.getName(), b.getName());
        assertEquals(b.getImage(), b.getImage());

        assertEquals(j.getImage(), j.getImage());
        assertEquals(j.getName(), j.getName());

        assertEquals(jb.getImage(), jb.getImage());
        assertEquals(jb.getName(), jb.getName());
    }

    @Test
    public void testRed() {
        Gluttony gluttony = new Gluttony();
        Ambition am = new Ambition();
        Cunning c = new Cunning();

        assertEquals(am.getName(), am.getName());
        assertEquals(am.getImage(), am.getImage());

        assertEquals(c.getImage(), c.getImage());
        assertEquals(c.getName(), c.getName());

        assertEquals(gluttony.getImage(), gluttony.getImage());
        assertEquals(gluttony.getName(), gluttony.getName());
    }
}
