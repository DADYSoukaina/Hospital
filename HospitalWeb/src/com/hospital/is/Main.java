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
		Map<String, PatientDTO> map = patientService.getAll();
		System.out.println(map);

		AppointmentService AppointmentService = new AppointmentServiceImpl();
		Map<String, AppointmentDTO> map1 = AppointmentService.getAll();
		System.out.println(map1);

		MedicalFolderService medicalFolderService = new MedicalFolderServiceImpl();
		Map<String, MedicalFolderDTO> map2 = medicalFolderService.getAll();
		System.out.println(map2);

	}
}
