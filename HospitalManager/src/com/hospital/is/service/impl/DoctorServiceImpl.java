/**
 * 
 */
package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Doctor;
import com.hospital.is.model.DoctorDTO;
import com.hospital.is.service.DoctorService;
import com.hospital.is.transformer.DoctorConverter;

/**
 * @author user001
 *
 */
public class DoctorServiceImpl extends ServiceImpl<DoctorDTO> implements DoctorService {
	private DoctorConverter converter = new DoctorConverter();

	@Override
	public Map<String, DoctorDTO> getAll() {

		Map<String, Doctor> map = StaticDatabase.getDoctorMap();

		Map<String, DoctorDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put("BENANIAhmed", converter.toDTO(map.get("BENANIAhmed")));

		return result;
	}
	
	public Doctor getDoctorById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Doctor CreateDoctor(Doctor doctor ) {
		return doctor; 
	}
	

	
	public Doctor UpdateDoctor(Doctor doctor , long id) {
		return doctor; 
	}

}
