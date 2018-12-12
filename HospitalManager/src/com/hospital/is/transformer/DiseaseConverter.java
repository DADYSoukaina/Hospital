package com.hospital.is.transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.hospital.is.entity.Disease;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.DiseaseDTO;
import com.hospital.is.model.PatientDTO;

public class DiseaseConverter {

	DiseaseDTO toDTO(Disease disease) {
		DiseaseDTO dto = new DiseaseDTO();

		dto.setNature(disease.getNature());
		dto.setDescription(disease.getDescription());
		dto.setState(disease.getState());
		dto.setDiagDate(disease.getDiagDate());

		
		return dto;
	}

	Disease toEntity(DiseaseDTO dto) {
		Disease disease = new Disease();

		disease.setNature(dto.getNature());
		disease.setDescription(dto.getDescription());
		disease.setState(dto.getState());
		disease.setDiagDate(dto.getDiagDate());
		

		return disease;
	}
	
public Map<String, DiseaseDTO> toMapDTO(Map<String, Disease> mapDisease) {
		
		Map<String, DiseaseDTO> diseaseDtoMap = new HashMap<>();
		
		for(Entry<String, Disease> entry : mapDisease.entrySet()) {
			diseaseDtoMap.put(entry.getKey(), toDTO(entry.getValue()));
		}
		
		return diseaseDtoMap;
	}

public Map<String, Disease> toMapEntity(Map<String, DiseaseDTO> mapDiseaseDTO) {
	
	Map<String, Disease> diseaseMap = new HashMap<String,Disease>();
	
	for(Entry<String, DiseaseDTO> entry : mapDiseaseDTO.entrySet()) {
		diseaseMap.put(entry.getKey(), toEntity(entry.getValue()));
	}
	
	return diseaseMap;
}
	
}
