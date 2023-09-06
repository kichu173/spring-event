package org.example;

import org.example.config.AppConfig;
import org.example.publisher.GpayPublisherDay2;
import org.example.publisher.ZeeCafePublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // context.start()
        ZeeCafePublisher bean = context.getBean("zeeCafePublisher", ZeeCafePublisher.class);
        bean.streamBigBangTheory("EP - 004");

        bean.streamComedyCircus("EP - 007");

        GpayPublisherDay2 gpayPublisherDay2 = context.getBean("gpayPublisherDay2", GpayPublisherDay2.class);
        gpayPublisherDay2.sendMoney("Abhilash", 200.00, true);
        // context.stop()
        // context.close()
    }
}
