package model.entry;

import java.sql.Time;
import java.util.Date;

public class Event extends Entry {

    private final Label LABEL;

    public Event(Date date, Time time) {
        super(date, time);
        LABEL = Label.EVENT;

    }



    //Getters
    public void getReminder() {
        // TODO implement return reminder
    }
    @Override
    public Label getLabel() {
        return this.LABEL;
    }


    //REQUIRES:
    //MODIFIES:
    //EFFECTS :
    public boolean setReminder() {
        // TODO implement setReminder
        return false;
    }
}
