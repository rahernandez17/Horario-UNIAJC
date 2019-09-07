package com.horariouniajc.dao.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.horariouniajc.models.Materia;

public interface MateriaDaoAPI extends CrudRepository<Materia, Integer>{
	
	public List<Materia> findByNombreStartingWith(String nombre);
	
}
