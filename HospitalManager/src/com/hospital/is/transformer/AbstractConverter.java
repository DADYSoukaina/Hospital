package com.hospital.is.transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractConverter<Entity, DTO> {

	public abstract DTO toDTO(Entity entity);

	public abstract Entity toEntity(DTO DTO);

	public Map<String, Entity> toMapEntity(Map<String, DTO> mapDTO) {
		Map<String, Entity> entityMap = new HashMap<String, Entity>();

		for (Entry<String, DTO> entry : mapDTO.entrySet()) {
			entityMap.put(entry.getKey(), toEntity(entry.getValue()));
		}

		return entityMap;
	}

	public Map<String, DTO> toMapDTO(Map<String, Entity> mapEntity) {
		Map<String, DTO> dtoMap = new HashMap<>();

		for (Entry<String, Entity> entry : mapEntity.entrySet()) {
			dtoMap.put(entry.getKey(), toDTO(entry.getValue()));
		}

		return dtoMap;
	}
}
