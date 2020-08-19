package com.example.cluster.redis.module;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private int status;

    private String msg;

    private Object data;

    public void setStatus(Status status){
        this.status = status.getValue();
    }

    public static Message Ok(){
        return new Message(Status.SUCCESS.getValue(),null,null);
    }

    public static Message Ok(@NonNull String msg){
        return new Message(Status.SUCCESS.getValue(),msg,null);
    }

    public static Message Ok(@NonNull String msg,@NonNull Object data){
        return new Message(Status.SUCCESS.getValue(),msg,data);
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}
