package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.model.MedicalFolderDTO;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.AppointmentService;
import com.hospital.is.service.MedicalFolderService;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.AppointmentServiceImpl;
import com.hospital.is.service.impl.MedicalFolderServiceImpl;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		PatientService patientService = new PatientServiceImpl();
		Map<Long, PatientDTO> map = patientService.getAll();
		PatientDTO id = patientService.getById(1);
		System.out.println(id);
		System.out.println(map);

		AppointmentService appointmentService = new AppointmentServiceImpl();
		Map<Long, AppointmentDTO> map1 = appointmentService.getAll();
		System.out.println(map1);

		MedicalFolderService medicalFolderService = new MedicalFolderServiceImpl();
		Map<Long, MedicalFolderDTO> map2 = medicalFolderService.getAll();
		System.out.println(map2);

	}
}
