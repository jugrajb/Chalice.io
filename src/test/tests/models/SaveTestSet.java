package tests.models;

import model.save.Save;
import model.weapons.kinetic.handcannons.Austringer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaveTestSet {
    @Test
    public void testSave() {
        Save save = new Save();

        save.addSavedCombo(new Austringer().getCombination());

        assertEquals(1, save.size());
    }
}
