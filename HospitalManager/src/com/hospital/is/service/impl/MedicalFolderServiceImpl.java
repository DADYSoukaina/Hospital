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
	public Map<String, MedicalFolderDTO> getAll() {

		Map<String, MedicalFolder> map = StaticDatabase.getMedicalFolderMap();

		Map<String, MedicalFolderDTO> result = new HashMap<>();

		result.putAll(converter.toMapDTO(map));
		
		result.put("FolderID",converter.toDTO(map.get("FolderID")));
		

		return result;
	}

}
