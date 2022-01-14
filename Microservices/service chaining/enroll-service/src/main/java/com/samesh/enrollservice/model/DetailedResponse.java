package com.samesh.enrollservice.model;

import course.Course;
import enroll.Enroll;
import lombok.Data;
import student.Student;
@Data
public class DetailedResponse implements Response{
    private Student student;
    private Course course;
    private Enroll enroll;

    public DetailedResponse(Student student, Course course,Enroll enroll) {
        this.student = student;
        this.course = course;
        this.enroll = enroll;
    }
}
