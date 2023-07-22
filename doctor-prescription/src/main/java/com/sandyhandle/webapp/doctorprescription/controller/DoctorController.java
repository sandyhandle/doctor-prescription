package com.sandyhandle.webapp.doctorprescription.controller;

import com.sandyhandle.webapp.doctorprescription.model.db.Doctor;
import com.sandyhandle.webapp.doctorprescription.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {

    @Autowired
    private final DoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        return new ResponseEntity<>(doctorService.getAllDoctors(), HttpStatus.OK);
    }
}
