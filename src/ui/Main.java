package ui;

import model.calendar.Calendar;
import model.entry.Entry;
import model.entry.Event;
import model.entry.Meeting;
import model.entry.Reminder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // play
        System.out.println("What how why, lets find out!");
        LocalDateTime today = LocalDateTime.of(2018, 2, 04, 22, 00);
        System.out.println(today.toString());
        System.out.println();

        // Setup
        Calendar calendar = new Calendar("bob", "bob@saget.com");

        Entry entryEvent = new Event(LocalDateTime.now().plusDays(1));
        Entry entryReminder = new Reminder(LocalDateTime.now().plusDays(4));
        Entry entryMeeting = new Meeting(LocalDateTime.now().plusDays(3));
        Event event = new Event(LocalDateTime.now().plusDays(4));
        Meeting meeting = new Meeting(LocalDateTime.now().plusDays(5));
        Reminder reminder = new Reminder(LocalDateTime.now().plusDays(6));

        // Usage
        calendar.addEntry(entryEvent);
        calendar.addEntry(entryReminder);
        calendar.addEntry(entryMeeting);
        calendar.addEntry(event);
        calendar.addEntry(meeting);
        calendar.addEntry(reminder);

        List<Entry> entires = new ArrayList<Entry>();
        entires = calendar.getEntries();
        System.out.println(entires.toString());

    }


}
