package com.hospital.is.transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.hospital.is.entity.Medication;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.MedicationDTO;
import com.hospital.is.model.PatientDTO;

public class MedicationConverter {
	public MedicationDTO toDTO(Medication medication) {
		MedicationDTO dto = new MedicationDTO();

		dto.setMedicationName(medication.getMedicationName());
		dto.setQuantity(medication.getQuantity());
		dto.setDurationOfUse(medication.getDurationOfUse());
		dto.setInstrutionOfUse(medication.getInstrutionOfUse());

		return dto;
	}

//entity
	public Medication toEntity(MedicationDTO dto) {
		Medication medication = new Medication();

		medication.setMedicationName(dto.getMedicationName());
		medication.setQuantity(dto.getQuantity());
		medication.setDurationOfUse(dto.getDurationOfUse());
		medication.setInstrutionOfUse(dto.getInstrutionOfUse());
		return medication;
	}

	public Map<String, MedicationDTO> toMapDTO(Map<String, Medication> mapMedication) {

		Map<String, MedicationDTO> medicationDTOMap = new HashMap<>();

		for (Entry<String, Medication> entry : mapMedication.entrySet()) {
			medicationDTOMap.put(entry.getKey(), toDTO(entry.getValue()));
		}

		// comment 2 cytfu

		return medicationDTOMap;
	}

}
