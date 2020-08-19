package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

//    @Autowired
//    private Environment env;

    @Value("${from}")
    private String fron;

    @GetMapping("/from")
    public String getConfig() {
        return this.fron;
    }
}
