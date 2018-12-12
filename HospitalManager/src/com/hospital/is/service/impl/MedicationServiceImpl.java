/**
 * 
 */
package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Medication;
import com.hospital.is.model.MedicationDTO;
import com.hospital.is.service.MedicationService;
import com.hospital.is.transformer.MedicationConverter;

/**
 * @author user001
 *
 */
public class MedicationServiceImpl  extends ServiceImpl<MedicationDTO> implements MedicationService {
	private MedicationConverter converter = new MedicationConverter();

	@Override
	public Map<String, MedicationDTO> getAll() {

		Map<String, Medication> map = StaticDatabase.getMedicationMap();

		Map<String, MedicationDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put("gastro", converter.toDTO(map.get("gastro")));

		return result;
	}
	
	public Medication getMedicationById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Medication CreateMedication(Medication medication ) {
		return medication; 
	}
	

	
	public Medication UpdateMedication(Medication medication , long id) {
		return medication; 
	}
	

}
