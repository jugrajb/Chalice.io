package model.controller;

import model.runes.Runes;
import model.save.Save;

public class SaveController {
    private Save saveList;

    public SaveController(Save saveList) {
        this.saveList = saveList;
    }

    public void remove(int index) {
        saveList.remove(index);
    }

    public void saveItem(Runes item) {
        saveList.addSavedCombo(item);
    }

    public boolean emptyList() {
        return saveList.size() == 0;
    }

    public void loadRunes(Runes[] items) {
        for (Runes item : items) {
            saveList.addSavedCombo(item);
        }
    }

}
