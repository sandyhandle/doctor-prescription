package com.sandyhandle.webapp.doctorprescription.model.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "visit_details")
public class DoctorVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int doctorId;
    private int patientId;
    private Instant date;
    private String prescription;


}
