package model.entry;

import model.calendar.Calendar;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Entry {

    private LocalDateTime date;
    private Calendar calendar;
    private Label label;

    private boolean isRepeating;
    private String title;

    private List<Entry> entries; // list to contain all of the entries for the calendar.
    private List<Entry> repititions; // If you copy entries, they should be grouped and accessible as a whole.


    //REQUIRES: input LocalDateTime(Java 8)
    //MODIFIES: Instantiates new event/meeting/reminder
    //EFFECTS : constructor
    public Entry(LocalDateTime date, String title) {
        this.date = date;
        this.isRepeating = false;
        this.title = title;

    }

    // Getters
    public LocalDateTime getDate() {
        return date;
    }

    public abstract Label getLabel();

    public List<Entry> getRepitition() {
        return this.repititions;
    }
    public String getTitle() {
        return this.title;
    }

    //REQUIRES: Entry != null, Calendar != null
    //EFFECTS : Returns true if entry is repeating.
    public boolean isRepeating() {
        if (isRepeating) {
            return true;
        }
        return false;
    }

    /*  This method exists in calendar.
    //REQUIRES: Calendar != null, entry != null
    //MODIFIES: Calendar
    //EFFECTS : Adds subclass of entry to the calendar
    public boolean add(Entry entry) {
        return false;
    }
    */

    //REQUIRES: Calendar contains entry, Calendar != null, entry != null
    //MODIFIES: Calendar, this
    //EFFECTS : allows user to edit note, EntryLabel, date, time
    public boolean edit(Entry entry) {
        //TODO Implement edit entry
        switch (entry.getLabel()) {
        }
        return false;
    }

    //REQUIRES: Calendar contains entry, Calendar != null, entry != null
    //MODIFIES: Calendar, this
    //EFFECTS : Removes entry from calendar and deletes it
    public boolean remove(Entry entry) {
        if (calendar.getEntries().contains(entry)) {
            System.out.println("Calendar contains: " + entry.getTitle());
            calendar.getEntries().remove(entry);
            return true;
        }
        return false;
    }

    //REQUIRES: Calendar contains entry, Calendar != null, entry != null
    //MODIFIES: Calendar, this
    //EFFECTS : Creates a copy of entry passed as param
    public boolean copy(Entry entry, LocalDateTime newTime) {
        // TODO implement copy
        return false;
    }

    @Override
    public String toString() {
        return "" + this.getLabel() + ": " + getDate();
    }


}
