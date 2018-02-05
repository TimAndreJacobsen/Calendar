package model.entry;

import java.time.LocalDateTime;

public class Event extends Entry {

    private final Label LABEL;
    private String title;


    public Event(LocalDateTime date, String title) {
        super(date, title);
        LABEL = Label.EVENT;
    }


    //Getters
}
