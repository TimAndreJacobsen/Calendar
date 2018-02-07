package model.entry;

import java.time.LocalDateTime;

public class Event extends Entry {

    private final Label LABEL;

    public Event(LocalDateTime date, String title) {
        super(date, title);
        LABEL = Label.EVENT;
    }

    //Getters
    public Label getLabel() {
        return LABEL;
    }
}
