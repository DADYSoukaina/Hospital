package com.hospital.is.transformer;


import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;

public class AppointmentConverter {
	

	public AppointmentDTO toDTO(Appointment appointment) {
		AppointmentDTO dto = new AppointmentDTO();

		dto.setDateTimeAppointment(appointment.getDateTimeAppointment());
		dto.setTypeAppointment(appointment.getTypeAppointment());
	

		
		return dto;
	}

	public Appointment toEntity(AppointmentDTO dto) {
		Appointment appointment = new Appointment();

		appointment.setDateTimeAppointment(dto.getDateTimeAppointment());
		appointment.setTypeAppointment(dto.getTypeAppointment());

		

		return appointment;
	}
	public Map<String,AppointmentDTO> toMapDTO(Map<String,Appointment> appointmentMap) {
		Map<String,AppointmentDTO> appointmentdto=new HashMap<>();
		for(Entry<String, Appointment> entry : appointmentMap.entrySet()) {
			appointmentdto.put(entry.getKey(),toDTO(entry.getValue()));
		}
		 return appointmentdto;

	}
	
	
		
	public Map<String,Appointment> toMapEntity(Map<String,AppointmentDTO> appointmentdto) {
		Map<String,Appointment> appointmentMap=new HashMap<>();
		for(Entry<String, AppointmentDTO> entry : appointmentdto.entrySet()) {
			appointmentMap.put(entry.getKey(),toEntity(entry.getValue()));
		}
		 return appointmentMap;
		
	}
}
