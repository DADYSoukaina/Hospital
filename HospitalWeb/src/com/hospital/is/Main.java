package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.service.AppointmentService;
import com.hospital.is.service.impl.AppointmentServiceImpl;

public class Main {

	public static void main(String[] args) {

		AppointmentService AppointmentService = new AppointmentServiceImpl();

		Map<String, AppointmentDTO> map = AppointmentService.getAll();
		
		System.out.println(map);
	}
}
