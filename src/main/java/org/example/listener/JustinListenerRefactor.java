package org.example.listener;

import org.example.events.ComedyCircusEvent;
import org.example.events.TheBigBangTheoryEventRefactor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JustinListenerRefactor {

    public void watchComedyCircus(String epNo) {
        System.out.println("Justin: Started watching ComedyCircus");
        System.out.println("Justin: playing ComedyCircus : " + epNo);
    }

    @EventListener
    public void anyMethodName(ComedyCircusEvent event) {
        watchComedyCircus(event.getEpisodeNo());
    }
}
