package com.sandyhandle.webapp.doctorprescription.repository;

import com.sandyhandle.webapp.doctorprescription.model.db.DoctorVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<DoctorVisit, Integer> {
}
