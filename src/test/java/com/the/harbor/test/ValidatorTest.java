package com.the.harbor.test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidatorTest {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person("zhang@126.com", "10");
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        System.out.println(constraintViolations);

    }

}
