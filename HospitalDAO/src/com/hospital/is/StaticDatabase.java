package com.hospital.is;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.entity.Appointment;
import com.hospital.is.entity.Disease;
import com.hospital.is.entity.Doctor;
import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.entity.Medication;
import com.hospital.is.entity.Patient;
import com.hospital.is.entity.Prescription;

public class StaticDatabase {

	public static Map<String, Object> getGenericMap(String key) {

		switch (key) {
//		case "Patient":
//			return getPatientList();
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
	public static Map<String, Disease> getDiseaseMap() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<String, Disease> diseaseMap = new HashMap<String, Disease>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseMap.put("gastro", disease);

		return diseaseMap;
	}

	public static Map<String, Prescription> getPrescriptionMap() {
		Map<String, Prescription> prescriptionMap = new HashMap<String, Prescription>();
		Map<String, Medication> medicationMap = new HashMap<String, Medication>();

		Prescription prescription = new Prescription();

		prescription.setMedicationMap(medicationMap);
		prescription.setDescriptionOfUse("Description of use");

		prescriptionMap.put("Description of use", prescription);

		return prescriptionMap;
	}

	/**
	 * 
	 * @return
	 */
	public static Map<String, Appointment> getAppointmentMap() {
		Map<String, Appointment> appointmentMap = new HashMap<String, Appointment>();
		Map<String, Prescription> mapPrescription = new HashMap<String, Prescription>();

		Appointment appointment = new Appointment();
		appointment.setDateTimeAppointment("12/12/2018");
		appointment.setDoctor(new Doctor());
		appointment.setPrescriptionMap(mapPrescription);
		appointment.setTypeAppointment("Consultation");

		appointmentMap.put("Consultation", appointment);

		return appointmentMap;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<String, MedicalFolder> getMedicalFolderMap() {
		Map<String, MedicalFolder> medicalFolderMap = new HashMap<String, MedicalFolder>();
		MedicalFolder medicalFolder = new MedicalFolder();

		Map<String, Prescription> mapPrescription = new HashMap<String, Prescription>();
		Map<String, Disease> mapDisease = new HashMap<String, Disease>();
		Map<String, Appointment> mapAppointment = new HashMap<String, Appointment>();

		medicalFolder.setDiseaseMap(mapDisease);
		medicalFolder.setPrescriptionMap(mapPrescription);
		medicalFolder.setAppointmentMap(mapAppointment);

		medicalFolderMap.put("FolderID", medicalFolder);

		return medicalFolderMap;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, Patient> getPatientMap() {

		Map<String, Patient> patientMap = new HashMap<>();

		Patient patient = new Patient();

		patient.setMedicalFolder(getMedicalFolderMap().get(""));
		patient.setFirstName("Code");
		patient.setLastName("Burners");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");

		patientMap.put(patient.getLastName() + patient.getFirstName(), patient);
		patientMap.put(patient.getLastName() + patient.getFirstName() + "_bis", patient);

		return patientMap;
	}

	public static Map<String, Medication> getMedicationMap() {

		Map<String, Medication> medicationMap = new HashMap<>();

		Medication medication = new Medication();

		medication.setMedicationName("Doliprane");
		medication.setQuantity(1);
		medication.setDurationOfUse("3 weeks");
		medication.setInstrutionOfUse("oo");

		medicationMap.put("Doliprane", medication);

		return medicationMap;
	}

	/**
	 * @return the patientList
	 */
	public static Map<String, Doctor> getDoctorMap() {

		Map<String, Doctor> doctorMap = new HashMap<>();

		Doctor doctor = new Doctor();

		doctor.setFirstName("Ahmed");
		doctor.setLastName("BENANI");
		doctor.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		doctor.setBirthDate("01/01/1974");
		doctor.setPhone("+212 6 66 77 88 77");

		doctorMap.put(doctor.getLastName() + doctor.getFirstName(), doctor);

		return doctorMap;
	}

}
