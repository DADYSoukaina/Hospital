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
	public Map<String, AppointmentDTO> getAll() {

		Map<String, Appointment> map = StaticDatabase.getAppointmentMap();

		Map<String, AppointmentDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put("Consultation", converter.toDTO(map.get("Consultation")));

		return result;
	}

}
