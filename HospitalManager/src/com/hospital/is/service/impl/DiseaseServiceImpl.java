package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Disease;
import com.hospital.is.model.DiseaseDTO;
import com.hospital.is.service.DiseaseService;
import com.hospital.is.transformer.DiseaseConverter;

/**
 * @author user001
 *
 */
public class DiseaseServiceImpl extends ServiceImpl<DiseaseDTO> implements DiseaseService {
	private DiseaseConverter converter = new DiseaseConverter();

	@Override
	public Map<Long, DiseaseDTO> getAll() {

		Map<Long, Disease> map = StaticDatabase.getDiseaseMap();

		Map<Long, DiseaseDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));

		result.put(1l, converter.toDTO(map.get(1l)));

		return result;
	}
	
	public Disease getDiseaseById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Disease CreateDisease(Disease disease ) {
		return disease; 
	}
	

	
	public Disease UpdateDisease(Disease disease , long id) {
		return disease; 
	}
	}


