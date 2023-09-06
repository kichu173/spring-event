package org.example.events;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class TheBigBangTheoryEvent extends ApplicationEvent { // creating an event (older way of doing it by extending ApplicationEvent)

    private String episodeNo;// EP - 004 - from App.java

    public TheBigBangTheoryEvent(Object source) {
        super(source);
    }

    public TheBigBangTheoryEvent(Object source, String episodeNo) {
        super(source);
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }
}
