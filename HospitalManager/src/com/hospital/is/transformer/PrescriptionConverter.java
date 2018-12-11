package com.hospital.is.transformer;

import com.hospital.is.entity.Prescription;
import com.hospital.is.model.PrescriptionDTO;

public class PrescriptionConverter {
	
	PrescriptionDTO toDTO(Prescription prescription) {
	PrescriptionDTO dto = new PrescriptionDTO();

		dto.setDescriptionOfUse(prescription.getDescriptionOfUse());
	

		
		return dto;
	}

	Prescription toEntity(PrescriptionDTO dto) {
		Prescription prescription = new Prescription();
		
		prescription.setDescriptionOfUse(dto.getDescriptionOfUse());


		

		return prescription;
	}

}
