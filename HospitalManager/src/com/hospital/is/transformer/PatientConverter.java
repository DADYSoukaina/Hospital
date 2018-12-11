package com.hospital.is.transformer;

import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter {

	PatientDTO toDTO(Patient patient) {
		PatientDTO dto = new PatientDTO();

		dto.setFirstName(patient.getFirstName());

		return dto;
	}

	Patient toEntity(PatientDTO patientDto) {
		Patient dto = new Patient();

		dto.setFirstName(patientDto.getFirstName());

		return dto;
	}

}
