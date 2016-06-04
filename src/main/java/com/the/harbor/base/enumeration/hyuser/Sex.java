package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Sex implements Behaviour {

    FEMALE("2", "女"),

    MALE("1", "男"),

    OTHER("0", "其它");

    private String value;

    private String desc;

    private Sex(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.value + " is " + this.desc;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

}
