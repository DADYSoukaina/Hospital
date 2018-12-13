package com.hospital.is.entity;

import java.util.Map;

//import com.hospital.is.model.DoctorDTO;
//import com.hospital.is.model.PatientDTO;
//import com.hospital.is.model.PrescriptionDTO;

public class Appointment {
	private long id;


	private String dateTimeAppointment;

	private String typeAppointment;

	private Doctor doctor;

	private Patient patient;

	private Map<Long, Prescription> prescriptionMap;

	/**
	 * @return the dateTimeAppointment
	 */
	public String getDateTimeAppointment() {
		return dateTimeAppointment;
	}

	/**
	 * @param dateTimeAppointment the dateTimeAppointment to set
	 */
	public void setDateTimeAppointment(String dateTimeAppointment) {
		this.dateTimeAppointment = dateTimeAppointment;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the typeAppointment
	 */
	public String getTypeAppointment() {
		return typeAppointment;
	}

	/**
	 * @param typeAppointment the typeAppointment to set
	 */
	public void setTypeAppointment(String typeAppointment) {
		this.typeAppointment = typeAppointment;
	}

	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the prescriptionMap
	 */
	public Map<Long, Prescription> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionMap the prescriptionMap to set
	 */
	public void setPrescriptionMap(Map<Long, Prescription> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
