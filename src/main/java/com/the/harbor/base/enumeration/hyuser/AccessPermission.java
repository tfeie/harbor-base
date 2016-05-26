package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AccessPermission implements Behaviour {

    ALL_ALLOWED("10", "所有人可见"),

    FRIENDS_ALLOWED("20", "好友可见"),

    NONE_ALLOWED("30", "任何人不可见");

    private String value;

    private String desc;

    private AccessPermission(String value, String desc) {
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
