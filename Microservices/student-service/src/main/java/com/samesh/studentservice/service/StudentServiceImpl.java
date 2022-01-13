package com.samesh.studentservice.service;

import com.samesh.student.commons.model.Student;
import com.samesh.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        if(studentRepository.findById(id).isPresent())
            return studentRepository.findById(id).get();
        return null;
    }

    @Override
    public Student delete(int id) {
        studentRepository.deleteById(id);
        return null;
    }
}
