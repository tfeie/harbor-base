package com.the.harbor.base.enumeration.hytags;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Status implements Behaviour {

    VALID("Y", "有效"),

    INVALID("N", "无效");

    private String value;

    private String desc;

    private Status(String value, String desc) {
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
