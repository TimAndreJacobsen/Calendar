package model.calendar;

import model.entry.Entry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private LocalDateTime date;
    private String owner;
    private String email;
    private List<Entry> entries;
    private Entry entry;

    public Calendar(String owner, String email) {
        this.date = LocalDateTime.now();
        this.owner = owner;
        this.email = email;
        this.entries = new ArrayList<Entry>();
    }

    // Getters

    //REQUIRES: entries != null, calendar != null
    //EFFECTS : returns list of entries
    public List<Entry> getEntries() {
        return this.entries;
    }

    //REQUIRES: entries != null, calendar != null
    //EFFECTS : returns entry matching title, null if no match can be found
    public Entry getEntry(String title) {
        List allEntries = getEntries();
        for (Entry entry : entries) {
            entry.getTitle().equals(title);
            return entry;
        }
        return null;
    }

    //REQUIRES: calendar != null
    //MODIFIES: calendar
    //EFFECTS : adds entry to calendar
    public void addEntry(Entry e) {
        entries.add(e);
    }

}
