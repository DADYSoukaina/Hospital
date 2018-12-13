package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.dao.PatientDao;
import com.hospital.is.dao.impl.PatientDaoImpl;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.transformer.PatientConverter;

public class PatientServiceImpl extends ServiceImpl<PatientDTO> implements PatientService {

	
	PatientDao patientDao = new PatientDaoImpl();
	
	
	
	private PatientConverter converter = new PatientConverter();

	@Override
	public Map<Long, PatientDTO> getAll() {

		Map<Long, Patient> map = patientDao.getAll();

		Map<Long, PatientDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put(1L, converter.toDTO(map.get(1L)));

		return result;
	}
	
	@Override
    public PatientDTO getById(long id) {
		
	Patient patient=patientDao.getById(id);
	return converter.toDTO(patient);
}

}