package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNameMessageService implements MessageService {
    @Bean("messageService")

    @Override
    public String getMessage() {
        return "Jakub Wiątek";
    }
}
