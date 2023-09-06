package org.example.listener;

import org.example.events.TheBigBangTheoryEventRefactor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AkhilListener {
    public void watchBigBang(String epNo) {
        System.out.println("Akhil: Started watching BBT");
        System.out.println("Akhil: playing BBT : " + epNo);
    }

    @EventListener
    public void anyMethodName(TheBigBangTheoryEventRefactor event) {
        watchBigBang(event.getEpisodeNo());
    }
}
