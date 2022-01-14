package com.samesh.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.Student;

public interface StudentServiceRepository extends JpaRepository<Student,Integer> {
}
