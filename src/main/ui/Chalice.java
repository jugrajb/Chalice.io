package ui;

import model.runes.Runes;

import java.util.Observable;
import java.util.Observer;

public class Chalice implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        JavaFxview items = (JavaFxview) arg;
        Runes item = items.item;
        items.numItemCrafted += 1;
        System.out.println(item.itemName);
    }
}
