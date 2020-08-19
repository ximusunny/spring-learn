package com.springcloud.bus.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Sender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        String context = "hello " + System.currentTimeMillis();
        log.info("Sender :{}" ,context);
        this.template.convertAndSend("hello123",context);
    }

}
