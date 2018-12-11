package com.hospital.is.transformer;

import com.hospital.is.entity.Medication;
import com.hospital.is.model.MedicationDTO;

public class MedicationConverter {
	public MedicationDTO toDTO(Medication medication) {
		MedicationDTO dto = new MedicationDTO();

		dto.setMedicationName(medication.getMedicationName());
		dto.setQuantity(medication.getQuantity());
		dto.setDurationOfUse(medication.getDurationOfUse());
		dto.setInstrutionOfUse(medication.getInstrutionOfUse());



		return dto;
	}

	public Medication toEntity(MedicationDTO dto) {
		Medication medication = new Medication();

		medication.setMedicationName(dto.getMedicationName());
		medication.setQuantity(dto.getQuantity());
		medication.setDurationOfUse(dto.getDurationOfUse());
		medication.setInstrutionOfUse(dto.getInstrutionOfUse());
		return medication;
	}

}
