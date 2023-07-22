package com.sandyhandle.webapp.doctorprescription.controller;

import com.sandyhandle.webapp.doctorprescription.model.db.Patient;
import com.sandyhandle.webapp.doctorprescription.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    @Autowired
    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> getAllDoctors(){
        return new ResponseEntity<>(patientService.getAllDoctors(), HttpStatus.OK);
    }
}
