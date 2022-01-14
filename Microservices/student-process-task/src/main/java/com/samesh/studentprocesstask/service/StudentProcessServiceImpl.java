package com.samesh.studentprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class StudentProcessServiceImpl implements StudentProcessService {


    @Override
    public boolean validateDL(String dlNumber) {
        return dlNumber.length() > 5;
    }
}
