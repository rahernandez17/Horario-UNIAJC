package com.horariouniajc.services.api;

import java.util.List;

import com.horariouniajc.models.Materia;

public interface MateriaServiceAPI extends EntityServiceAPI<Materia, Integer> {
	
	public List<Materia> getAllByNombre(String nombre);
	
}
