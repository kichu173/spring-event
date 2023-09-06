package org.example.publisher;

import org.example.events.TransactionFailureEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GpayPublisherDay2 {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    public void sendMoney(String name, double amount, boolean condition) {
        try {
            if (condition) { // When transaction failed, trigger a sms, email to the customer.
                throw new RuntimeException("Transaction failed");
            }

            System.out.println("Hi " + name);
            System.out.println("sending amount " + amount + " is successful");
        }catch (Exception e) {
            applicationEventPublisher.publishEvent(new TransactionFailureEvent(name, amount));
            e.printStackTrace();
        }
    }
}
