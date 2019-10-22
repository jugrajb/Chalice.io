package tests.models;

import model.list.Note;
import model.list.SpecialNote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListTestSet {
    private List<Note> noteList;
    private List<SpecialNote> sItemList;

    @BeforeEach
    public void load() {
        noteList = new ArrayList<>();
        sItemList = new ArrayList<>();
    }

    @Test
    public void testItemAdd() {
        Note note = new Note("test");
        SpecialNote sItem = new SpecialNote("");

        noteList.add(note);
        sItemList.add(sItem);
        note.addSpecialItem(sItem);

        assertEquals(1, note.getSpecialNotes().size());
        assertEquals(1, sItem.getNotes().size());
    }

    @Test
    public void testSpecialItemAdd() {
        Note note = new Note("");
        SpecialNote sItem = new SpecialNote("test");

        noteList.add(note);
        sItemList.add(sItem);
        sItem.addItem(note);

        assertEquals(1, note.getSpecialNotes().size());
        assertEquals(1, sItem.getNotes().size());
    }

    @Test
    public void testEquals() {
        Note note = new Note("No");
        Note note2 = new Note("No");
        Note note3 = null;
        assertTrue(note.equals(note2));
        assertFalse(note.equals(note3));
    }

    @Test
    public void testHasCode() {
        Note note = new Note("a");
        Note note2 = new Note("a");
        assertEquals(note.hashCode(), note2.hashCode());
    }

    @Test
    public void testEqualsSpecial() {
        SpecialNote sn = new SpecialNote("No");
        SpecialNote sn2 = new SpecialNote("No");
        SpecialNote sn3 = null;
        assertTrue(sn.equals(sn2));
        assertFalse(sn.equals(sn3));
    }

    @Test
    public void testEqSn() {
        SpecialNote sn = new SpecialNote("n");
        SpecialNote sn1 = new SpecialNote("n");

        assertEquals(sn.hashCode(), sn1.hashCode());
    }
}
