package com.hospital.is.entity;

import java.util.Map;

//import com.hospital.is.model.MedicationDTO;

public class Prescription {

	private Map<Long, Medication> medicationMap;
	
	private String descriptionOfUse;


	/**
	 * @return the medicationMap
	 */
	public Map<Long, Medication> getMedicationMap() {
		return medicationMap;
	}

	/**
	 * @param medicationMap the medicationMap to set
	 */
	public void setMedicationMap(Map<Long, Medication> medicationMap) {
		this.medicationMap = medicationMap;
	}

	/**
	 * @return the descriptionOfUse
	 */
	public String getDescriptionOfUse() {
		return descriptionOfUse;
	}

	/**
	 * @param descriptionOfUse the descriptionOfUse to set
	 */
	public void setDescriptionOfUse(String descriptionOfUse) {
		this.descriptionOfUse = descriptionOfUse;
	}
	
	
}
