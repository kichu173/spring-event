package org.example.listener;

import org.example.events.TheBigBangTheoryEvent;
import org.example.events.TheBigBangTheoryEventRefactor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AbhilashListenerRefactor {

    public void watchBigBang(String epNo) {
        System.out.println("Abhilash: Started watching BBT");
        System.out.println("Abhilash: playing BBT : " + epNo);
    }

    @EventListener
    public void anyMethodName(TheBigBangTheoryEventRefactor event) {
        System.out.println("The BigBangTheoryEventRefactor  -- AbhilashListenerRefactor start ---");
        try {
            Thread.sleep(3000);// imagine this method is taking long time complete its work
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The BigBangTheoryEventRefactor  -- AbhilashListenerRefactor end ---");// All the listeners are executed synchronously. If one listener is blocked then the others has to wait till its completes its execution in order to start their work.
        watchBigBang(event.getEpisodeNo());
    }
}
