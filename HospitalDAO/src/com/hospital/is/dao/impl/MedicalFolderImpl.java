package com.hospital.is.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.MedicalFolderDao;
import com.hospital.is.entity.MedicalFolder;

public class MedicalFolderImpl extends DaoImpl<MedicalFolder> implements MedicalFolderDao {
	@Override
	public Map<Long, MedicalFolder> getAll() {

		Map<Long, MedicalFolder> map = StaticDatabase.getMedicalFolderMap();

		Map<Long, MedicalFolder> result = new HashMap<>();

		result.putAll(map);

		result.put(1L, map.get(1L));

		return result;
	}

}
