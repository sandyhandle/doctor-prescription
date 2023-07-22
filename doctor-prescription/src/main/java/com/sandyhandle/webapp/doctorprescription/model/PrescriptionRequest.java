package com.sandyhandle.webapp.doctorprescription.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrescriptionRequest {
    private int patientId;
    private String prescription;
}
