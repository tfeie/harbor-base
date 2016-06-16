package com.the.harbor.base.enumeration.dict;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TypeCode implements Behaviour {

	HY_USER("HY_USER", "HY_USER");

    private String value;

    private String desc;

    private TypeCode(String value, String desc) {
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
