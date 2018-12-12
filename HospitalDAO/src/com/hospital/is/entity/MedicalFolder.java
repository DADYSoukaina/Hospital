package com.hospital.is.entity;


import java.util.Map;

//import com.hospital.is.model.AppointmentD;
//import com.hospital.is.model.Disease;
//import com.hospital.is.model.Prescription;

public class MedicalFolder {

	private Map<String, Disease> diseaseMap;
	
	private Map<String, Prescription> prescriptionMap;
	
	private Map<String, Appointment> appointmentMap;


	/**
	 * @return the diseaseMap
	 */
	public Map<String, Disease> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap the diseaseMap to set
	 */
	public void setDiseaseMap(Map<String, Disease> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	

	/**
	 * @return the prescriptionMap
	 */
	public Map<String, Prescription> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionMap the prescriptionMap to set
	 */
	public void setPrescriptionMap(Map<String, Prescription> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}
	

	/**
	 * @return the appointmentMap
	 */
	public Map<String, Appointment> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentMap the appointmentMap to set
	 */
	public void setAppointmentMap(Map<String, Appointment> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolder [diseaseMap=" + diseaseMap + "]";
	}
	
	
}
