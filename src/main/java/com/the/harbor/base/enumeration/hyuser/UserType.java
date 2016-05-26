package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum UserType implements Behaviour {

    ORDINARY_USER("10", "普通用户"),

    PUBLIC_SPIRITED_USER("20", "公益用户"),

    ANONYMOUS_USER("30", "匿名用户");

    private String value;

    private String desc;

    private UserType(String value, String desc) {
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
