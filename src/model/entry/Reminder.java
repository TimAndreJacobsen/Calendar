package model.entry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder extends Entry{

    private final Label LABEL;

    private List<String> notes; // every entry object will hold a list of strings(notes)
    private String title;
    private String reminder;

    public Reminder(LocalDateTime date, String title, String reminder) {
        super(date, title);
        this.LABEL = Label.REMINDER;
        this.notes = new ArrayList<String>();
        this.reminder = reminder;
    }

    //Getters
    public List<String> getNotes() {
        return notes;
    }
    public String getReminder() {
        return this.reminder;
    }

    //REQUIRES: entry != null
    //MODIFIES: this.notes
    //EFFECTS : Overwrites List<String> notes with List<String> notes passed as param
    public boolean setNotes(List<String> notes) {
        this.notes = notes;
        if (this.notes.size() == notes.size()) {
            return true;
        }
        return false;
    }

    //REQUIRES: entry != null
    //MODIFIES: this.notes
    //EFFECTS : Adds string note to List<String> notes
    public boolean addNote(String note) {
        notes.add(note);
        if (notes.contains(note)) {
            return true;
        }
        return false;
    }

    //REQUIRES: Event != null
    //MODIFIES: this.reminder
    //EFFECTS : Overwrites old reminder string with the new passed as param
    // Returns true if it can set reminder.  Warning! This will delete the old reminder!
    public boolean setReminder(String reminder) {
        this.reminder = reminder;
        if (this.reminder.equals(reminder)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nReminder: " + getReminder() +
                "\nNotes:\n" + notesToString();
    }

    //REQUIRES: notes != null
    //EFFECTS : Returns a formatted string: "note \n note \n ... "
    private String notesToString() {
        String formattedNotes = "";

        if (notes.size() == 0) {
            return "no notes";
        }

        for (String note : notes) {
            formattedNotes += note;
            formattedNotes += "\n";
        }
        System.out.println(formattedNotes);
        return formattedNotes;
    }

}


