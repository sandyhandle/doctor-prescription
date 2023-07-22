package com.sandyhandle.webapp.doctorprescription.service;

import com.sandyhandle.webapp.doctorprescription.model.PrescriptionRequest;
import com.sandyhandle.webapp.doctorprescription.model.db.Doctor;
import com.sandyhandle.webapp.doctorprescription.model.db.DoctorVisit;
import com.sandyhandle.webapp.doctorprescription.repository.DoctorRepository;
import com.sandyhandle.webapp.doctorprescription.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    @Autowired
    final DoctorRepository doctorRepository;
    public void updatingDoctorRepo(int doctorId, DoctorVisit doctorVisit) {

        Doctor doctor = doctorRepository.getById(doctorId);
        doctor.getDoctorVisitList().add(doctorVisit);

        doctorRepository.save(doctor);



    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
