package com.samesh.enrollservice.service;

import com.samesh.enrollservice.model.DetailedResponse;
import com.samesh.enrollservice.model.Response;
import com.samesh.enrollservice.model.SimpleResponse;
import com.samesh.enrollservice.repository.EnrollServiceRepository;
import course.Course;
import enroll.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import student.Student;

import java.util.List;

@Service
public class EnrollServiceImpl implements EnrollService{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EnrollServiceRepository enrollServiceRepository;

    @Override
    public Enroll save(Enroll enroll) {
        return enrollServiceRepository.save(enroll);
    }

    @Override
    public List<Enroll> getAll() {
        return enrollServiceRepository.findAll();
    }

    @Override
    public Response findById(int id,boolean isDetailed) {
        if(enrollServiceRepository.findById(id).isPresent()) {

            Enroll enroll = enrollServiceRepository.findById(id).get();
            if(isDetailed){
                Student student = getStudent(enroll.getStudentId());
                Course course = getCourse(enroll.getCourseId());
                return new DetailedResponse(student,course,enroll);
            }
            return new SimpleResponse(enroll);

        }
        return null;
    }

    private Student getStudent(int id){
        return restTemplate.getForObject("http://student-service/services/student/" + id,Student.class);
    }
    private Course getCourse(int id){
        return restTemplate.getForObject("http://course-service/services/course/" + id,Course.class);
    }
}
