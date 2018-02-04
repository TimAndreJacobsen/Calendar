package model.entry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder extends Entry{

    private final Label LABEL;
    private List<String> notes; // every entry object will hold a list of strings(notes)

    public Reminder(LocalDateTime date) {
        super(date);
        this.notes = new ArrayList<String>();
        this.LABEL = Label.REMINDER;
    }

    //Getters
    public List<String> getNotes() {
        return notes;
    }
    @Override
    public Label getLabel() {
        return this.LABEL;
    }

    //REQUIRES: entry != null
    //MODIFIES: this.notes
    //EFFECTS : Overwrites List<String> notes with List<String> notes passed as param
    public boolean setNotes(List<String> notes) {
        // TODO implement check for successful overwrite of notes.
        this.notes = notes;
        return false;
    }

    //REQUIRES: entry != null
    //MODIFIES: this.notes
    //EFFECTS : Adds string note to List<String> notes
    public boolean addNote(String note) {
        // TODO Implement check for successful add
        this.notes.add(note);
        return false;
    }

    public void remind() {
        // TODO make reminder actually remind.
    }



}


