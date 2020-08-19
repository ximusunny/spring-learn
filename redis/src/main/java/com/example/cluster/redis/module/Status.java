package com.example.cluster.redis.module;

public enum Status {

    SUCCESS(1),
    ERROR(99),
    WRITE_ERROR(2),
    READ_ERROR(3);

    private int value;
    Status(int value){
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

}
