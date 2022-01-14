package com.samesh.courseservice.repository;

import course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseServiceRepository extends JpaRepository<Course,Integer> {
}
