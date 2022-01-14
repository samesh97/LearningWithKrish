package com.samesh.enrollservice.repository;

import enroll.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollServiceRepository extends JpaRepository<Enroll,Integer> {
}
