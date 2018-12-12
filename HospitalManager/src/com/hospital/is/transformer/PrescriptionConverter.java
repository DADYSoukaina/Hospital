package com.hospital.is.transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
	public Map<String,PrescriptionDTO> toMapDTO(Map<String,Prescription> prescriptionMap) {
		Map<String,PrescriptionDTO> prescriptiondto=new HashMap<>();
		for(Entry<String,Prescription> entry : prescriptionMap.entrySet()) {
			prescriptiondto.put(entry.getKey(),toDTO(entry.getValue()));
		}
		 return prescriptiondto;

	}
	
	//Ajouter toMapEntity
		
	public Map<String,Prescription> toMapEntity(Map<String,PrescriptionDTO> prescriptiondto) {
		Map<String,Prescription> prescriptionMap=new HashMap<>();
		for(Entry<String, PrescriptionDTO> entry : prescriptiondto.entrySet()) {
			prescriptionMap.put(entry.getKey(),toEntity(entry.getValue()));
		}
		 return prescriptionMap;
		
	}

}
