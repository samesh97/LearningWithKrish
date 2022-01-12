package comsamesh.hibernate.service;

import comsamesh.hibernate.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService
{
    Student save(Student student);
    List<Student> getAllStudents();
    Student getStudent(int id);
}
