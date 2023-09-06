package org.example.listener;

import org.example.events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SendEmailListenerDay2 {

    @Order(2)
    @EventListener //* EventListener methods must have arguments which contains the event.
    @Async //* Check the configuration class for bean created(ApplicationEventMulticaster) and also App.java with @EnableAsync
    public void start(TransactionFailureEvent event) {
        System.out.println("SendEmailListenerDay2 : -> inside start() -> method starting");
        try {
            Thread.sleep(4000); // to consider that heavy-duty work is happening which takes some time to complete.
            System.out.println("Sending Email");
            System.out.println("Sending an email with the Body " + "Hi " + event.getName() +
                    " Transaction failed for the amount" + event.getAmount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SendEmailListener: inside start() - method end");
    }
}
