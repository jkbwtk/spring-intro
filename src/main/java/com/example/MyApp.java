package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                MyNameMessageService.class);

        MessageService messageService = applicationContext.getBean(MessageService.class);
        MessageService messageServiceAux = applicationContext.getBean(MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageServiceAux.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(messageServiceAux.hashCode());

        applicationContext.close();
    }
}
