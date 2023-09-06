package org.example.events;

import org.springframework.context.ApplicationEvent;

public class TheBigBangTheoryEventRefactor  { // creating an event

    private String episodeNo;// EP - 004 - from App.java

    public TheBigBangTheoryEventRefactor(String episodeNo) {
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }
}
