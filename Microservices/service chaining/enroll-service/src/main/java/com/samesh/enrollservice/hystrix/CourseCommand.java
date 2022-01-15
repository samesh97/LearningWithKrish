package com.samesh.enrollservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import course.Course;
import org.springframework.web.client.RestTemplate;
import student.Student;

public class CourseCommand extends HystrixCommand<Course> {

    private final RestTemplate restTemplate;
    private final int courseId;

     public CourseCommand(RestTemplate restTemplate, int courseId){
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate = restTemplate;
        this.courseId = courseId;
    }

    @Override
    protected Course run() throws Exception {
        return restTemplate.getForObject("http://course-service/services/course/" + courseId,Course.class);
    }

    @Override
    protected Course getFallback() {
        return new Course();
    }
}
