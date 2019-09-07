package com.horariouniajc.services.api;

import java.util.List;

public interface EntityServiceAPI<T, ID> {
	
	void save(T object);
	
	void modify(T object);

	void delete(ID idObject);

	List<T> getAll();

	T getById(ID idObject);

	Boolean isExistObject(ID idObject);

}
