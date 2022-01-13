package com.samesh.studentservice.controller;

import com.samesh.student.commons.model.Student;
import com.samesh.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "services")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    public Student deleteById(@PathVariable int id) {
        return studentService.delete(id);
    }
}
