package com.hospital.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hospital.is.model.AppointmentDTO;
import com.hospital.is.model.DiseaseDTO;
import com.hospital.is.model.DoctorDTO;
import com.hospital.is.model.MedicalFolderDTO;
import com.hospital.is.model.PatientDTO;

public class StaticDatabase {

	public static Map<String, Object> getGenericMap(String key) {

		switch (key) {
		case "Patient":
			return getPatientList();
//		case "Disease":
//			return getPatientList();
//		case "Appointment":
//			return getPatientList();
//		case "MedicalFolder":
//			return getPatientList();

		default:
			break;
		}

		return null;
	}

	/**
	 * @return the diseaseList
	 */
	public static Map<Integer, DiseaseDTO> getDiseaseList() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Integer, DiseaseDTO> diseaseList = new HashMap<Integer, DiseaseDTO>();

		DiseaseDTO disease = new DiseaseDTO();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseList.put(1, disease);

		return diseaseList;
	}

	/**
	 * 
	 * @return
	 */
	public static Map<Integer, AppointmentDTO> getAppointmentList() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Integer, AppointmentDTO> appointmentList = new HashMap<Integer, AppointmentDTO>();

		AppointmentDTO appointment = new AppointmentDTO();
		appointment.setDateTimeAppointment(null);
		appointment.setDoctor(new DoctorDTO());
		appointment.setPrescriptionList(null);
		appointment.setTypeAppointment("Consultation");

		appointmentList.put(1, appointment);

		return appointmentList;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<Integer, MedicalFolderDTO> getMedicalFolderList() {
		// List<MedicalFolder> medicalFolderList = new ArrayList<>();
		Map<Integer, MedicalFolderDTO> medicalFolderList = new HashMap<Integer, MedicalFolderDTO>();
		MedicalFolderDTO medicalFolder = new MedicalFolderDTO();

		medicalFolder.setDiseaseList(getDiseaseList());

		medicalFolderList.put(1, medicalFolder);

		return medicalFolderList;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, Object> getPatientList() {

		List<PatientDTO> patientList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

		PatientDTO patient = new PatientDTO();

		patient.setMedicalFolder(getMedicalFolderList().get(0));
		patient.setFirstName("Majda");
		patient.setLastName("AMCHICHI");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");

		patientList.add(patient);

		map.put(patient.getLastName() + patient.getFirstName(), patient);

		return map;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, DoctorDTO> getDoctorList() {

		List<DoctorDTO> doctorList = new ArrayList<>();
		Map<String, DoctorDTO> map = new HashMap<>();

		DoctorDTO doctor = new DoctorDTO();

		doctor.setFirstName("Ahmed");
		doctor.setLastName("BENANI");
		doctor.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		doctor.setBirthDate("01/01/1974");
		doctor.setPhone("+212 6 66 77 88 77");

		doctorList.add(doctor);

		map.put(doctor.getLastName() + doctor.getFirstName(), doctor);

		return map;
	}

}
