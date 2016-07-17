package com.the.harbor.base.enumeration.hytags;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum ShowFlag implements Behaviour {

	INDEX_PAGE("10", "显示在首页的标签"),

	ACTUAL_PAGE("20", "实际页面的标签");

    private String value;

    private String desc;

    private ShowFlag(String value, String desc) {
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
