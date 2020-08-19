package com.springcloud.bus.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Receiver {

    @RabbitListener(queues = "hello123")
    public void process(String hello) {
        log.info("Receiver:{}",hello);
    }

}
