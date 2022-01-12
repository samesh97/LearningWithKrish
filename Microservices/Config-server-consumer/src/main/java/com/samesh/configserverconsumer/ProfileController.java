package com.samesh.configserverconsumer;

import com.samesh.configserverconsumer.model.StudentProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "profile")
public class ProfileController {

    @Autowired
    StudentProfileConfiguration studentProfileConfiguration;

    @RequestMapping(method = RequestMethod.GET)
    public StudentProfileConfiguration getConfig() {
        return studentProfileConfiguration;
    }
}
