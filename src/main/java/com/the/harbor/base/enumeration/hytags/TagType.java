package com.the.harbor.base.enumeration.hytags;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TagType implements Behaviour {

    INTEREST("10", "兴趣标签"),

    SKILL("20", "技能标签");

    private String value;

    private String desc;

    private TagType(String value, String desc) {
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
