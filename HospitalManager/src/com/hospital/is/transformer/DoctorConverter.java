package com.hospital.is.transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.hospital.is.entity.Appointment;
import com.hospital.is.entity.Doctor;
import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.model.DoctorDTO;

public class DoctorConverter {
	
	public DoctorDTO toDTO(Doctor doctor) {
		DoctorDTO dto = new DoctorDTO();

		dto.setRegistrationNumber(doctor.getRegistrationNumber());
		dto.setSpecialite(doctor.getSpecialite());
	

		
		return dto;
	}

	public Doctor toEntity(DoctorDTO dto) {
		Doctor doctor = new Doctor();

		doctor.setRegistrationNumber(dto.getRegistrationNumber());
		doctor.setSpecialite(dto.getSpecialite());

		

		return doctor;
	}
	public Map<Long,DoctorDTO> toMapDTO(Map<Long,Doctor> doctorMap) {
		Map<Long,DoctorDTO> doctordto=new HashMap<>();
		for(Entry<Long,Doctor> entry : doctorMap.entrySet()) {
			doctordto.put(entry.getKey(),toDTO(entry.getValue()));
		}
		 return doctordto;

	}
	
	//Ajouter toMapEntity
		
	public Map<String,Doctor> toMapEntity(Map<String,DoctorDTO> doctordto) {
		Map<String,Doctor> doctorMap=new HashMap<>();
		for(Entry<String, DoctorDTO> entry : doctordto.entrySet()) {
			doctorMap.put(entry.getKey(),toEntity(entry.getValue()));
		}
		 return doctorMap;
		
	}

}
