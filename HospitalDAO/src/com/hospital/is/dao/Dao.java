package com.hospital.is.dao;

import java.util.Map;

public interface Dao<T> {

	T create(T t);

	Map<String, T> getAll();

	T getById(long id);

	T update(T t, long id);

}
