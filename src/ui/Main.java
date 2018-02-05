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

        // experimentation
        System.out.println("What how why, lets find out!");
        LocalDateTime today = LocalDateTime.of(2018, 2, 04, 22, 00);
        System.out.println(today.toString());
        System.out.println();

        // Setup
        Calendar calendar = new Calendar("bob", "bob@saget.com");

        Entry entryEvent = new Event(LocalDateTime.now().plusDays(1), "tomorrow");
        Entry entryReminder = new Reminder(LocalDateTime.now().plusDays(2),"day after tomorrow", "remindme!");
        Entry entryMeeting = new Meeting(LocalDateTime.now().plusDays(3), "3 days from now");
        Event event = new Event(LocalDateTime.now().plusDays(4), "4 days from now");
        Meeting meeting = new Meeting(LocalDateTime.now().plusDays(5), "5 days from now");
        Reminder reminder = new Reminder(LocalDateTime.now().plusDays(6), "6 days from now", "remindme!!");

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
