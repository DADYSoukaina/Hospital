package com.hospital.is.transformer;

import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;

public class AppointmentConverter {

	AppointmentDTO toDTO(Appointment appointment) {
		AppointmentDTO dto = new AppointmentDTO();

		dto.setDateTimeAppointment(appointment.getDateTimeAppointment());
		dto.setTypeAppointment(appointment.getTypeAppointment());
	

		
		return dto;
	}

	Appointment toEntity(AppointmentDTO dto) {
		Appointment appointment = new Appointment();

		appointment.setDateTimeAppointment(dto.getDateTimeAppointment());
		appointment.setTypeAppointment(dto.getTypeAppointment());

		

		return appointment;
	}
}
