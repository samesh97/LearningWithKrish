package com.samesh.studentservice.service;

import student.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    Student getStudent(int id);
    Student save(Student student);
}
