package com.samesh.enrollservice.controller;

import com.samesh.enrollservice.model.Response;
import com.samesh.enrollservice.service.EnrollService;
import enroll.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "services/enroll")
public class EnrollController {

    @Autowired
    EnrollService enrollService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Enroll> getStudents() {
        return enrollService.getAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Response getStudent(@PathVariable int id, @RequestParam(required = false) String type) {
        if(type == null)
            return enrollService.findById(id,false);
        return enrollService.findById(id,true);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Enroll save(@RequestBody Enroll enroll) {
        return enrollService.save(enroll);
    }

}
