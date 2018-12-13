package com.hospital.is.model;


import java.util.Map;

public class MedicalFolderDTO {

	private Map<Long, DiseaseDTO> diseaseMap;
	
	private Map<Long, PrescriptionDTO> prescriptionMap;
	
	private Map<Long, AppointmentDTO> appointmentMap;


	/**
	 * @return the diseaseMap
	 */
	public Map<Long, DiseaseDTO> getDiseaseMap() {
		return diseaseMap;
	}

	/**
	 * @param diseaseMap the diseaseMap to set
	 */
	public void setDiseaseMap(Map<Long, DiseaseDTO> diseaseMap) {
		this.diseaseMap = diseaseMap;
	}
	

	/**
	 * @return the prescriptionMap
	 */
	public Map<Long, PrescriptionDTO> getPrescriptionMap() {
		return prescriptionMap;
	}

	/**
	 * @param prescriptionMap the prescriptionMap to set
	 */
	public void setPrescriptionMap(Map<Long, PrescriptionDTO> prescriptionMap) {
		this.prescriptionMap = prescriptionMap;
	}
	

	/**
	 * @return the appointmentMap
	 */
	public Map<Long, AppointmentDTO> getAppointmentMap() {
		return appointmentMap;
	}

	/**
	 * @param appointmentMap the appointmentMap to set
	 */
	public void setAppointmentMap(Map<Long, AppointmentDTO> appointmentMap) {
		this.appointmentMap = appointmentMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicalFolder [diseaseMap=" + getDiseaseMap() + ",appointmentMap= "+ getAppointmentMap()+",prescriptionMap="+getPrescriptionMap()+"]";
	}
	
	
}
