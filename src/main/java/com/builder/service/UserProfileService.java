package com.builder.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Value("${test.var}")
    private String testVar;

    public String testVar() {
        System.out.println("============== " + testVar);
        return testVar;

    }
}
