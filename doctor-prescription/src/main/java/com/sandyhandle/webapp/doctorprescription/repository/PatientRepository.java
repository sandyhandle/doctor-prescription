package com.sandyhandle.webapp.doctorprescription.repository;

import com.sandyhandle.webapp.doctorprescription.model.db.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
