package org.example.listener;

import org.example.events.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AdityaListener implements ApplicationListener<TheBigBangTheoryEvent> {

    public void watchBigBang(String epNo) {
        System.out.println("Aditya: Started watching BBT");
        System.out.println("Aditya: playing BBT : " + epNo);
    }

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
