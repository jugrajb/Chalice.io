package model.save;

import model.runes.Runes;

import java.util.ArrayList;

public class Save extends ArrayList {
    private ArrayList<Runes> savedCombos;

    public Save() {
        savedCombos = new ArrayList<>();
    }

    public void addSavedCombo(Runes e) {
        this.add(e);
    }
}
