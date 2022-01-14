package com.samesh.courseservice.controller;

import com.samesh.courseservice.service.CourseService;
import course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "services/course/")
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Course> getCourses() {
        return courseService.getAll();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Course getCourse(@PathVariable int id) {
        return courseService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }
}
