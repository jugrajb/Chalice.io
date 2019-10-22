package model.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SpecialNote {
    private String name;
    private List<Note> notes = new ArrayList<>();

    public SpecialNote(String name) {
        this.name = name;
    }

    public void addItem(Note note) {
        if (!notes.contains(note)) {
            notes.add(note);
            this.name = note.getItemName();
            note.addSpecialItem(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpecialNote)) {
            return false;
        }
        SpecialNote specialNote = (SpecialNote) o;
        return name.equals(specialNote.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
