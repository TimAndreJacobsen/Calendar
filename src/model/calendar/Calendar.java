package model.calendar;

import model.entry.Entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendar {

    private Date date;
    private String owner;
    private String email;
    private List<Entry> entries;

    public Calendar(String owner, String email) {
        this.date = new Date();
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

    //REQUIRES: calendar != null
    //MODIFIES: calendar
    //EFFECTS : adds entry to calendar
    public boolean addEntry(Entry e) {
        // TODO fix implementation, add check
        entries.add(e);
        return false;
    }


}
