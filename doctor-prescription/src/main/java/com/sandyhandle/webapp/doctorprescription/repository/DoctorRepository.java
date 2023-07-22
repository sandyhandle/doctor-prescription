package com.sandyhandle.webapp.doctorprescription.repository;

import com.sandyhandle.webapp.doctorprescription.model.db.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
