package com.hospital.is.entity;


import java.util.Map;

//import com.hospital.is.model.AppointmentD;
//import com.hospital.is.model.Disease;
//import com.hospital.is.model.Prescription;

public class MedicalFolder {

	private Map<Long, Disease> diseaseMap;
	
	private Map<Long, Prescription> prescriptionMap;
	
	private Map<Long, Appointment> appointmentMap;


	/**
	 * @return the diseaseMap
	 */
	public Map<Long, Disease> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap the diseaseMap to set
	 */
	public void setDiseaseMap(Map<Long, Disease> diseaseMap) {
		this.diseaseMap = diseaseMap;
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
	 * @return the appointmentMap
	 */
	public Map<Long, Appointment> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentMap the appointmentMap to set
	 */
	public void setAppointmentMap(Map<Long, Appointment> appointmentMap) {
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
