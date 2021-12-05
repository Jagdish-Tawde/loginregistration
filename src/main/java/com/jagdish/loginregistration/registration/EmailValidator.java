package com.jagdish.loginregistration.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // to do : regex for validation of email
        return true;
    }
}
