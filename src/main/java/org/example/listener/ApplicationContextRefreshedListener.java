package org.example.listener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener {

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("application initialized or refreshed");
        System.out.println(event);
    }

    @EventListener
    public void handleContextStartedEvent(ContextStartedEvent event) {
        System.out.println("application initialized with start()");// In App.java add context.start()
        System.out.println(event);
    }

    // ContextStoppedEvent
    @EventListener
    public void handleContextStoppedEvent(ContextStoppedEvent event) {
        System.out.println("application stopped using stop()");// In App.java add context.stop()
        System.out.println(event);
    }

    // ContextClosedEvent
    @EventListener
    public void handleContextClosedEvent(ContextClosedEvent event) {
        System.out.println("application stopped using close()");// In App.java add context.close()
        System.out.println(event);
    }
}
