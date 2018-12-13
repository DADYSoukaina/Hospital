package com.hospital.is.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.PatientDao;
import com.hospital.is.entity.Patient;
//import com.hospital.is.transformer.PatientConverter;

public class PatientDaoImpl extends DaoImpl<Patient> implements PatientDao {

	@Override
	public Map<String, Patient> getAll() {

		Map<String, Patient> map = StaticDatabase.getPatientMap();

		Map<String, Patient> result = new HashMap<>();

		result.putAll(map);

		result.put("BurnersCode", map.get("BurnersCode"));

		return result;
	}

}
