package model.entry;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Entry {

    private Date date;
    private Time time;



    private boolean isRepeating;

    private List<Entry> entries; // list to contain all of the entries for the calendar.
    private List<Entry> repititions; // If you copy entries, they should be grouped and accessible as a whole.


    //REQUIRES: input date, time,
    //MODIFIES: Instantiates new event/meeting/reminder
    //EFFECTS : constructor
    public Entry(Date date, Time time) {
        this.date = date;
        this.time = time;
        this.isRepeating = false;
    }

    // Getters
    public Date getDate() {
        return date;
    }
    public Time getTime() {
        return time;
    }
    public abstract Label getLabel();
    public List<Entry> getRepitition() {
        return this.repititions;
    }

    //REQUIRES: Entry != null, Calendar != null
    //EFFECTS : Returns true if entry is repeating.
    public boolean isRepeating() {
        return false;
    }

    //REQUIRES: Calendar != null, entry != null
    //MODIFIES: Calendar
    //EFFECTS : Adds subclass of entry to the calendar
    public boolean add(Entry entry) {
        //TODO Implement add.
        return false;
    }

    //REQUIRES: Calendar contains entry, Calendar != null, entry != null
    //MODIFIES: Calendar, this
    //EFFECTS : allows user to edit note, EntryLabel, date, time
    public boolean edit(Entry entry) {
        //TODO implement edit.
        return false;
    }

    //REQUIRES: Calendar contains entry, Calendar != null, entry != null
    //MODIFIES: Calendar, this
    //EFFECTS : Removes entry from calendar and deletes it
    public boolean remove(Entry entry) {
        //TODO implement remove.
        return false;
    }

    //REQUIRES: Calendar contains entry, Calendar != null, entry != null
    //MODIFIES: Calendar, this
    //EFFECTS : Creates a copy of entry passed as param
    public boolean copy(Entry entry) {
        //TODO implement copy.
        return false;
    }


}
