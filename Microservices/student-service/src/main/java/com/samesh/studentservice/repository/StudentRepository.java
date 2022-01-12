package com.samesh.studentservice.repository;

import com.samesh.student.commons.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
