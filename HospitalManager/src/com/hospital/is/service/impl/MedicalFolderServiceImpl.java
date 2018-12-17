package com.hospital.is.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.MedicalFolder;
import com.hospital.is.model.MedicalFolderDTO;
import com.hospital.is.service.MedicalFolderService;
import com.hospital.is.transformer.MedicalFolderConverter;

public class MedicalFolderServiceImpl extends ServiceImpl<MedicalFolderDTO> implements MedicalFolderService {

	private MedicalFolderConverter converter = new MedicalFolderConverter();

	@Override
	public Map<Long, MedicalFolderDTO> getAll() {

		Map<Long, MedicalFolder> map = StaticDatabase.getMedicalFolderMap();

		Map<Long, MedicalFolderDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));
		
		result.put(1l,converter.toDTO(map.get(1l)));
		

		return result;
	}

	@Override
	public MedicalFolderDTO create(MedicalFolderDTO t) {
		// TODO Auto-generated method stub
		return super.create(t);
	}

	@Override
	public MedicalFolderDTO getById(long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public MedicalFolderDTO update(MedicalFolderDTO t, long id) {
		// TODO Auto-generated method stub
		return super.update(t, id);
	}

}
