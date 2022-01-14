package com.samesh.enrollservice.model;

import course.Course;
import enroll.Enroll;
import lombok.Data;
import student.Student;

@Data
public class SimpleResponse implements Response{
    private Enroll enroll;

    public SimpleResponse(Enroll enroll) {
        this.enroll = enroll;
    }
}
