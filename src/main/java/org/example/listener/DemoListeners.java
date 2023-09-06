package org.example.listener;

import org.example.events.ComedyCircusEvent;
import org.example.events.TheBigBangTheoryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListeners {

    // Best way of doing it, One listener can listen to multiple events.
    @EventListener
    public void start1(TheBigBangTheoryEvent event) {

    }

    @EventListener
    public void start1(ComedyCircusEvent event) {

    }
}
