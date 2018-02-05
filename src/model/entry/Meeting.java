package model.entry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Meeting extends Event {

    private Map<String, String> attendees; // Key = name, value = email
    private final Label LABEL;
    private String title;

    public Meeting(LocalDateTime date, String title) {
        super(date, title);
        LABEL = Label.MEETING;
    }

    //Getters

    //REQUIRES: Attendees != null
    //EFFECTS : returns a list of names
    public List<String> getAttendeeName() {
        List<String> names = new ArrayList<String>();

        for (String name : attendees.keySet()) {
            names.add(name);
        }
        return names;
    }

    //REQUIRES: Attendees != null
    //EFFECTS : returns a list of emails
    public List<String> getAttendeeEmail() {
        List<String> emails = new ArrayList<String>();

        for (String name : attendees.keySet()) {
            emails.add(attendees.get(name));
        }
        return emails;
    }

    //MODIFIES: this.attendees
    //EFFECTS : adds name + email to Hashmap attendees
    public void addAttendee(String name, String email) {
        attendees.putIfAbsent(name, email);
        System.out.println("put key:" + name + " value: " + email);
    }

    //REQUIRES: name is key in attendees
    //MODIFIES: this.attendees
    //EFFECTS : removes name + email from list attendees
    public boolean removeAttendee(String name) {
        if (attendees.containsKey(name)) {
            attendees.remove(name);
            return true;
        }
        return false;
    }

    //REQUIRES: entry != null, attendees != null
    //EFFECTS : sends a email of format "You are invited to Meeting at Time, Date"
    public void sendInvitations(String message) {
        List<String> emailList = getAttendeeEmail();

        for (String email : emailList) {
            System.out.println("Sending email to " + email +
            "\n" + message);
        }
    }

}
