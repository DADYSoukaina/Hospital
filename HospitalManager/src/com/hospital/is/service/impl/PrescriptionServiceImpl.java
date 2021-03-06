/**
 * 
 */
package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Prescription;
import com.hospital.is.model.PrescriptionDTO;
import com.hospital.is.service.PrescriptionService;
import com.hospital.is.transformer.PrescriptionConverter;

/**
 * @author user001
 *
 */
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionDTO> implements PrescriptionService{
	
	private PrescriptionConverter converter = new PrescriptionConverter();

	@Override
	public Map<Long, PrescriptionDTO> getAll() {

		Map<Long, Prescription> map = StaticDatabase.getPrescriptionMap();

		Map<Long, PrescriptionDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put(1l, converter.toDTO(map.get(1l)));

		return result;
	}
	
	public Prescription getPrescriptionById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Prescription CreatePrescription(Prescription prescription ) {
		return prescription; 
	}
	

	
	public Prescription UpdatePrescription(Prescription prescription , long id) {
		return prescription; 
	}



}
