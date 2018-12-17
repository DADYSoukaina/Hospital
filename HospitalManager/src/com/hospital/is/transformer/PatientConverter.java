package com.hospital.is.transformer;

import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;

public class PatientConverter extends AbstractConverter<Patient,PatientDTO>{

	
	public PatientDTO toDTO(Patient patient) {
		PatientDTO dto = new PatientDTO();
		dto.setFirstName(patient.getFirstName());
		dto.setLastName(patient.getLastName());
		dto.setAddress(patient.getAddress());
		dto.setPhone(patient.getPhone());
		dto.setBirthDate(patient.getBirthDate());

		return dto;
	}

	public Patient toEntity(PatientDTO dto) {
		Patient patient = new Patient();

		patient.setFirstName(dto.getFirstName());
		patient.setLastName(dto.getLastName());
		patient.setAddress(dto.getAddress());
		patient.setPhone(dto.getPhone());
		patient.setBirthDate(dto.getBirthDate());

		return patient;
	}



	
}
