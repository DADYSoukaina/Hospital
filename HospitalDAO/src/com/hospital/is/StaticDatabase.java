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

	private static Long patientIndex;

	static Map<Long, Patient> patientMap = new HashMap<>();

	public static Map<Long, Object> getGenericMap(String key) {

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
	public static Map<Long, Disease> getDiseaseMap() {
		// List<Disease> diseaseList = new ArrayList<>();
		Map<Long, Disease> diseaseMap = new HashMap<Long, Disease>();

		Disease disease = new Disease();
		disease.setNature("gastro");
		disease.setDescription("gastro description");
		disease.setDiagDate("06/12/2018");

		diseaseMap.put(1l, disease);

		return diseaseMap;
	}

	public static Map<Long, Prescription> getPrescriptionMap() {
		Map<Long, Prescription> prescriptionMap = new HashMap<Long, Prescription>();
		Map<Long, Medication> medicationMap = new HashMap<Long, Medication>();

		Prescription prescription = new Prescription();

		prescription.setMedicationMap(medicationMap);
		prescription.setDescriptionOfUse("Description of use");

		prescriptionMap.put(1l, prescription);

		return prescriptionMap;
	}

	/**
	 * 
	 * @return
	 */
	public static Map<Long, Appointment> getAppointmentMap() {
		Map<Long, Appointment> appointmentMap = new HashMap<Long, Appointment>();
		Map<Long, Prescription> mapPrescription = new HashMap<Long, Prescription>();

		Appointment appointment = new Appointment();
		appointment.setDateTimeAppointment("12/12/2018");
		appointment.setDoctor(new Doctor());
		appointment.setPrescriptionMap(mapPrescription);
		appointment.setTypeAppointment("Consultation");

		appointmentMap.put(1l, appointment);

		return appointmentMap;
	}

	/**
	 * @return the medicalFolderList
	 */
	public static Map<Long, MedicalFolder> getMedicalFolderMap() {
		Map<Long, MedicalFolder> medicalFolderMap = new HashMap<Long, MedicalFolder>();
		MedicalFolder medicalFolder = new MedicalFolder();

		Map<Long, Prescription> mapPrescription = new HashMap<Long, Prescription>();
		Map<Long, Disease> mapDisease = new HashMap<Long, Disease>();
		Map<Long, Appointment> mapAppointment = new HashMap<Long, Appointment>();

		medicalFolder.setDiseaseMap(mapDisease);
		medicalFolder.setPrescriptionMap(mapPrescription);
		medicalFolder.setAppointmentMap(mapAppointment);

		medicalFolderMap.put(1l, medicalFolder);

		return medicalFolderMap;
	}

	/**
	 * @return the patientList
	 */
	public static Map<Long, Patient> getPatientMap() {

//		this patients will be added on each call f this method
		Patient patient = new Patient();

		patient.setMedicalFolder(getMedicalFolderMap().get(1l));
		patient.setFirstName("Code");
		patient.setLastName("Burners");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setBirthDate("01/01/1970");
		patient.setPhone("+212 6 66 77 88 99");
		
		Patient patient2 = new Patient();

		patient2.setMedicalFolder(getMedicalFolderMap().get(2L));
		patient2.setFirstName("chaam");
		patient2.setLastName("guet");
		patient2.setAddress("15 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient2.setBirthDate("01/01/1970");
		patient2.setPhone("+212 6 66 77 88 99");

		addPatient(patient);
		addPatient(patient2);
		

		return patientMap;
	}
	
	public static void addPatient(Patient p) {
		patientMap.put(++patientIndex,p);
	}

	public static Map<Long, Medication> getMedicationMap() {

		Map<Long, Medication> medicationMap = new HashMap<>();

		Medication medication = new Medication();

		medication.setMedicationName("Doliprane");
		medication.setQuantity(1);
		medication.setDurationOfUse("3 weeks");
		medication.setInstrutionOfUse("oo");

		medicationMap.put(1l, medication);

		return medicationMap;
	}

	/**
	 * @return the patientList
	 */
	public static Map<Long, Doctor> getDoctorMap() {

		Map<Long, Doctor> doctorMap = new HashMap<>();

		Doctor doctor = new Doctor();

		doctor.setFirstName("Ahmed");
		doctor.setLastName("BENANI");
		doctor.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		doctor.setBirthDate("01/01/1974");
		doctor.setPhone("+212 6 66 77 88 77");

		doctorMap.put(1l, doctor);

		return doctorMap;
	}

}
