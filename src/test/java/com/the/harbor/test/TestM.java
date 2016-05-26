package com.the.harbor.test;

import com.the.harbor.base.enumeration.hyuser.UserType;

public class TestM {

    public static void main(String[] args) {

        System.out.println(UserType.ANONYMOUS_USER.getValue());

        if (!"10".equals(UserType.ANONYMOUS_USER.getValue())) {
            throw new RuntimeException("类型错误");
        }
    }

}
