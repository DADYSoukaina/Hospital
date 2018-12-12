package com.hospital.is.transformer;

import java.security.KeyStore.Entry;
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
	public Map<String,AppointmentDTO> toMapDTO(Map<Integer,Appointment> appointment) {
		Map<Integer,AppointmentDTO> dtoMap=new HashMap();
		for(Entry<Integer,Appointment> entry : appointment.entrySet()) {
			dtoMap.put(entry.getKey(),toDTO(entry.getValue()));
		}
		 return dtoMap;

	}
	public Appointment toMapEntity(AppointmentDTO dto) {
		
	}
}
