package model.entry;

import java.time.LocalDateTime;

public class Event extends Entry {

    private final Label LABEL;

    public Event(LocalDateTime date) {
        super(date);
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
