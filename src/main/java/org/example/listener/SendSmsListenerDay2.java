package org.example.listener;

import org.example.events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SendSmsListenerDay2 {

    @Order(1) // ordering the events.
    @EventListener // EventListener methods must have arguments which contains the event.
//    @EventListener(classes = {TransactionFailureEvent.class, XYZ.class}) // with this approach you cannot catch hold off the event object in arguments and use it as below body code. (34:21)
    public void start(TransactionFailureEvent event) {
        System.out.println("Sending an sms " + "Hi " + event.getName() + " Transaction failed for the amount" + event.getAmount());
    }
}
