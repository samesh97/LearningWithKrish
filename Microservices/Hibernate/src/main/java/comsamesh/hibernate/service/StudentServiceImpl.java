package comsamesh.hibernate.service;

import comsamesh.hibernate.model.Student;
import comsamesh.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService
{
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
    public Student getStudent(int id) {
        if(studentRepository.findById(id).isPresent()) return studentRepository.findById(id).get();
        else return null;
    }
}
