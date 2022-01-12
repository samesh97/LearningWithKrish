package com.samesh.configserverconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StudentProfileConfiguration {

    @Autowired
    Environment environment;

    public String getIsLog()
    {
        return environment.getProperty("student.log");
    }
}
