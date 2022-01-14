package com.samesh.studentservice.controller;

import com.samesh.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import student.Student;

import java.util.List;

@RestController
@RequestMapping(value = "services/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
}
