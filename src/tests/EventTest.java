package tests;

import model.entry.Event;
import model.entry.Label;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static junit.framework.TestCase.assertEquals;

public class EventTest {

    private Event event;
    private LocalDateTime now;

    @Before
    public void setup() {
        now = LocalDateTime.now();
        event = new Event(now, "birthday");
    }

    @Test
    public void createEvent() {
        // Setup
        LocalDateTime yesterday = LocalDateTime.of(2018, 1, 06, 12, 0);
        LocalDateTime tomorrow = LocalDateTime.of(2018, 1, 8, 12, 0);
        LocalDateTime today = LocalDateTime.of(2018, 1, 7, 23, 45);
        Event e1 = new Event(yesterday, "event1");
        Event e2 = new Event(today, "event2");
        Event e3 = new Event(tomorrow, "event3");

        // Verify
        assertEquals(event.getLabel(), Label.EVENT);
        assertEquals(event.getTitle(), "birthday");
        assertEquals(event.getDate(), now);
        assertEquals(e1.getLabel(), Label.EVENT);
        assertEquals(e1.getTitle(), "event1");
        assertEquals(e1.getDate(), yesterday);
        assertEquals(e2.getLabel(), Label.EVENT);
        assertEquals(e2.getTitle(), "event2");
        assertEquals(e2.getDate(), today);
        assertEquals(e3.getLabel(), Label.EVENT);
        assertEquals(e3.getTitle(), "event3");
        assertEquals(e3.getDate(), tomorrow);
    }

}
