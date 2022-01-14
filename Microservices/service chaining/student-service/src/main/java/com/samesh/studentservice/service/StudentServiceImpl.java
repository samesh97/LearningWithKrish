package com.samesh.studentservice.service;

import com.samesh.studentservice.repository.StudentServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentServiceRepository studentServiceRepository;

    @Override
    public List<Student> getStudents() {
        return studentServiceRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        if(studentServiceRepository.findById(id).isPresent())
            return studentServiceRepository.findById(id).get();
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentServiceRepository.save(student);
    }
}
