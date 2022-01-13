package com.samesh.studentservice.service;

import com.samesh.student.commons.model.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> getAllStudents();
    Student findById(int id);
    Student delete(int id);
}
