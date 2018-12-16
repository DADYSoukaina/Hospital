package com.hospital.is.dao;

import java.util.Map;

public interface Dao<T> {

	T create(T t);

	Map<Long, T> getAll();

	T getById(long id);

	T update(T t, long id);
	
	Map<Long, T> delete(long id);


}
