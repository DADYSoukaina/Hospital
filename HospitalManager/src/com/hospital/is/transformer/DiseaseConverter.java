package com.hospital.is.transformer;

import com.hospital.is.entity.Disease;
import com.hospital.is.model.DiseaseDTO;


public class DiseaseConverter extends AbstractConverter<Disease,DiseaseDTO> {

	public DiseaseDTO toDTO(Disease disease) {
		DiseaseDTO dto = new DiseaseDTO();

		dto.setNature(disease.getNature());
		dto.setDescription(disease.getDescription());
		dto.setState(disease.getState());
		dto.setDiagDate(disease.getDiagDate());

		
		return dto;
	}

	public Disease toEntity(DiseaseDTO dto) {
		Disease disease = new Disease();

		disease.setNature(dto.getNature());
		disease.setDescription(dto.getDescription());
		disease.setState(dto.getState());
		disease.setDiagDate(dto.getDiagDate());
		

		return disease;
	}
	

}
