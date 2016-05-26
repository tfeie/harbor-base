package com.the.harbor.base.validator.impl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.the.harbor.base.validator.StringEnum;

public class StringEnumeValidator implements ConstraintValidator<StringEnum, String> {

    List<String> valueList = null;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || "".equals(value.trim())) {
            return true;
        }
        if (!valueList.contains(value.toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override
    public void initialize(StringEnum stringEnum) {
        valueList = new ArrayList<String>();
        Class<? extends Enum<?>> enumClass = stringEnum.enumClazz();
        if (enumClass == null) {
            throw new IllegalArgumentException("The enumClass parameter cannot be null.");
        }

        @SuppressWarnings("rawtypes")
        Enum[] enumValArr = enumClass.getEnumConstants();

        for (@SuppressWarnings("rawtypes")
        Enum enumVal : enumValArr) {
            valueList.add(enumVal.toString().toUpperCase());
        }

    }

}