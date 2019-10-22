package tests.controllers;

import model.controller.SaveController;
import model.runes.Runes;
import model.save.Save;
import model.weapons.kinetic.handcannons.Austringer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaveControllerTestSet {
    private SaveController sc;
    private Save saveList;

    @BeforeEach
    void beforeEachTest() {
        saveList = new Save();
        sc = new SaveController(saveList);
    }

    @Test
    void testRemove(){
        saveList.add(1);
        saveList.add(2);
        sc.remove(0);
        Assertions.assertEquals(2, saveList.get(0));
    }

    @Test
    void testSaveItem(){
        saveList.addSavedCombo(new Austringer().getCombination());
        Runes item = (Runes) saveList.get(0);
        sc.saveItem(new Austringer().getCombination());
        Runes item2 = (Runes) saveList.get(1);
        assertEquals("Austringer", item.itemName);
        assertEquals("Austringer", item2.itemName);
    }

    private void assertEquals(String austringer, String itemName) {
    }

    @Test
    void testEmptyList(){
       assertTrue(sc.emptyList());
       saveList.add(1);
       assertFalse(sc.emptyList());
    }

    @Test
    void loadRunes(){
       Runes[] list = new Runes[0];
       sc.loadRunes(list);
       assertTrue(sc.emptyList());
    }

}
