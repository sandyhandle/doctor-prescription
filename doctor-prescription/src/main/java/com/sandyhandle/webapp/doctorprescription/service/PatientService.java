package com.sandyhandle.webapp.doctorprescription.service;

import com.sandyhandle.webapp.doctorprescription.model.db.Doctor;
import com.sandyhandle.webapp.doctorprescription.model.db.DoctorVisit;
import com.sandyhandle.webapp.doctorprescription.model.db.Patient;
import com.sandyhandle.webapp.doctorprescription.repository.DoctorRepository;
import com.sandyhandle.webapp.doctorprescription.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    final PatientRepository patientRepository;
    public void updatingPatientRepo(int patientId, DoctorVisit doctorVisit) {

        Patient patient = patientRepository.getById(patientId);
        patient.getDoctorVisitList().add(doctorVisit);

        patientRepository.save(patient);



    }

    public List<Patient> getAllDoctors() {
        return patientRepository.findAll();
    }
}
