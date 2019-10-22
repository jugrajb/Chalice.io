package tests.utils;

import model.runes.Runes;
import model.weapons.kinetic.handcannons.Austringer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.utils.ReadJson;
import model.utils.SaveJson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaveJsonTestSet {
    private SaveJson rj;

    @BeforeEach
    void beforeEachTest() {
        rj = new SaveJson();
    }

    @Test
    void testRead() throws IOException {
        ArrayList<Runes> list = new ArrayList<>();
        list.add(new Austringer().getCombination());
        list.add(new Austringer().getCombination());
        rj.save(list,"data/test.json");
        Runes[] list2 = ReadJson.read("data/test.json");
        List<Runes> test = new ArrayList<>(Arrays.asList(list2));

        assertEquals("Austringer", test.get(test.size()-1).itemName);
    }
}
