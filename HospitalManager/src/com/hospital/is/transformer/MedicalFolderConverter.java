package com.hospital.is.transformer;

import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.model.MedicalFolderDTO;

public class MedicalFolderConverter extends AbstractConverter<MedicalFolder, MedicalFolderDTO> {

	private AppointmentConverter appointmentConverter;
	private DiseaseConverter diseaseConverter;
	private PrescriptionConverter prescriptionConverter;

	public MedicalFolderDTO toDTO(MedicalFolder MedicalFolder) {

		MedicalFolderDTO dto = new MedicalFolderDTO();

		dto.setAppointmentMap(appointmentConverter.toMapDTO(MedicalFolder.getAppointmentMap()));
		dto.setDiseaseMap(diseaseConverter.toMapDTO(MedicalFolder.getDiseaseMap()));
		dto.setPrescriptionMap(prescriptionConverter.toMapDTO(MedicalFolder.getPrescriptionMap()));

		return dto;
	}

	public MedicalFolder toEntity(MedicalFolderDTO MedicalFolderDTO) {

		MedicalFolder entity = new MedicalFolder();

		entity.setAppointmentMap(appointmentConverter.toMapEntity(MedicalFolderDTO.getAppointmentMap()));
		entity.setDiseaseMap(diseaseConverter.toMapEntity(MedicalFolderDTO.getDiseaseMap()));
		entity.setPrescriptionMap(prescriptionConverter.toMapEntity(MedicalFolderDTO.getPrescriptionMap()));

		return entity;
	}

}
