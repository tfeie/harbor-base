package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum MaritalStatus implements Behaviour {

    MARRIED("Y", "已婚"),

    UNMARRIED("N", "未婚");

    private String value;

    private String desc;

    private MaritalStatus(String value, String desc) {
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
