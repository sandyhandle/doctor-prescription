package com.sandyhandle.webapp.doctorprescription.controller;

import com.sandyhandle.webapp.doctorprescription.model.PrescriptionRequest;
import com.sandyhandle.webapp.doctorprescription.service.PrescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescription")
@RequiredArgsConstructor
public class PrescriptionController {

    @Autowired
    private final PrescriptionService prescriptionService;

    @PostMapping("/{id}")
    public ResponseEntity<String> addingPrescriptionToPatient(@RequestBody PrescriptionRequest prescriptionRequest,
                                                              @PathVariable("id") int id){


        prescriptionService.addingPrescriptionToPatient(prescriptionRequest,id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
