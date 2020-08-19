package com.example.cluster.redis.server;

import com.example.cluster.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class RedisServer {

    @Autowired
    private RedisUtil redisUtil;

    public boolean set(String key, String value) {
        return redisUtil.set(key, value);
    }

    public Map<Object, Object> hmget(String key) {
        return redisUtil.hmget(key);
    }

    public Set<Object> sGet(String key) {
        return redisUtil.sGet(key);
    }

    public Object getValue(String key) {
        return redisUtil.getValue(key);
    }

}
