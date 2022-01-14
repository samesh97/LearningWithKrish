package com.samesh.enrollservice.service;

import com.samesh.enrollservice.model.Response;
import enroll.Enroll;

import java.util.List;

public interface EnrollService {
    Enroll save(Enroll enroll);
    List<Enroll> getAll();
    Response findById(int id,boolean isDetailed);
}
