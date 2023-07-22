package com.sandyhandle.webapp.doctorprescription.service;

import com.sandyhandle.webapp.doctorprescription.model.PrescriptionRequest;
import com.sandyhandle.webapp.doctorprescription.model.db.DoctorVisit;
import com.sandyhandle.webapp.doctorprescription.repository.PatientRepository;
import com.sandyhandle.webapp.doctorprescription.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class PrescriptionService {
    @Autowired
    private final VisitRepository visitRepository;
    @Autowired
    private final DoctorService doctorService;
    @Autowired
    private final PatientService patientService;
    public void addingPrescriptionToPatient(PrescriptionRequest prescriptionRequest, int doctorId) {
        DoctorVisit doctorVisit = DoctorVisit.builder()
                .date(Instant.now())
                .doctorId(doctorId)
                .patientId(prescriptionRequest.getPatientId())
                .prescription(prescriptionRequest.getPrescription())
                .build();
        visitRepository.save(doctorVisit);
        doctorService.updatingDoctorRepo(doctorId,doctorVisit);
        patientService.updatingPatientRepo(prescriptionRequest.getPatientId(), doctorVisit);
    }
}
