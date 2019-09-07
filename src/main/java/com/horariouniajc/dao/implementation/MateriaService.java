package com.horariouniajc.dao.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horariouniajc.dao.api.MateriaDaoAPI;
import com.horariouniajc.models.Materia;
import com.horariouniajc.services.api.MateriaServiceAPI;

@Service
public class MateriaService implements MateriaServiceAPI {

	@Autowired
	private MateriaDaoAPI materiaDaoAPI;

	@Override
	public void save(Materia object) {
		materiaDaoAPI.save(object);
	}

	@Override
	public void modify(Materia object) {
		materiaDaoAPI.save(object);
	}

	@Override
	public void delete(Integer idObject) {
		materiaDaoAPI.deleteById(idObject);
	}

	@Override
	public List<Materia> getAll() {
		List<Materia> materias = new ArrayList<>();
		materiaDaoAPI.findAll().forEach((Materia t) -> {
			materias.add(t);
		});
		return materias;
	}

	@Override
	public Materia getById(Integer idObject) {
		try {
			return materiaDaoAPI.findById(idObject).get();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Boolean isExistObject(Integer idObject) {
		return materiaDaoAPI.existsById(idObject);
	}

	@Override
	public List<Materia> getAllByNombre(String nombre) {
		return materiaDaoAPI.findByNombreStartingWith(nombre);
	}

}
