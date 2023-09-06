package org.example.listener;

import org.example.events.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class WillyListener implements ApplicationListener<TheBigBangTheoryEvent> { //  implements ApplicationListener - to listen to the published event from the ZeeCafePublisher method.

    public void watchBigBang(String epNo) {
        System.out.println("Willy: Started watching BBT");
        System.out.println("Willy: playing BBT : " + epNo);
    }

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {// This method will be executed when TheBigBangTheoryEvent will be published.
        watchBigBang(event.getEpisodeNo());
    }
}
