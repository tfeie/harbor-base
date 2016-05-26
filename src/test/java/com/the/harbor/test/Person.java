package com.the.harbor.test;

import org.hibernate.validator.constraints.Email;

import com.the.harbor.base.enumeration.hyuser.UserType;
import com.the.harbor.base.validator.StringEnum;

public class Person {

    @Email(message = "邮箱格式不正确")
    private String email;

    @StringEnum(enumClazz = UserType.class, message = "用户类型取值不正确")
    private String userType;

    public Person(String email, String userType) {
        this.email = email;
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
