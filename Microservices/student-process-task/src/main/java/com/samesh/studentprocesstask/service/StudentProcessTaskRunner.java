package com.samesh.studentprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class StudentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    StudentProcessService service;

    @Override
    public void run(String... args) throws Exception {

        if(args.length > 0)
        {
            System.out.println("Task running with args");
            if(service.validateDL(args[0]))
                System.out.println("Valid driving license");
            else
                System.out.println("Invalid driving license");
        }
        else
            System.out.println("Task running without args");


    }
}
