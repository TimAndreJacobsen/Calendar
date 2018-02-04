package model.entry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Meeting extends Event {

    private Map<String, String> attendees; // Key = name, value = email
    private final Label LABEL;

    public Meeting(LocalDateTime date) {
        super(date);
        LABEL = Label.MEETING;
    }


    //Getters
    @Override
    public Label getLabel() {
        return this.LABEL;
    }

    //REQUIRES: Attendees != null
    //EFFECTS : returns a list of names
    public List<String> getAttendeeName() {
        // TODO implement logic to return a list of names of attendees
        List<String> names = new ArrayList<String>();
        return names;
    }

    //REQUIRES: Attendees != null
    //EFFECTS : returns a list of emails
    public List<String> getAttendeeEmail() {
        // TODO implement logic to return a list of emails of attendees
        List<String> emails = new ArrayList<String>();
        return emails;
    }

    //MODIFIES: this.attendees
    //EFFECTS : adds name + email to Hashmap attendees
    public boolean addAttendee(String name, String email) {
        // TODO implement addAttendee
        return false;
    }

    //REQUIRES: name is key in attendees
    //MODIFIES: this.attendees
    //EFFECTS : removes name + email from list attendees
    public boolean removeAttendee(String name) {
        // TODO implement removeAttendee
        return false;
    }


    //REQUIRES: entry != null, attendees != null
    //EFFECTS : sends a email of format "You are invited to Meeting at Time, Date"
    public boolean sendInvitations() {
        // TODO implement logic for sending invitations to all attendees of Entry Meeting
        return false;
    }




}
