package com.hospital.is.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.PatientDao;
import com.hospital.is.entity.Patient;
//import com.hospital.is.transformer.PatientConverter;

public class PatientDaoImpl extends DaoImpl<Patient> implements PatientDao {

	@Override
	public Map<Long, Patient> getAll() {

		Map<Long, Patient> map = StaticDatabase.getPatientMap();

		Map<Long, Patient> result = new HashMap<>();

		result.putAll(map);

		result.put(1L, map.get(1L));

		return result;
	}

	@Override
	public Patient getById(long id) {

		Patient patient = StaticDatabase.getPatientMap().get(id);

		return patient;
	}

	@Override
	public Patient update(Patient t, long id) {

		Patient patient = StaticDatabase.getPatientMap().get(id);

		patient.setFirstName(t.getFirstName());
		patient.setLastName(t.getLastName());
		patient.setFirstName(t.getFirstName());
		patient.setAddress(t.getAddress());
		patient.setBirthDate(t.getBirthDate());
		patient.setPhone(t.getPhone());

		return patient;
	}

}
