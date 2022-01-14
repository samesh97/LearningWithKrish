package com.samesh.courseservice.service;

import course.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);
    List<Course> getAll();
    Course getById(int id);
}
