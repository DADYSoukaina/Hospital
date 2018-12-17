package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.MedicalFolderDao;
import com.hospital.is.dao.PatientDao;
import com.hospital.is.dao.impl.MedicalFolderImpl;
import com.hospital.is.dao.impl.PatientDaoImpl;
import com.hospital.is.entity.Patient;
import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.transformer.PatientConverter;

public class PatientServiceImpl extends ServiceImpl<PatientDTO> implements PatientService {

	PatientDao patientDao = new PatientDaoImpl();
	MedicalFolderDao medicalFolderDao = new MedicalFolderImpl();

	private PatientConverter converter = new PatientConverter();

	@Override
	public Map<Long, PatientDTO> getAll() {

		Map<Long, Patient> map = patientDao.getAll();

		Map<Long, PatientDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

//		result.put(1L, converter.toDTO(map.get(1L)));

		return result;
	}

	@Override
	public PatientDTO getById(long id) {

		Patient patient = patientDao.getById(id);
		return converter.toDTO(patient);
	}

	@Override
	public PatientDTO update(PatientDTO patient, long id) {
		for (Entry<Long, PatientDTO> entry : getAll().entrySet())
			if (entry.getKey() == id)
				entry.setValue(patient);
		return patient;
	}

	@Override
	public Map<Long, PatientDTO> delete(long id) {
		return converter.toMapDTO(patientDao.delete(id));
	}

//	
	@Override
	public PatientDTO create(PatientDTO patient) {
		return(converter.toDTO(patientDao.create(converter.toEntity(patient))));
	}

}