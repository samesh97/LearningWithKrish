package com.samesh.courseservice.service;

import com.samesh.courseservice.repository.CourseServiceRepository;
import course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseServiceRepository courseServiceRepository;

    @Override
    public Course save(Course course) {
        return courseServiceRepository.save(course);
    }

    @Override
    public List<Course> getAll() {
        return courseServiceRepository.findAll();
    }

    @Override
    public Course getById(int id) {
        if(courseServiceRepository.findById(id).isPresent())
            return courseServiceRepository.findById(id).get();
        return null;
    }
}
