package org.example.publisher;

import org.example.events.ComedyCircusEvent;
import org.example.events.TheBigBangTheoryEvent;
import org.example.events.TheBigBangTheoryEventRefactor;
import org.example.listener.AbhilashListener;
import org.example.listener.AdityaListener;
import org.example.listener.WillyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {
        //! Tight coupling, as the subscribers/listeners grows then we need to manually write in Publisher to know about the subscribers.
        // To solve this problem, we can do whenever ZeeCafePublisher starts the bbt event it publishes an event and other listeners can keep listening to that event.
//    @Autowired
//    private AbhilashListener abhilashListener;
//
//    @Autowired
//    private WillyListener willyListener;
//
//    @Autowired
//    private AdityaListener adityaListener;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void streamBigBangTheory(String episodeNo) {
        System.out.println("Zee cafe: Starting BBT " + episodeNo);

        //* notify the user to watch bing bang theory
//        abhilashListener.watchBigBang(episodeNo);
//        willyListener.watchBigBang(episodeNo);
//        adityaListener.watchBigBang(episodeNo);

        //* Publish an event on the streamBigBangTheory() method call
        //* The publisher shouldn't know who are the subscribers.
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(this, episodeNo));
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEventRefactor(episodeNo));
    }

    public void streamComedyCircus(String episodeNo) {
        System.out.println("Zee cafe: Starting ComedyCircus " + episodeNo);

        applicationEventPublisher.publishEvent(new ComedyCircusEvent(episodeNo));
    }
}
