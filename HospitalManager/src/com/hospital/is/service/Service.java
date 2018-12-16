package com.hospital.is.service;

import java.util.Map;

public interface Service<T> {
	
	T create(T t);

	Map<Long ,T> getAll();

	T getById(long id);

	// put
	T update(T t, long id);
	//delete method

	Map<Long ,T> delete( long id);


	//	boolean delete(long id);
}
