package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
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
	public Map<String, PatientDTO> getAll() {

		Map<String, Patient> map = patientDao.getAll();

		Map<String, PatientDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put("BurnersCode", converter.toDTO(map.get("BurnersCode")));

		return result;
	}

}