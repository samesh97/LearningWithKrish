package comsamesh.hibernate.controller;

import comsamesh.hibernate.model.Student;
import comsamesh.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController
{
    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.POST)
    public Student save(@RequestBody Student student)
    {
        return studentService.save(student);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudent(@PathVariable int id)
    {
        Student student =  studentService.getStudent(id);
        if(student == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(student);
    }
}
