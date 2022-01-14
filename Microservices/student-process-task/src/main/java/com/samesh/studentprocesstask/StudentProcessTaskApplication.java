package com.samesh.studentprocesstask;

import com.samesh.studentprocesstask.service.StudentProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class StudentProcessTaskApplication {

    @Bean
    StudentProcessTaskRunner getRunner(){
        return new StudentProcessTaskRunner();
    }
    public static void main(String[] args) {
        SpringApplication.run(StudentProcessTaskApplication.class, args);
    }

}
