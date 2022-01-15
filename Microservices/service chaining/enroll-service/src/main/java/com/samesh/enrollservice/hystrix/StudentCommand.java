package com.samesh.enrollservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;
import student.Student;

public class StudentCommand extends HystrixCommand<Student> {

    private final RestTemplate restTemplate;
    private final int studentId;

     public StudentCommand(RestTemplate restTemplate,int studentId){
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate = restTemplate;
        this.studentId = studentId;
    }

    @Override
    protected Student run() throws Exception {
        return restTemplate.getForObject("http://student-service/services/student/" + studentId,Student.class);
    }

    @Override
    protected Student getFallback() {
        return new Student();
    }
}
