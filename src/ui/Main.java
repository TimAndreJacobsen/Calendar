package ui;

import model.calendar.Calendar;
import model.entry.Entry;
import model.entry.Event;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date today = new Date();
        Time noIdea = new Time(10);

        LocalDateTime now = LocalDateTime.now();


        Calendar calendar = new Calendar("Bob Saget", "bob42@life.biz");

        Entry event = new Event(today, noIdea);
        System.out.println(event.getDate());
        calendar.addEntry(new Event(today, noIdea));


        ArrayList<Entry> entries = (ArrayList<Entry>) calendar.getEntries();
        entries.toString();


    }


}
