package tests.utils;

import org.junit.jupiter.api.Test;
import model.controller.SaveController;
import model.save.Save;
import model.utils.ReadJson;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadJsonTestSet {

    @Test
    void testRead() throws FileNotFoundException {
        Save save = new Save();
        SaveController saveController = new SaveController(save);
        saveController.loadRunes(ReadJson.read("data/test.json"));
        assertEquals(2, save.size());
    }
}
