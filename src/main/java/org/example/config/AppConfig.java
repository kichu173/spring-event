package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@ComponentScan("org")
public class AppConfig {

    @Bean("applicationEventMulticaster")
    public ApplicationEventMulticaster makeAsync() { //* To make async listener to work.
        SimpleApplicationEventMulticaster s = new SimpleApplicationEventMulticaster();
        s.setTaskExecutor(new SimpleAsyncTaskExecutor());
        return s;
    }

}
