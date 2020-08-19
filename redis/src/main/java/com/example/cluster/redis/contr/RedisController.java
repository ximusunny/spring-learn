package com.example.cluster.redis.contr;

import com.alibaba.fastjson.JSONObject;
import com.example.cluster.redis.module.Message;
import com.example.cluster.redis.module.Status;
import com.example.cluster.redis.server.RedisServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    @Autowired
    private RedisServer server;

    @GetMapping("/set/{key}={value}")
    public String setKey(@PathVariable("key") String key, @PathVariable("value") String value) {
        return "kv插入:" + server.set(key, value);
    }

    @GetMapping("/getValue/{key}")
    public String getValue(@PathVariable("key") String key) {
        return JSONObject.toJSONString(server.getValue(key));
    }

    @GetMapping("/sGet/{key}")
    public String sGet(@PathVariable("key") String key) {
        return JSONObject.toJSONString(server.sGet(key));
    }


    @GetMapping("/hmget/{key}")
    public String hmget(@PathVariable("key") String key) {
        return JSONObject.toJSONString(server.hmget(key));
    }

    @GetMapping("/test")
    public String test(){
        List<String> list = new ArrayList<>();
        list.add("as");
        list.add("as");
        list.add("as");
        list.add("as");
        list.add("as");
        list.add("as");

        Message msg  = new Message();
        msg.setStatus(Status.READ_ERROR);
        msg.setData(null);



        return Message.Ok("操作成功了",list).toString();
    }

}
