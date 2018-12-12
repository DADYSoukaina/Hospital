package com.hospital.is.model;


import java.util.Map;

public class MedicalFolderDTO {

	private Map<String, DiseaseDTO> diseaseMap;
	
	private Map<String, PrescriptionDTO> prescriptionMap;
	
	private Map<String, AppointmentDTO> appointmentMap;


	/**
	 * @return the diseaseMap
	 */
	public Map<String, DiseaseDTO> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap the diseaseMap to set
	 */
	public void setDiseaseMap(Map<String, DiseaseDTO> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	

	/**
	 * @return the prescriptionMap
	 */
	public Map<String, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionMap the prescriptionMap to set
	 */
	public void setPrescriptionMap(Map<String, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}
	

	/**
	 * @return the appointmentMap
	 */
	public Map<String, AppointmentDTO> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentMap the appointmentMap to set
	 */
	public void setAppointmentMap(Map<String, AppointmentDTO> appointmentMap) {
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
