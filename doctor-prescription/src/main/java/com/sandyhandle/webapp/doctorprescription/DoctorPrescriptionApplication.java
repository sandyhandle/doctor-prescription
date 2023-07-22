package com.sandyhandle.webapp.doctorprescription;

import com.sandyhandle.webapp.doctorprescription.model.db.Doctor;
import com.sandyhandle.webapp.doctorprescription.model.db.DoctorVisit;
import com.sandyhandle.webapp.doctorprescription.model.db.Patient;
import com.sandyhandle.webapp.doctorprescription.repository.DoctorRepository;
import com.sandyhandle.webapp.doctorprescription.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DoctorPrescriptionApplication {

	public static void main(String[] args) {

		SpringApplication.run(DoctorPrescriptionApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(PatientRepository patientRepository){
//		return args -> {
//			Patient patient = Patient.builder()
//					.age(45)
//					.Name("Kalpana")
//					.doctorVisitList(new ArrayList<DoctorVisit>())
//					.build();
//
//			patientRepository.save(patient);
//		};
//	}

}
