package org.example.listener;

import org.example.events.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AbhilashListener implements ApplicationListener<TheBigBangTheoryEvent> {

    public void watchBigBang(String epNo) {
        System.out.println("Abhilash: Started watching BBT");
        System.out.println("Abhilash: playing BBT : " + epNo);
    }

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
