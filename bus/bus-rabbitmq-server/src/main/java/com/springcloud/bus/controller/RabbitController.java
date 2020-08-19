package com.springcloud.bus.controller;

import com.springcloud.bus.server.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    private Sender sender;


    @GetMapping("/send")
    public String sendMsg() {
        this.sender.send();
        return "发送成功";
    }

}
