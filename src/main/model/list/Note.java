package model.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Note {
    private List<SpecialNote> specialNotes = new ArrayList<>();
    private String itemName;

    public Note(String name) {
        itemName = name;
    }

    public void addSpecialItem(SpecialNote specialNote) {
        if (!this.specialNotes.contains(specialNote)) {
            this.specialNotes.add(specialNote);
            this.itemName = specialNote.getName();
            specialNote.addItem(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Note)) {
            return false;
        }

        Note note = (Note) o;

        return itemName.equals(note.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }

    public List<SpecialNote> getSpecialNotes() {
        return specialNotes;
    }

    public String getItemName() {
        return itemName;
    }
}
