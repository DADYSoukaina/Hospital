/**
 * 
 */
package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Appointment;
import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.service.AppointmentService;
import com.hospital.is.transformer.AppointmentConverter;

public class AppointmentServiceImpl extends ServiceImpl<AppointmentDTO> implements AppointmentService {
	private AppointmentConverter converter = new AppointmentConverter();

	@Override
	public Map<Long, AppointmentDTO> getAll() {

		Map<Long, Appointment> map = StaticDatabase.getAppointmentMap();

		Map<Long, AppointmentDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put(1l, converter.toDTO(map.get(1l)));

		return result;
	}

	@Override
	public AppointmentDTO create(AppointmentDTO t) {
		
		// TODO Auto-generated method stub
		return super.create(t);
	}

	@Override
	public AppointmentDTO getById(long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public AppointmentDTO update(AppointmentDTO t, long id) {
		// TODO Auto-generated method stub
		return super.update(t, id);
	}
	
//	public Appointment update(Appointment appointment , long id) {
//	while(appointment.getId() == id) {
//		appointment.setDateTimeAppointment(appointment.getDateTimeAppointment());
//		appointment.setTypeAppointment(appointment.getTypeAppointment());
//	}
//	return appointment;
//	}

}
